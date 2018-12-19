package com.shubham.stack;

import java.util.Scanner;

public class Util {

	// this class is used to set data in setter method

	Scanner s;
	StackDao sd = new StackDao();

	protected String setData() {
		s = new Scanner(System.in);
		String data = "";

		System.out.println("Avilable choices for input type :-");

		System.out.println("1:-   String");
		System.out.println("2:-   Integer value");
		System.out.println("3:-   decimal value");

		System.out.println("Enter Your Choice:-");
		int choice = s.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Enter String  Element to be Inserted");
			sd.setStringData(s.next());

			data = sd.getStringData();
			break;

		case 2:
			System.out.println("Enter Integer  Element to be Inserted");
			sd.setIntData(s.nextInt());

			sd.getIntData();
			break;

		case 3:
			System.out.println("Enter Decimal  Element to be Inserted");
			sd.setFloatData(s.nextDouble());

		default:
			System.out.println("Invalid Input");

		}

		return data;

	}

}
