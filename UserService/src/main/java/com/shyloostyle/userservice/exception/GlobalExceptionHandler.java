package com.shyloostyle.userservice.exception;

import com.shyloostyle.userservice.payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> resourceNotFoundException(ResourceNotFoundException resourceNotFoundException){
        String message = resourceNotFoundException.getMessage();
        ApiResponse buildResponse = ApiResponse.builder().message(message).success(true).status(HttpStatus.NOT_FOUND).build();
        return new ResponseEntity<>(buildResponse,HttpStatus.NOT_FOUND);
    }
}
