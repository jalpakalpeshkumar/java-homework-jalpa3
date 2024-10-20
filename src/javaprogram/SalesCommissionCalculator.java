package javaprogram;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */

public class SalesCommissionCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sales details
        System.out.print("Enter Sales ID: ");
        int salesId = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Enter Seller's Name: ");
        String sellerName = scanner.nextLine();
        System.out.print("Enter Sales Amount: ");
        double salesAmount = scanner.nextDouble();
        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        // Calculate commission
        double commission = calculateCommission(salesAmount);

        // Print results
        System.out.println("\n_______________________________");
        System.out.println("| Sales Commission Slip       |");
        System.out.println("|_____________________________|");
        System.out.printf("| Sales ID : %d              |\n", salesId);
        System.out.printf("| Seller's Name : %s         |\n", sellerName);
        System.out.printf("| Sales Amount : %.2f        |\n", salesAmount);
        System.out.printf("| Basic Salary : %.2f        |\n", basicSalary);
        System.out.printf("| Commission : %.2f          |\n", commission);
        System.out.println("|_____________________________|");

        // Close the scanner
        scanner.close();
    }

    public static double calculateCommission(double salesAmount) {
        if (salesAmount >= 50000) {
            return salesAmount * 0.35; // 35%
        } else if (salesAmount >= 30000) {
            return salesAmount * 0.20; // 20%
        } else if (salesAmount >= 20000) {
            return salesAmount * 0.10; // 10%
        } else if (salesAmount >= 10000) {
            return salesAmount * 0.05; // 5%
        } else {
            return salesAmount * 0.02; // 2%
        }
    }


}
