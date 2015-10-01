package com.stc.echannels.exceptions;

public class IntegrityViolationException extends RuntimeException {

	public IntegrityViolationException(String errorCode) {
		super(errorCode);
	}
}
