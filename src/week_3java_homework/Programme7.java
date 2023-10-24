package week_3java_homework;

import java.util.Scanner;

public class Programme7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter sales ID: ");
        int salesId = scanner.nextInt();

        System.out.println("Enter seller name: ");
        String sellerName = scanner.next();

        System.out.println("Enter sales amount: ");
        double salesAmount = scanner.nextDouble();

        System.out.println("Enter salary basic: ");
        double salaryBasic = scanner.nextDouble();

        double commissionRate;
        double commission;

        if (salesAmount >= 50000) {
            commissionRate = 0.35;
        } else if (salesAmount >= 30000) {
            commissionRate = 0.2;
        } else if (salesAmount >= 20000) {
            commissionRate = 0.1;
        } else if (salesAmount >= 10000) {
            commissionRate = 0.05;
        } else {
            commissionRate = 0.02;
        }

        commission = salesAmount * commissionRate;

        double totalSalary = salaryBasic + commission;

        System.out.println("Sales ID: " + salesId);
        System.out.println("Seller Name: " + sellerName);
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Salary Basic: " + salaryBasic);
        System.out.println("Commission Rate: " + commissionRate);
        System.out.println("Commission: " + commission);
        System.out.println("Total Salary: " + totalSalary);
        scanner.close();
    }
}
