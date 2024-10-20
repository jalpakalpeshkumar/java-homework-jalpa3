package javaprogram;

/**
 *  input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 */

import java.util.Scanner;

public class StudentMarkSheet {

    public void m1() {
        Scanner scanner = new Scanner(System.in);

        // Input student details
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Roll No: ");
        String rollNo = scanner.nextLine();

        // Input marks and validate
        int mathMarks = getValidMarks(scanner, "Math");
        int scienceMarks = getValidMarks(scanner, "Science");
        int englishMarks = getValidMarks(scanner, "English");

        // Calculate total, percentage and result
        int total = mathMarks + scienceMarks + englishMarks;
        double percentage = (total / 3.0);
        String result = percentage >= 35 ? "Pass" : "Fail";
        String grade = getGrade(percentage);

        // Print Mark Sheet
        printMarkSheet(name, rollNo, mathMarks, scienceMarks, englishMarks, total, percentage, result, grade);

        scanner.close();
    }

    private static int getValidMarks(Scanner scanner, String subject) {
        int marks;
        while (true) {
            System.out.print("Enter " + subject + " Marks: ");
            marks = scanner.nextInt();
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid Input, Marks should be between 0 to 100");
            } else {
                break;
            }
        }
        return marks;
    }

    private static String getGrade(double percentage) {
        if (percentage >= 80) {
            return "A+";
        } else if (percentage >= 60) {
            return "A";
        } else if (percentage >= 50) {
            return "B";
        } else if (percentage >= 35) {
            return "C";
        } else {
            return "F"; // For failure, if needed
        }
    }

    private static void printMarkSheet(String name, String rollNo, int mathMarks, int scienceMarks, int englishMarks,
                                       int total, double percentage, String result, String grade) {
        System.out.println("_______________________________");
        System.out.println("|                             |");
        System.out.println("|          Mark Sheet         |");
        System.out.println("|_____________________________|");
        System.out.println("| Name : " + name + "           |");
        System.out.println("| Roll No : " + rollNo + "         |");
        System.out.println("|_____________________________|");
        System.out.println("| Subjects : Marks            |");
        System.out.println("|_____________________________|");
        System.out.println("| Math : " + mathMarks + "                |");
        System.out.println("| Science : " + scienceMarks + "            |");
        System.out.println("| English : " + englishMarks + "            |");
        System.out.println("|_____________________________|");
        System.out.println("| Total : " + total + "                |");
        System.out.println("|_____________________________|");
        System.out.printf("| Percentage : %.1f           |\n", percentage);
        System.out.println("| Result : " + result + "               |");
        System.out.println("| Grade : " + grade + "                 |");
        System.out.println("|_____________________________|");
    }

    public static void main(String[] args) {
        StudentMarkSheet obj = new StudentMarkSheet();
        obj.m1();
    }

}
