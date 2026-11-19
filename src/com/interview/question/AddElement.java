package com.interview.question;

public class AddElement {
	
	int rollNo;
	String name;

	public AddElement(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Roll No : " + rollNo + " Name : " + name;
	}
}
