/* 

Name: Aurora Crippen

Date: November 8, 2026

Course: CSD 402 Java for Programmers

Assignment: Module 9.2 Assignment 

Purpose: Display String elements using a for-each loop and handle invalid
user selections while demonstrating autoboxing and auto-unboxing.

*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CrippenArrayListTest {

    /**
     * Displays the list and attempts to retrieve the user's selected index.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>(Arrays.asList(
                "Shirts", "Jeans", "Jackets", "Socks", "Shoes",
                "Hats", "Gloves", "Scarves", "Sweaters", "Pajamas"));

        System.out.println("Apparel collection:");
        int displayIndex = 0;
        for (String item : items) {
            System.out.println(displayIndex + ": " + item);
            displayIndex++;
        }

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("\nWhich element would you like to see again? Enter an index (0-9): ");
            String selection = input.nextLine();

            try {
                // parseInt returns int; assigning it to Integer uses autoboxing.
                Integer selectedIndex = Integer.parseInt(selection.trim());

                // get requires int, so selectedIndex is automatically unboxed.
                System.out.println("Selected element: " + items.get(selectedIndex));
            } catch (IndexOutOfBoundsException exception) {
                System.out.println("Exception thrown: Out of Bounds");
            } catch (NumberFormatException exception) {
                System.out.println("Exception thrown: Out of Bounds");
                System.out.println("Please enter a whole-number index from 0 to 9.");
            }
        }
    }
}
