import java.util.Arrays;
import java.util.Scanner;

public class Game {

    private Scanner input;
    private static int guessingCount = 10;

    public Game() {
        this.input = new Scanner(System.in);
    }

    public String generateRandomWord() {
        String[] words = {"pirmas", "antras", "trecias"};
        int randomNum = (int) (Math.random() * words.length);
        return words[randomNum];
    }

    public String printArray(char[] array) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            s.append(array[i]);
        }
        return s.toString();
    }

    public static void gameIntro() {
        System.out.println();
        System.out.println("Welcome to the Word Guessing Game! Try to guess the word by entering letters.");
        System.out.printf("Maximum guessing limit is %d!%n", guessingCount);
        System.out.println("To quit the game type \u001B[36mexit\u001B[0m");
    }

    public void printWinningMessage(char[] word) {
        System.out.printf("Congratulations! You guessed the word \u001B[32m%s\u001B[0m ", printArray(word));
        System.out.printf("with %d %s left!%n", guessingCount, guessingCount == 1 ? "guess" : "guesses");
    }

    public void printGuessingProgress(char[] wordCopy, char letter) {
        System.out.printf("(Guess) Enter a letter in a word %s > %c%n", printArray(wordCopy), letter);
    }

    public void printGuessingLimit(char[] word) {
        System.out.print("You have reached the guessing limit! ");
        System.out.printf("The answer was: \u001B[31m%s%n\u001B[0m ", printArray(word));
    }

    public boolean checkRepeatedGuessedLetter(char letter, char[] wordCopy, int letterCounter) {
        for (int i = 0; i < wordCopy.length; i++) {
            if (wordCopy[i] == letter) {
                System.out.printf("%c is already guessed! Try another one.%n", letter);
                return true;
            }
        }
        return false;
    }

    public int updateWordCopyAndCounter(char[] word, char[] wordCopy, char letter, int letterCounter) {
        for (int i = 0; i < word.length; i++) {
            if (word[i] == letter) {
                wordCopy[i] = letter;
                letterCounter++;
            }
        }
        return letterCounter;
    }


    public void play() {
        char[] word = generateRandomWord().toCharArray();
        char[] wordCopy = new char[word.length];

        Arrays.fill(wordCopy, '*');

        int letterCounter = 0;

        gameIntro();

        while (true) {
            String inputLine = input.nextLine();
            if (inputLine.isEmpty()) {
                System.out.println("You didn't enter anything. Please enter a letter.");
                continue;
            }

            if (inputLine.equalsIgnoreCase("exit")) {
                System.out.println("See you soon \uD83D\uDC4D");
                break;
            }

            if (inputLine.length() != 1 || !Character.isLetter(inputLine.charAt(0))){
                System.out.println("Only single letter is allowed and no digits.");
                continue;
            }

            char letter = inputLine.charAt(0);
            guessingCount--;

            if (!checkRepeatedGuessedLetter(letter, wordCopy, letterCounter)) {
                letterCounter = updateWordCopyAndCounter(word, wordCopy, letter, letterCounter);
            }
            if (word.length == letterCounter) {
                printWinningMessage(word);
                break;
            }

            printGuessingProgress(wordCopy, letter);

            System.out.printf("Guesses left: %d%n", guessingCount);
            if (guessingCount == 0) {
                printGuessingLimit(word);
                break;
            }

        }
        input.close();
    }
}