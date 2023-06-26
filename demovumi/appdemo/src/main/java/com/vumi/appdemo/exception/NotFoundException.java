package com.vumi.appdemo.exception;

public class NotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public NotFoundException(String context) {
		super(context);
	}
}
