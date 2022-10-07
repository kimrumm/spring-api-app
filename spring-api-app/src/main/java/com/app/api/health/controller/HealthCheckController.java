package com.app.api.health.controller;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.api.health.dto.HealthCheckResponseDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class HealthCheckController {

	private final Environment environment; //생성자 주입 방식으로 주입

	@GetMapping("/health")
	public ResponseEntity<HealthCheckResponseDto> healthCheck() {

		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		HealthCheckResponseDto healthCheckResponseDto = HealthCheckResponseDto.builder()
			.health("ok")
			.activeProfiles(Arrays.asList(environment.getActiveProfiles()))
			.build();

		return ResponseEntity.ok(healthCheckResponseDto);
	}
}
