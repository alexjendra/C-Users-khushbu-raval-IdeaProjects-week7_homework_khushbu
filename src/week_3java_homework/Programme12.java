package week_3java_homework;

import java.util.Scanner;

public class Programme12 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a value: ");
        char input = scanner.next().charAt(0);

        if (Character.isDigit(input)) {
            System.out.println("The input is a number.");
        } else if (Character.isAlphabetic(input)) {
            System.out.println("The input is an alphabet.");
        } else {
            System.out.println("The input is a symbol.");
        }

        scanner.close();
    }
}
