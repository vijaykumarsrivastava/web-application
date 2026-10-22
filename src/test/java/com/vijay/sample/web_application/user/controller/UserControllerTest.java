package com.vijay.sample.web_application.user.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import com.vijay.sample.web_application.user.model.User;
import com.vijay.sample.web_application.user.service.UserCacheService;

class UserControllerTest {

	private MockMvc mockMvc;

	private UserCacheService userCacheService;

	@BeforeEach
	void setUp() {
		userCacheService = new UserCacheService(3);
		UserController userController = new UserController(userCacheService);

		LocalValidatorFactoryBean validator = new LocalValidatorFactoryBean();
		validator.afterPropertiesSet();

		mockMvc = MockMvcBuilders.standaloneSetup(userController)
				.setValidator(validator)
				.build();
	}

	@Test
	void shouldCreateAndCacheUser() throws Exception {
		String payload = """
				{
				  \"id\": \"user-1\",
				  \"name\": \"Alice\"
				}
				""";

		mockMvc.perform(post("/user")
				.contentType(MediaType.APPLICATION_JSON)
				.content(payload))
				.andExpect(status().isCreated())
				.andExpect(header().string("Location", "/user/user-1"))
				.andExpect(jsonPath("$.id").value("user-1"))
				.andExpect(jsonPath("$.name").value("Alice"));

		assertThat(userCacheService.findById("user-1")).contains(new User("user-1", "Alice"));
	}

	@Test
	void shouldReturnBadRequestWhenIdIsBlank() throws Exception {
		String invalidPayload = """
				{
				  \"id\": \"\",
				  \"name\": \"Alice\"
				}
				""";

		mockMvc.perform(post("/user")
				.contentType(MediaType.APPLICATION_JSON)
				.content(invalidPayload))
				.andExpect(status().isBadRequest());
	}

	@Test
	void shouldReturnUserWhenUserExists() throws Exception {
		userCacheService.put(new User("user-2", "Bob"));

		mockMvc.perform(get("/user/{id}", "user-2"))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.id").value("user-2"))
				.andExpect(jsonPath("$.name").value("Bob"));
	}

	@Test
	void shouldReturnNotFoundWhenUserDoesNotExist() throws Exception {
		mockMvc.perform(get("/user/{id}", "missing-user"))
				.andExpect(status().isNotFound());
	}
}
