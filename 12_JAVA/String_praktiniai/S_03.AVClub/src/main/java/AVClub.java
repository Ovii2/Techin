
import java.util.Arrays;
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] newText = input.split(" ");
            for (int i = 0; i < newText.length; i++) {
                if (newText[i].contains("av")) {
                    System.out.println(newText[i]);
                }
            }
        }
    }
}
