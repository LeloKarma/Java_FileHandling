/*
Created by LeloKarma
  */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReplaceText {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the source file name: ");
        String sourceFileName = scanner.nextLine();
        System.out.print("Enter the text to be replaced: ");
        String targetText = scanner.nextLine(); // Text to be replaced
        System.out.print("Enter the new text: ");
        String replacementText = scanner.nextLine(); // New text

        try {
            File file = new File(sourceFileName);
            Scanner fileScanner = new Scanner(file);

            StringBuilder content = new StringBuilder();
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                content.append(line.replaceAll(targetText, replacementText)).append("\n");
            }
            fileScanner.close();

            FileWriter writer = new FileWriter(sourceFileName);
            writer.write(content.toString());
            writer.close();
            System.out.println("Text replaced and saved into the original file.");

        } catch (FileNotFoundException e) {
          System.out.println("File not found: " + sourceFileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }
    }
}
