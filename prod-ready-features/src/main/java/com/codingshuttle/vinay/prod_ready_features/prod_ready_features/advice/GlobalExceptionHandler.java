package com.codingshuttle.vinay.prod_ready_features.prod_ready_features.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.codingshuttle.vinay.prod_ready_features.prod_ready_features.exceptions.ResourceNotFoundException;
@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiError> handleResourceNotFoundException(ResourceNotFoundException exception){
		ApiError apiError=new ApiError(exception.getLocalizedMessage(),HttpStatus.NOT_FOUND);
	return new ResponseEntity<>(apiError,HttpStatus.NOT_FOUND);
	}
}
