/*
Exercise 12.14
Created by lelokarma
*/

// Process scores in a text file

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProcessScores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);

            int total = 0;
            while (fileScanner.hasNext()) {
                int score = fileScanner.nextInt();
                total += score;
            }
            
            System.out.println("Total score: " + total);
            fileScanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
    }
}
