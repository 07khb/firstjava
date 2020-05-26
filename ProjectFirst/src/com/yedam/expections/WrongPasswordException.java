package com.yedam.expections;

public class WrongPasswordException extends Exception {
	public WrongPasswordException() {

	}
	public WrongPasswordException(String message) {
		super(message);
	}
}
