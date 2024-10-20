package javaprogram;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 * using switch statement.
 */

public class SwitchStatement {

    public static void alpha() {
        Scanner scanner = new Scanner(System.in);

        // Input an alphabet from A to F
        System.out.print("Enter an alphabet from A to F: ");
        char alphabet = scanner.next().charAt(0);

        // Determine the city name using a switch statement
        switch (Character.toUpperCase(alphabet)) {
            case 'A':
                System.out.println("City: Amsterdam");
                break;
            case 'B':
                System.out.println("City: Berlin");
                break;
            case 'C':
                System.out.println("City: Cairo");
                break;
            case 'D':
                System.out.println("City: Dublin");
                break;
            case 'E':
                System.out.println("City: Edinburgh");
                break;
            case 'F':
                System.out.println("City: Frankfurt");
                break;
            default:
                System.out.println("Invalid entry. Please enter a letter from A to F.");
                break;
        }

        // Close the scanner
        scanner.close();
    }

    public static void main(String[] args) {
        alpha();
    }
}
