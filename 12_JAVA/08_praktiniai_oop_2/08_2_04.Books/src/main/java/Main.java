import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.println("Title: ");
            String title = input.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.parseInt(input.nextLine());
            System.out.println("Publication year: ");
            int pubYear = Integer.parseInt(input.nextLine());
            Book newBook = new Book(title, pages, pubYear);
            books.add(newBook);
        }
        System.out.println("What information will be printed?");
        String userAnswer = input.nextLine().trim();
        for (int i = 0; i < books.size(); i++) {
            if (userAnswer.equalsIgnoreCase("everything")) {
                System.out.printf("%s, %d pages, %d%n", books.get(i).getTitle(), books.get(i).getPages(), books.get(i).getPubYear());

            }
            if (userAnswer.equalsIgnoreCase("name")) {
                System.out.printf("%s%n", books.get(i).getTitle());
            }
        }
        input.close();
    }
}
