package week_3java_homework;

public class Programme19 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Calculate the sum of all the elements in the array.
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Calculate the average by dividing the sum of the elements by the length of the array.
        double average = sum / numbers.length;

        // Print the average to the console.
        System.out.println("The average of the array elements is: " + average);
    }
}
