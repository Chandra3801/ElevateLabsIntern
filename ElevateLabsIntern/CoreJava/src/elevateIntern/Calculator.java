package elevateIntern;

import java.util.Scanner;

public class Calculator {
	// Addition
	public static double add(double a, double b) {
		return a + b;
	}

	// Subtraction
	public static double subtract(double a, double b) {
		return a - b;
	}

	// Multiplication
	public static double multiply(double a, double b) {
		return a * b;
	}

	// Division
	public static double divide(double a, double b) throws ArithmeticException {
		if (b == 0) {
			throw new ArithmeticException("Division by zero");
		}
		return a / b;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean keepRunning = true;

		System.out.println("----- Calculator -----");

		while (keepRunning) {
			System.out.println("\nChoose an operation:");
			System.out.println("1. Add");
			System.out.println("2. Subtract");
			System.out.println("3. Multiply");
			System.out.println("4. Divide");
			System.out.println("5. Exit");
			System.out.print("Enter your choice (1-5): ");

			int choice = scanner.nextInt();

			if (choice == 5) {
				keepRunning = false;
				System.out.println("Exiting calculator. Goodbye!");
				break;
			}

			System.out.print("Enter first number: ");
			double num1 = scanner.nextDouble();

			System.out.print("Enter second number: ");
			double num2 = scanner.nextDouble();

			double result = 0;
			try {
				switch (choice) {
				case 1:
					result = add(num1, num2);
					break;
				case 2:
					result = subtract(num1, num2);
					break;
				case 3:
					result = multiply(num1, num2);
					break;
				case 4:
					result = divide(num1, num2);
					break;
				default:
					System.out.println("Invalid choice. Please select between 1 and 5.");
					continue;
				}

				System.out.println("Result: " + result);
			} catch (ArithmeticException e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
		scanner.close();

	}

}
