package com.shyloostyle.HotelService.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Map<String,Object>> resourceNotFoundException(ResourceNotFoundException resourceNotFoundException){
        Map<String, Object> response = new HashMap<>();
        response.put("message", resourceNotFoundException.getMessage());
        response.put("status", HttpStatus.NOT_FOUND.value());
        response.put("error", false);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);

    }
}
