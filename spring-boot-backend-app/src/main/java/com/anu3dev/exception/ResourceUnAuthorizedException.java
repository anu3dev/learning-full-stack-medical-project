package com.anu3dev.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.UNAUTHORIZED)
public class ResourceUnAuthorizedException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public ResourceUnAuthorizedException(String message){
		super(message);
		System.out.println(message);
	}
}
