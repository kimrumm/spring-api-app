package com.app.api.health.dto;

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Builder
public class HealthCheckResponseDto {

	private String health;
	private List<String> activeProfiles;
}
