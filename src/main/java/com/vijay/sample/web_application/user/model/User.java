package com.vijay.sample.web_application.user.model;

import jakarta.validation.constraints.NotBlank;

public record User(
	@NotBlank(message = "id is required") String id,
	@NotBlank(message = "name is required") String name
) {
}
