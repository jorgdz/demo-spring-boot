package com.vumi.appdemo.exception;

public class BadRequestException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public BadRequestException ( String context ) {
		super(context);
	}
}
