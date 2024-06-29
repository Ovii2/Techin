
import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a number:");
        int num = Integer.parseInt(scan.nextLine());

        System.out.println(num <= 0 ? "The number is not positive." : "The number is positive.");
    }
}
