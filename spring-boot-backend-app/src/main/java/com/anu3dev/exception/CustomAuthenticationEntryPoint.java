package com.anu3dev.exception;

import java.io.IOException;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class CustomAuthenticationEntryPoint implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response,
                         AuthenticationException authException) {
        try {
        	System.out.println("hey");
			response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
		} catch (IOException e) {
			System.out.println("hey1");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

	public Object getMessage() {
		// TODO Auto-generated method stub
		return null;
	}
}

