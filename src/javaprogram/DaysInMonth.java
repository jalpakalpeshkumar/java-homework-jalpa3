package javaprogram;

/**
 * getDaysInMonth with two parameter month and year. Both of type
 * int.
 * If parameter month is < 1 or >12 return -1.
 * If parameter year is <1 or >9999 than return -1.
 * This method needs to return the number of days in the month. Be careful about leap years
 * they have 29 days in month 2 (February).
 * You should check if the year is a leap year using the method isLeapYear describe above
 */

public class DaysInMonth {

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year) {
        // Check for valid month and year
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }

        switch (month) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                return 31;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                return 30;
            case 2: // February
                return isLeapYear(year) ? 29 : 28;
            default:
                return -1; // This case should not be reached due to earlier checks
        }
    }

    public static void main(String[] args) {
        // Example test cases
        System.out.println(getDaysInMonth(1, 2020)); // should return 31
        System.out.println(getDaysInMonth(2, 2020)); // should return 29
        System.out.println(getDaysInMonth(2, 2018)); // should return 28
        System.out.println(getDaysInMonth(-1, 2020)); // should return -1
        System.out.println(getDaysInMonth(1, -2020)); // should return -1
    }
}
