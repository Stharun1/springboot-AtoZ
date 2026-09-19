package com.masterclass.gateway.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HealthResponse {
    private String serviceName;
    private String status;
    private int activePort;
    private LocalDateTime timestamp;
}
