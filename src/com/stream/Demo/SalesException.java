package com.stream.Demo;

public class SalesException extends Exception {
	public enum SalesExceptionType{
		NO_DATA_FOUND,INPUT_OUTPUT_ERROR,FILE_NOT_FOUND
	}
	public SalesExceptionType type;
	public SalesException(String message, SalesExceptionType type) {
		super(message);
		this.type = type;
	}

}
