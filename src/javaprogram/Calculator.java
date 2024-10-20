package javaprogram;

import java.util.Scanner;

/**
 *  any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */

public class Calculator {

    public void j1() {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Input the operator
        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        // Perform calculation based on the operator
        if (operator == '+') {
            result = num1 + num2;
            System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
        } else if (operator == '-') {
            result = num1 - num2;
            System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
        } else if (operator == '*') {
            result = num1 * num2;
            System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid operator. Please enter one of +, -, *, /.");
        }

        // Close the scanner
        scanner.close();
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.j1();
    }
}
