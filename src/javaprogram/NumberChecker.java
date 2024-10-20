package javaprogram;

import java.util.Scanner;

/**
 * check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */

public class NumberChecker {

    public void check() {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        // Check if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is POSITIVE.");
        } else if (number < 0) {
            System.out.println("The number is NEGATIVE.");
        } else {
            System.out.println("The number is ZERO.");
        }

        // Close the scanner
        scanner.close();
    }

    public static void main(String[] args) {
        NumberChecker j = new NumberChecker();
        j.check();
    }


}
