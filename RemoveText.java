/*
Created by LeloKarma
  */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RemoveText {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java RemoveText <"lelo"> <names.txt>");
            System.exit(1);
        }

        String textToRemove = args[0];
        String filename = args[1];

        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            StringBuilder sb = new StringBuilder();

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                line = line.replaceAll(textToRemove, "");
                sb.append(line).append("\n");
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }
    }
}
