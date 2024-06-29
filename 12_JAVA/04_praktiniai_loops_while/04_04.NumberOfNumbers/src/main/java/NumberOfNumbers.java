
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int counter = 0;

        while (true) {
            System.out.println("Give a number:");
            int num = Integer.parseInt(scanner.nextLine());
            if (num == 0) {
                break;
            } else {
                counter++;
            }
        }
        System.out.println("Number of numbers: " + counter);
    }
}
