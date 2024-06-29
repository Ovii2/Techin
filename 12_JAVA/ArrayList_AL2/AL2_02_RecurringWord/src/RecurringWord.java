
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        System.out.println("Type a word: ");
        while (true) {
            String word = reader.nextLine();
            if (word.isEmpty()) {
                break;
            }
            if (words.contains(word)) {
                System.out.printf("You gave the word %s twice", word);
                break;
            }
            words.add(word);
        }

    }
}
