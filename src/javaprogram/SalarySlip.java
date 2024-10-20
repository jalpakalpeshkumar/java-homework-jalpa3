package javaprogram;

/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 */

import java.util.Scanner;

public class SalarySlip {

    public void j2() {
        Scanner scanner = new Scanner(System.in);

        // Input employee details
        System.out.print("Enter Employee Id: ");
        int employeeId = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character
        System.out.print("Enter Employee Name: ");
        String employeeName = scanner.nextLine();
        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        // Calculate allowances and deductions
        double HRA = basicSalary * 0.10;
        double DA = basicSalary * 0.08;
        double TA = basicSalary * 0.09;
        double PF = basicSalary * 0.20;
        double grossSalary = basicSalary + HRA + TA + DA - PF;

        // Print salary slip
        System.out.println("\n_______________________________|");
        System.out.println("|          Salary Slip           |");
        System.out.println("|______________________________|");
        System.out.printf("| Employee Id : %d           |\n", employeeId);
        System.out.printf("| Employee Name : %s         |\n", employeeName);
        System.out.println("|______________________________|");
        System.out.printf("| Basic Salary : %.2f        |\n", basicSalary);
        System.out.printf("| HRA 10%% : %.2f            |\n", HRA);
        System.out.printf("| TA 9%% : %.2f              |\n", TA);
        System.out.printf("| DA 8%% : %.2f              |\n", DA);
        System.out.printf("| PF - 20%% : %.2f           |\n", PF);
        System.out.println("|______________________________|");
        System.out.printf("| Gross Salary : %.2f        |\n", grossSalary);
        System.out.println("|==============================|");

        scanner.close();
    }

    public static void main(String[] args) {
        SalarySlip t = new SalarySlip();
        t.j2();
    }
}
