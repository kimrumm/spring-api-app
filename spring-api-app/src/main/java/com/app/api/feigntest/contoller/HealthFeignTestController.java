package com.app.api.feigntest.contoller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.api.feigntest.client.HelloClient;
import com.app.api.health.dto.HealthCheckResponseDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class HealthFeignTestController {

	private final HelloClient helloClient;

	@GetMapping("/health/feign-test")
	public ResponseEntity<HealthCheckResponseDto> healthCheckTest() {
		HealthCheckResponseDto healthCheckResponseDto = helloClient.heathCheck();
		return ResponseEntity.ok(healthCheckResponseDto);
	}
}
