
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String usr1 = "alex";
        String pass1 = "sunshine";

        String usr2 = "emma";
        String pass2 = "haskell";

        System.out.println("Enter username:");
        String userName = scanner.nextLine();

        System.out.println("Enter password:");
        String password = scanner.nextLine();

        if (usr1.equals(userName) && pass1.equals(password) || usr2.equals(userName) && pass2.equals(password)) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password");
        }

    }
}
