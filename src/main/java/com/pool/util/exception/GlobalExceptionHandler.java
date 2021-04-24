package com.pool.util.exception;

import java.util.Date;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.rest.util.model.UserNotFoundException;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler(Exception.class)
	protected ResponseEntity<ExceptionResponse> handleAllException(Exception ex) {
		ExceptionResponse response = new ExceptionResponse(new Date(), ex.getMessage(),"");
		return new ResponseEntity<ExceptionResponse>(response, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@ExceptionHandler(UserNotFoundException.class)
	protected ResponseEntity<ExceptionResponse> handleUserNotFounDException(Exception ex) {
		ExceptionResponse response = new ExceptionResponse(new Date(), ex.getMessage(), "");
		return new ResponseEntity<ExceptionResponse>(response, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	

}
