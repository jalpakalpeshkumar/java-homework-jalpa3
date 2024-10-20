package javaprogram;

import java.util.Scanner;

/**
 * test if an array contains a specific value
 */

public class ArrayContainsValue {

    public static void main(String[] args) {
        // Sample array
        int[] numbers = {5, 10, 15, 20, 25};

        // Input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value to search in the array: ");
        int valueToFind = scanner.nextInt();

        // Check if the array contains the specified value
        boolean containsValue = false;
        for (int number : numbers) {
            if (number == valueToFind) {
                containsValue = true;
                break;
            }
        }

        // Output the result
        if (containsValue) {
            System.out.println("The array contains the value: " + valueToFind);
        } else {
            System.out.println("The array does not contain the value: " + valueToFind);
        }

        // Close the scanner
        scanner.close();
    }


}
