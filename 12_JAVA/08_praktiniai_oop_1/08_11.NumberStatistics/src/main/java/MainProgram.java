
import java.util.Locale;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();
        Statistics statisticsEven = new Statistics();
        Statistics statisticsOdd = new Statistics();
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        System.out.println("Enter numbers:");
        while (true) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input == -1) {
                System.out.printf("Count: %d%n", statistics.getCount());
                System.out.printf("Sum: %d%n", statistics.sum());
                System.out.printf(Locale.US, "Average: %.2f%n", statistics.average());
                System.out.printf("Sum of even numbers: %d%n", statisticsEven.sum());
                System.out.printf("Sum of odd numbers: %d%n", statisticsOdd.sum());
                break;
            } else {
                if (input % 2 == 0) {
                    statisticsEven.addNumber(input);
                }
                if (input % 2 != 0) {
                    statisticsOdd.addNumber(input);
                }
                statistics.addNumber(input);

            }
        }
    }
}
