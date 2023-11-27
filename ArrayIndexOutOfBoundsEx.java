import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsEx {
    public static void main(String[] args) {
        // Create an array with 100 randomly chosen integers
        int[] randomArray = generateRandomArray(100);

        // Prompt the user to enter the index
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of the array (0 to 99): ");

        try {
            // Read the user input as an index
            int index = scanner.nextInt();

            // Check if the index is within bounds
            if (index >= 0 && index < 100) {
                // Display the corresponding element value
                int element = randomArray[index];
                System.out.println("The element at index " + index + " is: " + element);
            } else {
                // Display "Out of Bounds" message if the index is not within valid range
                System.out.println("Out of Bounds. Please enter an index between 0 and 99.");
            }
        } catch (Exception e) {
            // Handle non-integer input
            System.out.println("Invalid input. Please enter a valid integer index.");
        } finally {
            scanner.close();
        }
    }

    // Helper method to generate an array with 100 randomly chosen integers
    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000); // You can adjust the range of random integers as needed
        }

        return array;
    }
}
