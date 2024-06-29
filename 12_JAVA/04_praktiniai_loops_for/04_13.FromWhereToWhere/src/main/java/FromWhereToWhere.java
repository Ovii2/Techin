
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int numTo = Integer.parseInt(scanner.nextLine());

        System.out.println("where from?");
        int numFrom = Integer.parseInt(scanner.nextLine());

        for (int i = numFrom; i <=numTo ; i++) {
            System.out.println(i);
        }
        scanner.close();
    }
}
