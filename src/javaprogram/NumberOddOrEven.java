package javaprogram;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */

public class NumberOddOrEven {

    public void java() {
        Scanner scanner = new Scanner(System.in);

        // Input a number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is odd or even
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        // Close the scanner
        scanner.close();
    }

    public static void main(String[] args) {
        NumberOddOrEven c = new NumberOddOrEven();
        c.java();
    }
}
