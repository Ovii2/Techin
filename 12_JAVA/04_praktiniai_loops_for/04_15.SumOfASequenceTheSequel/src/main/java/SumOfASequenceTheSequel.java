
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number?");
        int num1 = Integer.parseInt(scanner.nextLine());

        System.out.println("First number?");
        int num2 = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = num1; i <= num2; i++) {
            sum += i;
        }
        System.out.printf("The sum is %d", sum);
        scanner.close();
    }
}
