package week_3java_homework;

public class Programme18 {
    public static void main(String[] args) {
        // Initialize array.
        int[] arr = {1, 2, 3, 4, 5};

        // Declare a variable to store the sum of the array elements.
        int sum = 0;

        // Iterate over the array and add each element to the sum variable.
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // Print the sum of the array elements.
        System.out.println("The sum of the array elements is: " + sum);
    }
}
