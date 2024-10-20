package javaprogram;

import java.util.Scanner;

/**
 *  input any number between 1 to 7 and it print The Days
 * name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 * NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */

public class DaysOfWeek {

    public void b2() {
        Scanner scanner = new Scanner(System.in);

        // Input a number between 1 and 7
        System.out.print("Enter a number (1 to 7): ");
        int dayNumber = scanner.nextInt();

        // Determine the day of the week using switch
        switch (dayNumber) {
            case 1:
                System.out.println("The day is: MONDAY");
                break;
            case 2:
                System.out.println("The day is: TUESDAY");
                break;
            case 3:
                System.out.println("The day is: WEDNESDAY");
                break;
            case 4:
                System.out.println("The day is: THURSDAY");
                break;
            case 5:
                System.out.println("The day is: FRIDAY");
                break;
            case 6:
                System.out.println("The day is: SATURDAY");
                break;
            case 7:
                System.out.println("The day is: SUNDAY");
                break;
            default:
                System.out.println("Week contains 1 to 7 days.");
                break;
        }

        // Close the scanner
        scanner.close();
    }

    public static void main(String[] args) {
        DaysOfWeek s = new DaysOfWeek();
        s.b2();
    }
}
