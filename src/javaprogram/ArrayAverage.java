package javaprogram;

/**
 * calculate the average value of array elements
 */

public class ArrayAverage {

    public void value() {
        // Sample array
        double[] numbers = {2, 4, 5, 6, 8};

        // Calculate the sum of the array
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }

        // Calculate the average
        double average = sum / numbers.length;

        // Print the result
        System.out.println("The average value of the array is: " + average);
    }

    public static void main(String[] args) {
        ArrayAverage obj = new ArrayAverage();
        obj.value();
    }
}
