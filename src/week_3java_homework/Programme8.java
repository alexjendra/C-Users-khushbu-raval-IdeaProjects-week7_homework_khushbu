package week_3java_homework;

import java.util.Scanner;

public class Programme8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an alphabet from A to F: ");
        char alphabet = scanner.next().charAt(0);

        if (alphabet == 'A' || alphabet == 'a') {
            System.out.println("The city name is Ahmedabad.");
        } else if (alphabet == 'B' || alphabet == 'b') {
            System.out.println("The city name is Bombay.");
        } else if (alphabet == 'C' || alphabet == 'c') {
            System.out.println("The city name is Chennai.");
        } else if (alphabet == 'D' || alphabet == 'd') {
            System.out.println("The city name is Delhi.");
        } else if (alphabet == 'E' || alphabet == 'e') {
            System.out.println("The city name is Eastgate.");
        } else if (alphabet == 'F' || alphabet == 'f') {
            System.out.println("The city name is Faridabad.");
        } else {
            System.out.println("Invalid entry.");
            scanner.close();
        }
    }
}
