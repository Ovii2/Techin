
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int num1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int num2 = Integer.parseInt(scanner.nextLine());

        int add = num1 + num2;
        int subtr = num1 - num2;
        int mult = num1 * num2;
        double div = (double) num1 / num2;

        System.out.println(num1 + " + " + num2 + " = " + add);
        System.out.println(num1 + " - " + num2 + " = " + subtr);
        System.out.println(num1 + " * " + num2 + " = " + mult);
        System.out.println(num1 + " / " + num2 + " = " + div);
    }
}
