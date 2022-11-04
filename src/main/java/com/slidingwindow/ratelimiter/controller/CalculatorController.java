package com.slidingwindow.ratelimiter.controller;

import com.slidingwindow.ratelimiter.dto.CalculatorRequestDto;
import com.slidingwindow.ratelimiter.dto.CalculatorResponseDto;
import com.slidingwindow.ratelimiter.entity.Calculator;
import com.slidingwindow.ratelimiter.service.CalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/calculator")
@RequiredArgsConstructor
public class CalculatorController {

    private final CalculatorService calculatorService;

    @PostMapping("/add")
    public ResponseEntity<CalculatorResponseDto> add(@RequestBody CalculatorRequestDto calculatorRequestDto) {
        return ResponseEntity.ok(calculatorService.add(calculatorRequestDto));
    }

    @PostMapping("/subtract")
    public ResponseEntity<CalculatorResponseDto> subtract(@RequestBody CalculatorRequestDto calculatorRequestDto) {
        return ResponseEntity.ok(calculatorService.subtract(calculatorRequestDto));
    }

    @PostMapping("/multiply")
    public ResponseEntity<CalculatorResponseDto> multiply(@RequestBody CalculatorRequestDto calculatorRequestDto) {
        return ResponseEntity.ok(calculatorService.multiply(calculatorRequestDto));
    }

    @PostMapping("/divide")
    public ResponseEntity<CalculatorResponseDto> divide(@RequestBody CalculatorRequestDto calculatorRequestDto) {
        return ResponseEntity.ok(calculatorService.divide(calculatorRequestDto));
    }
}
