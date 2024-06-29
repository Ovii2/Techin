
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Password?");
        String password = scan.nextLine();

        System.out.println(password.equals("Caput Draconis") ? "Welcome!" : "Off with you!");
    }
}
