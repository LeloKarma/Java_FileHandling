/*
Exercise 12.15
Created by Lelokarma
*/

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class WriteReadData {

    public static void main(String[] args) {
        String fileName = "Exercise12_15.txt";
        int[] data = new int[100];

        // Generate random integers
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            data[i] = random.nextInt(1000);
        }

        // Write data to the file
        try {
            FileWriter writer = new FileWriter(fileName);
            for (int i = 0; i < data.length; i++) {
                writer.write(String.valueOf(data[i]));
                if (i < data.length - 1) {
                    writer.write(" ");
                }
            }
            writer.close();
            System.out.println("Data written to the file: " + Arrays.toString(data));

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }

        // Read data back from the file and display in increasing order
        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);

            int[] readData = new int[100];
            int index = 0;
            while (fileScanner.hasNext()) {
                readData[index] = Integer.parseInt(fileScanner.next());
                index++;
            }

            Arrays.sort(readData);
            System.out.println("Data read from the file (in increasing order): " + Arrays.toString(readData));
            fileScanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
    }
}
