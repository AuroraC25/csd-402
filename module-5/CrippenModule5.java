/* 

Name: Aurora Crippen

Date: October 11, 2026

Course: CSD 402 Java for Programmers

Assignment: Module 5.2 Assignment 

Purpose: Find the locations of the largest and smallest elements
in two-dimensional int and double arrays


*/


public class CrippenModule5 {

    /**
     * Finds the largest element in a double array.
     * @param arrayParam the two-dimensional array to search
     * @return the row and column of the largest element
     */
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = {0, 0};
        double largest = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int column = 0; column < arrayParam[row].length; column++) {
                if (arrayParam[row][column] > largest) {
                    largest = arrayParam[row][column];
                    location[0] = row;
                    location[1] = column;
                }
            }
        }

        return location;
    }

    /**
     * Finds the largest element in an int array.
     * @param arrayParam the two-dimensional array to search
     * @return the row and column of the largest element
     */
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = {0, 0};
        int largest = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int column = 0; column < arrayParam[row].length; column++) {
                if (arrayParam[row][column] > largest) {
                    largest = arrayParam[row][column];
                    location[0] = row;
                    location[1] = column;
                }
            }
        }

        return location;
    }

    /**
     * Finds the smallest element in a double array.
     * @param arrayParam the two-dimensional array to search
     * @return the row and column of the smallest element
     */
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = {0, 0};
        double smallest = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int column = 0; column < arrayParam[row].length; column++) {
                if (arrayParam[row][column] < smallest) {
                    smallest = arrayParam[row][column];
                    location[0] = row;
                    location[1] = column;
                }
            }
        }

        return location;
    }

    /**
     * Finds the smallest element in an int array.
     * @param arrayParam the two-dimensional array to search
     * @return the row and column of the smallest element
     */
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = {0, 0};
        int smallest = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int column = 0; column < arrayParam[row].length; column++) {
                if (arrayParam[row][column] < smallest) {
                    smallest = arrayParam[row][column];
                    location[0] = row;
                    location[1] = column;
                }
            }
        }

        return location;
    }

    public static void main(String[] args) {
        int[][] intArray = {
            {9, 25, 42},
            {404, 151, 1337},
            {31415926, 101, 8675309}
        };

        double[][] doubleArray = {
            {3.14159, 8.0085, 1.61803},
            {2.71828, 13.37, 299792.458}
        };

        int[] intLargest = locateLargest(intArray);
        int[] intSmallest = locateSmallest(intArray);
        int[] doubleLargest = locateLargest(doubleArray);
        int[] doubleSmallest = locateSmallest(doubleArray);

        System.out.println("Int Array:");
        for (int[] row : intArray) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        System.out.println("\nLargest element: "
                + intArray[intLargest[0]][intLargest[1]]);
        System.out.println("Location: Row " + intLargest[0]
                + ", Column " + intLargest[1]);

        System.out.println("\nSmallest element: "
                + intArray[intSmallest[0]][intSmallest[1]]);
        System.out.println("Location: Row " + intSmallest[0]
                + ", Column " + intSmallest[1]);

        System.out.println("\nDouble Array:");
        for (double[] row : doubleArray) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        System.out.println("\nLargest element: "
                + doubleArray[doubleLargest[0]][doubleLargest[1]]);
        System.out.println("Location: Row " + doubleLargest[0]
                + ", Column " + doubleLargest[1]);

        System.out.println("\nSmallest element: "
                + doubleArray[doubleSmallest[0]][doubleSmallest[1]]);
        System.out.println("Location: Row " + doubleSmallest[0]
                + ", Column " + doubleSmallest[1]);
    }
    
}
