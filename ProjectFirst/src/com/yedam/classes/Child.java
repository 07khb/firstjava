package com.yedam.classes;

import com.yedam.classes.inherit.Parent;

public class Child extends Parent {
	Child() {
		super();
	}
	
	Child(String LastName, String FirstName, String telNumber) {
		super(LastName, FirstName, telNumber);
	}
		
		
	void showInfo() {
		Child child = new Child();
		child.getLastName(); //default
		child.getFirstName(); //protected
		child.getTelNumber(); //public
	}
}
