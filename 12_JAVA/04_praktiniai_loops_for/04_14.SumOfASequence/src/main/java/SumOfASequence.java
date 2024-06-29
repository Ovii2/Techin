
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Last number?");
        int num = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = 0; i <=num; i++) {
           sum +=i;
        }
        System.out.printf("The sum is: %d", sum);
        scanner.close();
    }
}
