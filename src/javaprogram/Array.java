package javaprogram;

import java.util.Arrays;

/**
 * sort a numeric array and a string array.
 */

public class Array {

    public static void b2() {
        // Numeric array
        int[] numericArray = {5, 2, 8, 1, 3};
        System.out.println("Original Numeric Array: " + Arrays.toString(numericArray));

        // Sorting the numeric array
        Arrays.sort(numericArray);
        System.out.println("Sorted Numeric Array: " + Arrays.toString(numericArray));

        // String array
        String[] stringArray = {"Banana", "Apple", "Mango", "Cherry", "Date"};
        System.out.println("Original String Array: " + Arrays.toString(stringArray));

        // Sorting the string array
        Arrays.sort(stringArray);
        System.out.println("Sorted String Array: " + Arrays.toString(stringArray));
    }

    public static void main(String[] args) {
        b2();
    }


}
