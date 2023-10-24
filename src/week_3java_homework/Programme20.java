package week_3java_homework;

public class Programme20 {
    public static boolean contains(int[] arr, int item) {
        for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};

        int valueToFind = 3;

        boolean containsValue = contains(myArray, valueToFind);

        if (containsValue) {
            System.out.println("The value " + valueToFind + " is found in the array.");
        } else {
            System.out.println("The value " + valueToFind + " is not found in the array.");
        }
    }
}
