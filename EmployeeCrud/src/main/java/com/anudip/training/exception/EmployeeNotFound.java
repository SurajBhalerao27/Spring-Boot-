package com.anudip.training.exception;

public class EmployeeNotFound extends Exception{
	String s;
	public EmployeeNotFound(String string) {
		s=string;
	}

	private static final long serialVersionUID = 1L;
}
