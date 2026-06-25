package com.pawni.ecommerce.Exception;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;

import java.util.Map;

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(
            Exception.class
    )

    public ResponseEntity<Map<String,String>>
    handleException(
            Exception ex
    ) {

        Map<String,String> error =
                new HashMap<>();

        error.put(
                "message",
                ex.getMessage()
        );

        error.put(
                "status",
                "FAILED"
        );

        return new ResponseEntity<>(

                error,

                HttpStatus.INTERNAL_SERVER_ERROR
        );
    }
}