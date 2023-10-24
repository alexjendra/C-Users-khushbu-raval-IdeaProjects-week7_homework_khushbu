package week_3java_homework;

import java.util.Scanner;

public class Programme16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println(number + " is a POSITIVE number.");
        } else if (number < 0) {
            System.out.println(number + " is a NEGATIVE number.");
        } else {
            System.out.println(number + " is a ZERO.");
        }
    }
}
