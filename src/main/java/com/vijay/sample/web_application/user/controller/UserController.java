package com.vijay.sample.web_application.user.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vijay.sample.web_application.user.model.User;
import com.vijay.sample.web_application.user.service.UserCacheService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/user")
@Validated
public class UserController {

	private final UserCacheService userCacheService;

	public UserController(UserCacheService userCacheService) {
		this.userCacheService = userCacheService;
	}

	@PostMapping
	public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
		User cachedUser = userCacheService.put(user);
		return ResponseEntity.created(URI.create("/user/" + cachedUser.id())).body(cachedUser);
	}

	@GetMapping("/{id}")
	public ResponseEntity<User> getUser(@PathVariable String id) {
		return ResponseEntity.of(userCacheService.findById(id));
	}
}
