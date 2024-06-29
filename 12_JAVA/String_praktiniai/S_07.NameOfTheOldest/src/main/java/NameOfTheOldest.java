
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        String oldestName = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            String[] text = input.split(",");
            int age = Integer.parseInt(text[1]);
            if (age > max) {
                max = age;
                oldestName = text[0];
            }
        }
        System.out.printf("Name of the oldest: %s", oldestName);
    }

}

