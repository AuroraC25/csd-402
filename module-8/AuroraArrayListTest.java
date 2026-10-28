/* 

Name: Aurora Crippen

Date: October 27, 2026

Course: CSD 402 Java for Programmers

Assignment: Module 8.2 Assignment 

Purpose: Store user-entered integers in an ArrayList and find the largest
value. Test the max method with populated and empty lists.


*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AuroraArrayListTest {

    /**
     * Returns the largest Integer in the supplied list, or 0 if it is empty.
     *
     * @param list an ArrayList containing only non-null Integer values
     * @return the largest value, or 0 for an empty list
     */
    public static Integer max(ArrayList list) {
        if (list.isEmpty()) {
            return 0;
        }

        // Start with the first value so negative-only lists work correctly.
        Integer largest = (Integer) list.get(0);

        for (int i = 1; i < list.size(); i++) {
            Integer current = (Integer) list.get(i);
            if (current > largest) {
                largest = current;
            }
        }

        return largest;
    }

    /**
     * Displays and checks the result for one test case.
     *
     * @param values the integers to test
     * @param expected the expected largest value
     */
    private static void testMax(ArrayList<Integer> values, Integer expected) {
        Integer actual = max(values);

        System.out.println("List: " + values + " | Expected: " + expected
                + " | Actual: " + actual
                + " | " + (expected.equals(actual) ? "PASS" : "FAIL"));
    }

    /**
     * Runs additional tests, then collects and processes user input.
     *
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        System.out.println("Testing the max method:");
        testMax(new ArrayList<Integer>(), 0);
        testMax(new ArrayList<Integer>(Arrays.asList(4, 12, 7, 0)), 12);
        testMax(new ArrayList<Integer>(Arrays.asList(-8, -3, -12)), -3);
        testMax(new ArrayList<Integer>(Arrays.asList(-8, -3, 0)), -3);
        testMax(new ArrayList<Integer>(Arrays.asList(0)), 1);
        testMax(new ArrayList<Integer>(Arrays.asList(9, 9, 2, 0)), 4);

        ArrayList<Integer> numbers = new ArrayList<>();

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("\nEnter integers. Enter 0 to finish (0 is included).");

            int number;
            do {
                System.out.print("Enter an integer: ");

                // Discard invalid input and ask again.
                while (!input.hasNextInt()) {
                    System.out.print("Please enter a valid integer: ");
                    input.next();
                }

                number = input.nextInt();
                numbers.add(number);
            } while (number != 0);

            System.out.println("\nYour list: " + numbers);
            System.out.println("The largest value is: " + max(numbers));
        }
    }
}
