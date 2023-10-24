package week_3java_homework;

import java.util.Scanner;

public class Programme9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an alphabet from A to F: ");
        char alphabet = scanner.next().charAt(0);

        switch (alphabet) {
            case 'A':
                System.out.println("City name: Ahmedabad");
                break;
            case 'B':
                System.out.println("City name: Bangalore");
                break;
            case 'C':
                System.out.println("City name: Chennai");
                break;
            case 'D':
                System.out.println("City name: Delhi");
                break;
            case 'E':
                System.out.println("City name: Ernakulam");
                break;
            case 'F':
                System.out.println("City name: Faridabad");
                break;
            default:
                System.out.println("Invalid entry");
        }
    }
}
