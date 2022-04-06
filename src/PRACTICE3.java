
//1. Create a method that would allow a user to enter 2 values IN AN ARRAY and compute it (add, subtract, multiply, divide) 
//through series of method.
//Your main method should only look like this:
//public static void main(String[] args){
//     Compute(); }

import java.util.*;

public class PRACTICE3 {

	public static void main(String[] args) {
		calculate();
	}

	public static int sum(int a, int b) {
		int add = a + b;
		return add;
	}

	public static int diff(int a, int b) {
		int minus = a - b;
		return minus;

	}

	public static int prod(int a, int b) {
		int multiply = a * b;
		return multiply;
	}

	public static int quotient(int a, int b) {
		int div = a / b;
		return div;
	}

	public static void calculate() {
		Scanner input = new Scanner(System.in);
		int[] result = new int[2];
		System.out.print("Input value: ");
		result[0] = input.nextInt();
		input.nextLine();
		System.out.print("Input value: ");
		result[1] = input.nextInt();
		input.nextLine();
		System.out.println("The sum is: " + sum(result[0], result[1]));
		System.out.println("The difference is: " + diff(result[0], result[1]));
		System.out.println("The product is: " + prod(result[0], result[1]));
		System.out.println("The quotient is: " + quotient(result[0], result[1]));

	}
}
