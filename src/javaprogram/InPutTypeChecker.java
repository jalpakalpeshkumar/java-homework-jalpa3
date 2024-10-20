package javaprogram;

import java.util.Scanner;

/**
 *  tells us input value is number or an alphabet or symbol
 */

public class InPutTypeChecker {

    public void input() {
        Scanner scanner = new Scanner(System.in);

        // Input value
        System.out.print("Enter a single character: ");
        String input = scanner.nextLine();

        // Check if the input is valid
        if (input.length() != 1) {
            System.out.println("Please enter only a single character.");
        } else {
            char ch = input.charAt(0);

            // Determine the type of input
            if (Character.isDigit(ch)) {
                System.out.println("The input is a number.");
            } else if (Character.isLetter(ch)) {
                System.out.println("The input is an alphabet.");
            } else {
                System.out.println("The input is a symbol.");
            }
        }

        // Close the scanner
        scanner.close();
    }

    public static void main(String[] args) {
        InPutTypeChecker obj = new InPutTypeChecker();
        obj.input();
    }
}
