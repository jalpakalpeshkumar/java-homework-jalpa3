package javaprogram;

/**
 * print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately.
 */

public class DivisibleNumbers {

    public static void a2() {
        System.out.println("Numbers between 1 and 100 that are divisible by 3:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nNumbers between 1 and 100 that are divisible by 5:");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        a2();
    }
}
