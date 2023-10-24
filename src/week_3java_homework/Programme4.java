package week_3java_homework;

import java.util.Scanner;

public class Programme4 {
    public static void main(String[] args) {
        // Creating scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        System.out.print("Enter a month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter a year: ");
        int yearForMonth = scanner.nextInt();

        int daysInMonth = getDaysInMonth(month, yearForMonth);

        // Scanner closing
        scanner.close();

        if (daysInMonth == -1) {
            System.out.println("Invalid input for month or year.");
        } else {
            System.out.println("Number of days in month " + month + " of year " + yearForMonth + ": " + daysInMonth);
        }
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }

        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }

        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeapYear(year) && month == 2) {
            return 29;
        } else {
            return daysInMonth[month];
 }
}

}
