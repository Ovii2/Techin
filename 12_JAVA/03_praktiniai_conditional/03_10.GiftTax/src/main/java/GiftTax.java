
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of a gift?");
        double value = Double.parseDouble(scan.nextLine());

        if (value >= 1_000_000) {
            System.out.println("Tax: " + (142_100 + (value - 1_000_000) * 0.17));
        } else if (value >= 200_000) {
            System.out.println("Tax: " + (22_100 + (value - 200_000) * 0.15));
        } else if (value >= 55_000) {
            System.out.println("Tax: " + (4700 + (value - 55_000) * 0.12));
        } else if (value >= 25_000) {
            System.out.println("Tax: " + (1700 + (value - 25_000) * 0.1));
        } else if (value >= 5000) {
            System.out.println("Tax: " + (100 + (value - 5000) * 0.08));
        } else {
            System.out.println("No tax!");
        }
    }
}
