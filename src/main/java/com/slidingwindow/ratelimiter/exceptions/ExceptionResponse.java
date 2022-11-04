package com.slidingwindow.ratelimiter.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;


@Data
@AllArgsConstructor
public class ExceptionResponse {
    private Date errorDate;
    private String errorMessage;
    private String errorDetails;
}
