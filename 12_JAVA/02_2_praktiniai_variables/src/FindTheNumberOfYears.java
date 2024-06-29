import java.util.Scanner;

public class FindTheNumberOfYears {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of minutes");
        int minutes = Integer.parseInt(scanner.nextLine());

        int years = minutes / 525_600;
        int days = (minutes % 525_600) / 1440;

        System.out.printf("%d minutes is approximately %d years and %d days ", minutes, years, days);
    }
}
