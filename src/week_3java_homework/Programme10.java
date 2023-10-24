package week_3java_homework;

import java.util.Scanner;

public class Programme10 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Get two numbers from the user
        System.out.println("Enter two numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // Ask the user to enter an operation symbol
        System.out.println("Enter an operation symbol (+, -, /, *): ");
        char operation = scanner.next().charAt(0);

        // Perform the operation based on the user input
        int result;
        if (operation == '+') {
            result = num1 + num2;
        } else if (operation == '-') {
            result = num1 - num2;
        } else if (operation == '*') {
            result = num1 * num2;
        } else if (operation == '/') {
            result = num1 / num2;
        } else {
            System.out.println("Invalid operation symbol!");
            return;
        }
        // Print the result
        System.out.println("The result is: " + result);
        scanner.close();
    }
}
