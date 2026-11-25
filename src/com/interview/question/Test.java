package com.interview.question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	
	public static void main(String[] args) {
	 
		List<AddElement> ad = Arrays.asList(new AddElement(1, "Nini"),
				new AddElement(2, "kaustubh"));
		
		List<AddElement> a1 = ad.stream().filter(n -> n.rollNo <= 2).collect(Collectors.toList());
		
		System.out.println(a1);

		System.out.println("Hello from developer 1");

		System.out.println("Hello from developer 2");
		
		System.out.println("Git Pull Practice - Developer 2");
		
		System.out.println("Product Search Feature");
	}

}