
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int num = Integer.parseInt(scanner.nextLine());
            if (num == 0) {
                break;
            } else {
                numbers++;
                sum += num;
            }
        }
        System.out.printf("Number of numbers: %d", numbers);
        System.out.printf("Sum of the numbers: %d", sum);
    }
}
