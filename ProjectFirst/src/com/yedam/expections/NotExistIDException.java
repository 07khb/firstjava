package com.yedam.expections;

public class NotExistIDException extends Exception{
	public NotExistIDException() {
	}
	public NotExistIDException(String message) {
		super(message);
	}
}
