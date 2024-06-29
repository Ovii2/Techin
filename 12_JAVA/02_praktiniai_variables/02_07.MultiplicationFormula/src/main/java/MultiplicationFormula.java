
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int firstNum = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the first number:");
        int secondNum = Integer.parseInt(scanner.nextLine());

        int result = firstNum * secondNum;
        System.out.println(firstNum + " * " + secondNum + " = " + result);
    }
}
