package week_3java_homework;

import java.util.Arrays;

public class Programme17 {
    public static void main(String[] args) {
        // Declare and initialize the numeric and string arrays.
        int[] numericArray = {5, 3, 2, 1, 4};
        String[] stringArray = {"Bob", "Mary", "Joe", "Alice", "Carol"};

        // Sort the numeric array in ascending order.
        Arrays.sort(numericArray);

        // Sort the string array in ascending order.
        Arrays.sort(stringArray);

        // Print the sorted arrays.
        System.out.println("Sorted numeric array: " + Arrays.toString(numericArray));
        System.out.println("Sorted string array: " + Arrays.toString(stringArray));
    }
}
