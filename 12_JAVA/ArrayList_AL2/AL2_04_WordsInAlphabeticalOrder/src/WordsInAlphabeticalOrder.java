
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        System.out.println("Type a word: ");
        while (true) {
            String word = reader.nextLine();
            words.add(word);

            if (word.isEmpty()) {
                System.out.println("You typed the following words:");
                Collections.sort(words);
                for (int i = 0; i < words.size(); i++) {
                    System.out.println(words.get(i));
                }
                break;
            }
        }
    }
}
