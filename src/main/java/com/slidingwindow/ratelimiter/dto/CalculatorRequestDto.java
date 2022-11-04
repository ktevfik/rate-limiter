package com.slidingwindow.ratelimiter.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CalculatorRequestDto {
    private int left;
    private int right;
}
