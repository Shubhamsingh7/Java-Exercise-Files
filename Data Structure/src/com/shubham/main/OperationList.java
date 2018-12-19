/**
 * 
 */
package com.shubham.main;

import java.util.Scanner;

import com.shubham.stack.Stack;

/**
 * @author Shubham singh
 *
 */
public class OperationList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Avilable choices for Data Structure are:-");

		System.out.println("1:-   Stack");
		System.out.println("2:-   Linked List");
		System.out.println("3:-   Queue");
		System.out.println("4:-   Tree");
		System.out.println("5:-   Map");
		System.out.println("6:-   Hash");

		System.out.println("Enter Your Choice:-");

		Scanner s = new Scanner(System.in);

		final int choice = s.nextInt();

		String more;
		do {

			switch (choice) {

			case 1:

				Stack.main(s);

			case 2:

				// goto Linked Package

			case 3:

				// goto Queue Package

			case 4:

				// goto Tree Package

			case 5:

				// goto Map package

			case 6:
				// goto Hash Package

			default:

				System.out.println("Invalid Input ");

			}

			System.out.println("Want to Do it again   then press y  otherwise  n ");

			more = s.next();

		} while (more.equalsIgnoreCase("y"));

		s.close();

	}

}
