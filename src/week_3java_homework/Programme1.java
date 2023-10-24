package week_3java_homework;

import java.util.Scanner;

public class Programme1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        String result = (number % 2 == 0) ? "The number is even." : "The number is odd.";
        System.out.println(result);
        scanner.close();
    }
}