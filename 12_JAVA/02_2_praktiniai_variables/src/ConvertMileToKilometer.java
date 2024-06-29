import java.util.Scanner;

public class ConvertMileToKilometer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter miles:");
        int mile = Integer.parseInt(scanner.nextLine());

        double kilometers = mile * 1.6;

        System.out.printf("%d miles is %.1f kilometers%n", mile, kilometers);
    }
}