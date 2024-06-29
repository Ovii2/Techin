
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here.
        System.out.println("Give speed:");
        int speed = Integer.parseInt(scanner.nextLine());

        System.out.println(speed > 120 ? "Speeding ticket!" : "");
    }
}
