package com.slidingwindow.ratelimiter.service;

import com.slidingwindow.ratelimiter.dao.CalculatorDao;
import com.slidingwindow.ratelimiter.dto.CalculatorRequestDto;
import com.slidingwindow.ratelimiter.dto.CalculatorResponseDto;
import com.slidingwindow.ratelimiter.entity.Calculator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class CalculatorService {

    private final CalculatorDao calculatorDao;

    public CalculatorResponseDto add(CalculatorRequestDto calculatorRequestDto) {
        Calculator calculator = new Calculator();
        calculator.setOperation("ADD");
        calculator.setResult(calculatorRequestDto.getLeft() + calculatorRequestDto.getRight());
        calculatorDao.save(calculator);
        return new CalculatorResponseDto(calculator.getResult());
    }

    public CalculatorResponseDto subtract(CalculatorRequestDto calculatorRequestDto) {
        Calculator calculator = new Calculator();
        calculator.setOperation("SUBTRACT");
        calculator.setResult(calculatorRequestDto.getLeft() - calculatorRequestDto.getRight());
        calculatorDao.save(calculator);
        return new CalculatorResponseDto(calculator.getResult());
    }

    public CalculatorResponseDto multiply(CalculatorRequestDto calculatorRequestDto) {
        Calculator calculator = new Calculator();
        calculator.setOperation("MULTIPLY");
        calculator.setResult(calculatorRequestDto.getLeft() * calculatorRequestDto.getRight());
        calculatorDao.save(calculator);
        return new CalculatorResponseDto(calculator.getResult());
    }

    public CalculatorResponseDto divide(CalculatorRequestDto calculatorRequestDto) {
        Calculator calculator = new Calculator();
        calculator.setOperation("DIVIDE");
        try {
            calculator.setResult(calculatorRequestDto.getLeft() / calculatorRequestDto.getRight());
        } catch (ArithmeticException e) {
            calculator.setResult(0);
            throw new ArithmeticException("Cannot divide by zero");
        }
        calculatorDao.save(calculator);
        return new CalculatorResponseDto(calculator.getResult());
    }
}
