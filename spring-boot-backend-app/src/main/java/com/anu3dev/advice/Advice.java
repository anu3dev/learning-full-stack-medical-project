package com.anu3dev.advice;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.anu3dev.exception.CustomAuthenticationEntryPoint;
import com.anu3dev.exception.ResourceNotFoundException;
import com.anu3dev.exception.ResourceUnAuthorizedException;
import com.anu3dev.model.APIErrorDetails;

@RestControllerAdvice
public class Advice {
	@ExceptionHandler(Exception.class)
    public ResponseEntity<APIErrorDetails> handleAllProblem(Exception e){
		APIErrorDetails details = new APIErrorDetails(LocalDateTime.now(), e.getMessage(), "INTERNAL_SERVER_ERROR-500");
    	return new ResponseEntity<APIErrorDetails>(details, HttpStatus.INTERNAL_SERVER_ERROR);
    }
	
	@ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<APIErrorDetails> handleDataNotFound(ResourceNotFoundException e){
		APIErrorDetails details = new APIErrorDetails(LocalDateTime.now(), e.getMessage(), "DATA_NOT_FOUND_ERROR-404");
    	return new ResponseEntity<APIErrorDetails>(details, HttpStatus.NOT_FOUND);
    }
	
	@ExceptionHandler(ResourceUnAuthorizedException.class)
	public ResponseEntity<APIErrorDetails> resourseUnAuthorized(ResourceNotFoundException e){
		APIErrorDetails details = new APIErrorDetails(LocalDateTime.now(), e.getMessage(), "NOT_AUTHORIZED_ERROR");
    	return new ResponseEntity<APIErrorDetails>(details, HttpStatus.UNAUTHORIZED);
	}
	
//	@ExceptionHandler(CustomAuthenticationEntryPoint.class)
    public ResponseEntity<Object> handleAuthenticationException(CustomAuthenticationEntryPoint ex) {
		System.out.println("heu");
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(ex.getMessage());
    }

    @ExceptionHandler(AccessDeniedException.class)
    public ResponseEntity<String> handleAccessDeniedException(AccessDeniedException ex) {
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(ex.getMessage());
    }
}
