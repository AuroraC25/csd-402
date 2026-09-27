/* 

Name: Aurora Crippen

Date: September 26, 2026

Course: CSD 402 Java for Programmers

Assignment: Module 3.2 Assignment 

Purpose: This program uses nested loops to display 
a pyramid pattern with the @ symbol vertically aligned.


*/



import java.util.Scanner;

public class crippen_mod_3_csd402 {

public static void main(String[] args) {

        int rows = 7;
        int atColumn = 44;

        // First build the longest row to know total width
        String maxRow = "";
        int value = 1;

        for (int i = 1; i <= rows; i++) {
            maxRow += value + " ";
            value *= 2;
        }
        value /= 4;
        for (int i = 1; i < rows; i++) {
            maxRow += value + " ";
            value /= 2;
        }

        int maxWidth = maxRow.length();

        // Build each row of the pyramid
        for (int i = 1; i <= rows; i++) {

            String row = "";
            value = 1;

            // Ascending values
            for (int j = 1; j <= i; j++) {
                row += value + " ";
                value *= 2;
            }

            // Descending values
            value /= 4;
            for (int j = 1; j < i; j++) {
                row += value + " ";
                value /= 2;
            }

            // Center the pyramid
            int leadingSpaces = (maxWidth - row.length()) / 2;

            for (int s = 0; s < leadingSpaces; s++) {
                System.out.print(" ");
            }

            System.out.print(row);

            // Keep @ aligned
            int currentLength = leadingSpaces + row.length();

            for (int s = currentLength; s < atColumn; s++) {
                System.out.print(" ");
            }

            System.out.println("@");
        }
    }
}
