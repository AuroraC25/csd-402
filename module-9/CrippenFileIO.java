/* 

Name: Aurora Crippen

Date: November 8, 2026

Course: CSD 402 Java for Programmers

Assignment: Module 9.2 Assignment 

Purpose: Create data.file if needed, append ten random integers separated
by spaces, close the file, and reopen it to display all its data.

*/

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class CrippenFileIO {

    /**
     * Appends ten integers from 1 through 100 and reads the entire file.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        File dataFile = new File("data.file");
        Random random = new Random();

        try {
            // Append mode creates the file if it does not already exist.
            boolean hasExistingData = dataFile.exists() && dataFile.length() > 0;
            try (PrintWriter output = new PrintWriter(new FileWriter(dataFile, true))) {
                // Separate new numbers from any previously stored final number.
                if (hasExistingData) {
                    output.print(" ");
                }
                for (int i = 0; i < 10; i++) {
                    if (i > 0) {
                        output.print(" ");
                    }
                    output.print(random.nextInt(100) + 1);
                }
                // PrintWriter records write failures instead of throwing them.
                if (output.checkError()) {
                    throw new IOException("Unable to write all numbers to data.file.");
                }
            }

            // The writer is closed before the file is reopened for reading.
            System.out.println("Added 10 random integers to data.file.");
            System.out.println("\nAll numbers in data.file:");
            try (Scanner input = new Scanner(dataFile)) {
                while (input.hasNextLine()) {
                    System.out.println(input.nextLine());
                }
                if (input.ioException() != null) {
                    throw input.ioException();
                }
            }
        } catch (IOException exception) {
            System.out.println("File I/O exception: " + exception.getMessage());
        }
    }
}
