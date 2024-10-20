package javaprogram;

/**
 * method isLeapYear with a parameter of type int named year.
 * The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
 * If the parameter is not in that range return false.
 * Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
 * otherwise return false.
 * A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
 */

public class NumberOfDayInMonth1 {

    public static boolean isLeapYear(int year) {
        // Check if the year is in the valid range
        if (year < 1 || year > 9999) {
            return false;
        }

        // Determine if the year is a leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // Example test cases
        System.out.println(isLeapYear(-1600)); // should return false
        System.out.println(isLeapYear(1600));  // should return true
        System.out.println(isLeapYear(2017));  // should return false
        System.out.println(isLeapYear(2000));  // should return true
    }
}
