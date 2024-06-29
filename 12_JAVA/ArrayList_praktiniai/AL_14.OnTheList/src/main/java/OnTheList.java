import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            list.add(input);
        }

        System.out.println("Search for?");

        for (int i = 0; i < list.size(); i++) {
            String search = scanner.nextLine();
            if (search.equals("")) {
                break;
            }

            if (list.contains(search)) {
                System.out.printf("%s was found!%n", search);
            } else {
                System.out.printf("%s was not found!%n", search);
            }
            break;
        }
        scanner.close();
    }
}
