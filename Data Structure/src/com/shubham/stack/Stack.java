package com.shubham.stack;

import java.util.Scanner;

public class Stack {

	public static void main(Scanner obj) {

		System.out.println("Avilable Operations for Stack are:-");

		System.out.println("1:-   Push");
		System.out.println("2:-   Pop");
		System.out.println("3:-   Peep");
		System.out.println("4:-   Traverse");

		final int choice;

		System.out.println("Enter Your Choice:-");

		choice = obj.nextInt();

		String more;
		do {
			Model md = new Model();
			Util u = new Util();
			switch (choice) {

			case 1:

				md.push(u.setData());

				break;

			case 2:

				md.pop();
				break;

			case 3:

				// call for peep

			case 4:

				// call for Traverse

			default:

				System.out.println("Invalid Input ");

			}

			System.out.println("Want to Do it again   then press y  otherwise  n ");

			more = obj.next();

		} while (more.equalsIgnoreCase("y"));

	}

}
