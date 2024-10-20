package javaprogram;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
public class CityNameByAlphabet {

    public static void name() {
        Scanner scanner = new Scanner(System.in);

        // Input an alphabet from A to F
        System.out.print("Enter an alphabet from A to F: ");
        char alphabet = scanner.next().charAt(0);

        // Determine the city name based on the input alphabet
        if (alphabet == 'A' || alphabet == 'a') {
            System.out.println("City: Amsterdam");
        } else if (alphabet == 'B' || alphabet == 'b') {
            System.out.println("City: Berlin");
        } else if (alphabet == 'C' || alphabet == 'c') {
            System.out.println("City: Cairo");
        } else if (alphabet == 'D' || alphabet == 'd') {
            System.out.println("City: Dublin");
        } else if (alphabet == 'E' || alphabet == 'e') {
            System.out.println("City: Edinburgh");
        } else if (alphabet == 'F' || alphabet == 'f') {
            System.out.println("City: Frankfurt");
        } else {
            System.out.println("Invalid entry. Please enter a letter from A to F.");
        }

        // Close the scanner
        scanner.close();
    }

    public static void main(String[] args) {
        name();
    }
}
