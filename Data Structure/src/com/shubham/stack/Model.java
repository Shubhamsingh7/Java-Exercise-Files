package com.shubham.stack;

public class Model {

	 String[] array ;
	static int top = -1;

	 void push(String s) {

		if (top == 4) {
			System.out.println("Stack is full: Stack Over Flow Condition");
		}

		else {
			top = top + 1;
			 array = new String[5];
			array[top] = s;
			System.out.println("Element Inserted is " + s + " at index " + top);
			

		}

	}

	// method overloading

 void push(double d) {

	}

	// method overloading
	protected void push(int i) {

	}

	protected String pop() {

		String data = "no data";

		if (top == -1) {
			System.out.println("Stack is Empty!!!");
		}

		else {
			 array = new String[5];
			data = array[top];

			System.out.println("Poped Element is  " + data + " at index " + top);
			top = top - 1;

		}
		return data;
	}

}
