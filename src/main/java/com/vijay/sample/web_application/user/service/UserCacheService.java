package com.vijay.sample.web_application.user.service;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.vijay.sample.web_application.user.model.User;

@Service
public class UserCacheService {

	private static final int DEFAULT_CAPACITY = 5;

	private final Map<String, User> cache;

	public UserCacheService() {
		this(DEFAULT_CAPACITY);
	}

	public UserCacheService(int capacity) {
		if (capacity < 1) {
			throw new IllegalArgumentException("capacity must be greater than 0");
		}
		this.cache = Collections.synchronizedMap(new LinkedHashMap<>(capacity, 0.75f, true) {
			@Override
			protected boolean removeEldestEntry(Map.Entry<String, User> eldest) {
				return size() > capacity;
			}
		});
	}

	public User put(User user) {
		cache.put(user.id(), user);
		return user;
	}

	public Optional<User> findById(String id) {
		return Optional.ofNullable(cache.get(id));
	}

	int size() {
		return cache.size();
	}

	boolean contains(String id) {
		return cache.containsKey(id);
	}
}
