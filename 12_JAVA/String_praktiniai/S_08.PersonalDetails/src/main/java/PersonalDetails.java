
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int sum = 0;
        int count = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] text = input.split(",");
            int ages = Integer.parseInt(text[1]);
            String names = text[0];

            if (names.length() > longestName.length()) {
                longestName = names;
            }
            sum += ages;
            count++;

        }
        System.out.printf("Longest name: %s%n", longestName);
        System.out.printf(Locale.US, "Average of the birth years: %.2f", (double) sum / count);
        scanner.close();
    }

}
