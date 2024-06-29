package lt.techin.praktinis;

import java.util.Arrays;

public class ArraysTask2D {

    /**
     * Returns the maximum value in the 2D array arr.
     *
     * @param arr The 2D array to be processed.
     * @return The maximum value in the array.
     */
    public static int max(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    /**
     * Returns the sum of the elements in Row x of arr.
     *
     * @param arr The 2D array to be processed.
     * @param x   The row index.
     * @return The sum of elements in the specified row.
     */
    public static int rowSum(int[][] arr, int x) {
        int rowSum = 0;
        for (int i = 0; i < arr[x].length; i++) {
            rowSum += arr[x][i];
        }
        return rowSum;
    }

    /**
     * Returns the sum of the elements in Column x of arr.
     *
     * @param arr The 2D array to be processed.
     * @param x   The column index.
     * @return The sum of elements in the specified column.
     */
    public static int columnSum(int[][] arr, int x) {
        int columnSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (x < arr[i].length) {
                columnSum += arr[i][x];
            }
        }
        return columnSum;
    }

    /**
     * Calculates the row sum for every row in arr and returns each of the values in an array.
     *
     * @param arr The 2D array to be processed.
     * @return An array containing the sum of elements in each row.
     */
    public static int[] allRowSums(int[][] arr) {
        int[] result = new int[arr.length];
        int allRowSum;

        for (int i = 0; i < arr.length; i++) {
            allRowSum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                allRowSum += arr[i][j];
            }
            result[i] = allRowSum;
        }
        return result;
    }

    /**
     * Checks if the array arr is row-magic, which means that every row has the same row sum.
     *
     * @param arr The 2D array to be processed.
     * @return True if the array is row-magic, false otherwise.
     */
    public static boolean isRowMagic(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr[0].length; i++) {
            sum += arr[0][i];
        }

        for (int i = 1; i < arr.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                rowSum += arr[i][j];
            }
            if (rowSum != sum) return false;
        }

        return true;
    }

    /**
     * Checks if the array arr is column-magic, which means that every column has the same column sum.
     *
     * @param arr The 2D array to be processed.
     * @return True if the array is column-magic, false otherwise.
     */
    public static boolean isColumnMagic(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][0];
        }


        for (int i = 0; i < arr.length; i++) {
            int colSum = 0;
            for (int j = 0; j < arr.length; j++) {
                colSum += arr[i][j];
            }
            return colSum == sum;
        }
        return true;
    }

    /**
     * Checks if the array arr is square, i.e., every row has the same length as arr itself.
     *
     * @param arr The 2D array to be processed.
     * @return True if the array is square, false otherwise.
     */
    public static boolean isSquare(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr.length != arr[i].length) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks if the array arr is a magic square, meaning it is square, and all row sums, column sums,
     * and the two diagonal-sums are equal.
     *
     * @param arr The 2D array to be processed.
     * @return True if the array is a magic square, false otherwise.
     */
    public static boolean isMagic(int[][] arr) {
        throw new UnsupportedOperationException();
    }

    /**
     * Checks to see if the array arr is a Latin square, meaning it must be square, and each row and each column
     * must contain the values 1, 2, ..., n with no repeats.
     *
     * @param arr The 2D array to be processed.
     * @return True if the array is a Latin square, false otherwise.
     */
    public static boolean isLatin(int[][] arr) {
        throw new UnsupportedOperationException();
    }

    /**
     * Checks to see if the array arr is square and contains each of the digits from 1 to n*n, e.g., 1, 2, ..., 16 for a 4 x 4 array.
     *
     * @param arr The 2D array to be processed.
     * @return True if the array is a sequence, false otherwise.
     */
    public static boolean isSequence(int[][] arr) {
        throw new UnsupportedOperationException();
    }


}
