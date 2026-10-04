/* 

Name: Aurora Crippen

Date: October 2, 2026

Course: CSD 402 Java for Programmers

Assignment: Module 4.2 Assignment 

Purpose: Demonstrate four overloaded average methods using arrays of
 different types and sizes. Display each original array and its average.
 Integer averages discard the fractional part (truncate toward zero).


*/

import java.util.Arrays;

public class CrippenModule4 {

    /**
     * Returns the average of a nonempty short array.
     * @param array the values to average
     * @return the average as a short, with the fractional part discarded
     */
    public static short average(short[] array) {
        long sum = 0;
        for (short value : array) {
            sum += value;
        }
        return (short) (sum / array.length);
    }

    /**
     * Returns the average of a nonempty int array.
     * @param array the values to average
     * @return the average as an int, with the fractional part discarded
     */
    public static int average(int[] array) {
        long sum = 0;
        for (int value : array) {
            sum += value;
        }
        return (int) (sum / array.length);
    }

    /**
     * Returns the average of a nonempty long array.
     * The sum of the supplied values must fit within the long range.
     * @param array the values to average
     * @return the average as a long, with the fractional part discarded
     */
    public static long average(long[] array) {
        long sum = 0;
        for (long value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    /**
     * Returns the average of a nonempty double array.
     * @param array the values to average
     * @return the average as a double, retaining fractional values
     */
    public static double average(double[] array) {
        double sum = 0.0;
        for (double value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    /**
     * Tests every overload with a different array length.
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        short[] shortArray = {9, 25, 42};
        int[] intArray = {25, 42, 404, 1337};
        long[] longArray = {2147483648L, 3141592653L, 404404404404L, 999999999999L, 1234567890123L};
        double[] doubleArray = {1.61803, 2.71828, 3.14159, 8.0085, 13.37, 299792.458};
        
        System.out.println("Module 4.2: Overloaded Array Averages");
        System.out.println("====================================");
        System.out.println();

        System.out.println("Short Array");
        System.out.println("Elements: " +
            Arrays.toString(shortArray).replace("[", "").replace("]", ""));
        System.out.println("Average: " + average(shortArray));
        System.out.println();

        System.out.println("Int Array");
        System.out.println("Elements: " +
            Arrays.toString(intArray).replace("[", "").replace("]", ""));
        System.out.println("Average: " + average(intArray));
        System.out.println();

        System.out.println("Long Array");
        System.out.println("Elements: " +
            Arrays.toString(longArray).replace("[", "").replace("]", ""));
        System.out.println("Average: " + average(longArray));
        System.out.println();

        System.out.println("Double Array");
        System.out.println("Elements: " +
            Arrays.toString(doubleArray).replace("[", "").replace("]", ""));
        System.out.println("Average: " + average(doubleArray));
    }
}
