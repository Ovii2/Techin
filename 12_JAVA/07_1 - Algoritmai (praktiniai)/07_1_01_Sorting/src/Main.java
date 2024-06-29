import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // write testcode here
        int[] values = {6, 5, 8, 7, 11};
        System.out.printf("Smallest: %d%n", smallest(values));
        System.out.printf("Index of the smallest: %d%n", indexOfTheSmallest(values));

        int[] values2 = {-1, 6, 9, 8, 12};
        System.out.println(indexOfTheSmallestStartingFrom(values2, 1));
        System.out.println(indexOfTheSmallestStartingFrom(values2, 2));
        System.out.println(indexOfTheSmallestStartingFrom(values2, 4));

        int[] values3 = {3, 2, 5, 4, 8};
        System.out.println(Arrays.toString(values3));

        swap(values3, 1, 0);
        System.out.println(Arrays.toString(values3));

        swap(values3, 0, 3);
        System.out.println(Arrays.toString(values3));

        int[] values4 = {8, 3, 7, 9, 1, 2, 4};

        System.out.print("Before sort: ");
        for (int i = 0; i < values4.length; i++) {
            System.out.printf("%d ", values4[i]);
        }
        sort(values4);
        System.out.println();
        System.out.print("After sort: ");
        for (int i = 0; i < values4.length; i++) {
            System.out.printf("%d ", values4[i]);
        }
    }

    public static int smallest(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int indexOfTheSmallest(int[] array) {
        int index = -1;
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int min = array[index];
        for (int i = index + 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
