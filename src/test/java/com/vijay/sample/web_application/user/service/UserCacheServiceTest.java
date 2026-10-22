package com.vijay.sample.web_application.user.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.vijay.sample.web_application.user.model.User;

class UserCacheServiceTest {

	@Test
	void shouldEvictLeastRecentlyUsedUserWhenCapacityExceeded() {
		UserCacheService cacheService = new UserCacheService(2);

		cacheService.put(new User("u1", "Alex"));
		cacheService.put(new User("u2", "Blake"));
		cacheService.findById("u1");
		cacheService.put(new User("u3", "Chris"));

		assertThat(cacheService.contains("u1")).isTrue();
		assertThat(cacheService.contains("u2")).isFalse();
		assertThat(cacheService.contains("u3")).isTrue();
		assertThat(cacheService.size()).isEqualTo(2);
	}
}
