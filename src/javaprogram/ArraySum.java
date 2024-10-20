package javaprogram;

/**
 * sum values of an array.
 */

public class ArraySum {

    public static void main(String[] args) {
        // Sample array
        int[] numbers = {5, 10, 15, 20, 25};

        // Calculate the sum of the array
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        // Print the result
        System.out.println("The sum of the array is: " + sum);
    }
}
