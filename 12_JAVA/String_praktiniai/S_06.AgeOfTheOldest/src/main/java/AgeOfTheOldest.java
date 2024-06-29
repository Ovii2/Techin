import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            String[] text = input.split(",");
            int age = Integer.parseInt(text[1]);

            if (age > max) {
                max = age;
            }
        }

        System.out.printf("Age of the oldest: %d", max);
    }
}
