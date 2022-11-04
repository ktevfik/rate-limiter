package com.slidingwindow.ratelimiter.dao;

import com.slidingwindow.ratelimiter.entity.Calculator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalculatorDao extends JpaRepository<Calculator, Long> {
}
