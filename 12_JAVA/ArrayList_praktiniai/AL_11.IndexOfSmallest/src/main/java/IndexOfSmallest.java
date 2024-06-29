
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        // implement here a program that reads user input
        // until the user enters 9999
        while (true) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input == 9999) {
                break;
            }
            list.add(input);
        }
        System.out.printf("Smallest number: %d%n", Collections.min(list));

        int index = Collections.min(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == index) {
                System.out.printf("Found at index: %d%n", i);
            }
        }
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

    }
}
