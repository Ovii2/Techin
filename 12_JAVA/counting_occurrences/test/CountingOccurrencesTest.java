import java.util.Scanner;

public class CountingOccurrencesTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CountingOccurrences occurrences = new CountingOccurrences();
//        char[] letters = occurrences.generateRandomLetter(100);
        System.out.println("Enter words:");
        char[] letters = input.nextLine().toLowerCase().replaceAll("\\s", "").toCharArray();

        System.out.println("The lower case letters are: ");
        for (int i = 0; i < letters.length; i += 20) {
            for (int j = 0; j < 20; j++) {
                int index = i + j;
                if (index < letters.length) {
                    System.out.printf("%c ", letters[index]);
                }
            }
            System.out.println();
        }


        System.out.println();

        System.out.println("The occurrences of each letter are: ");
        for (char c = 'a'; c <= 'z'; c++) {
            int count = occurrences.countOccurrences(letters, c);
            if (count > 0) {
                System.out.printf("(%c : %d) ", c, count);
            }
        }
        System.out.println();
        System.out.printf("Total letters in a word: %d%n", letters.length);
    }
}
