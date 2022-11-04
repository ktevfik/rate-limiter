package com.slidingwindow.ratelimiter.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "CALCULATOR")
public class Calculator {

    @Id
    @SequenceGenerator(name = "Calculator", sequenceName = "CALCULATOR_ID_SEQ")
    @GeneratedValue(generator = "Calculator")
    private long id;

    @Column(name = "OPERATION")
    private String operation;

    @Column(name = "RESULT")
    private int result;
}
