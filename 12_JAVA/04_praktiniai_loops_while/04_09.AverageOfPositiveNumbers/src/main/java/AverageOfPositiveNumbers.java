
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int num = Integer.parseInt(scanner.nextLine());
            if (num == 0) {
                break;
            }
            if (num > 0) {
                numbers++;
                sum += num;
            }
        }
        if (numbers > 0) {
            double positiveAverage = (double) sum / numbers;
            System.out.println("Average of the numbers: " + positiveAverage);
        } else {
            System.out.println("Cannot calculate the average.");
        }
    }
}
