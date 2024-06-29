
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter
        BirdDatabase birdDatabase = new BirdDatabase();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("?");
            String answer = scan.nextLine();
            if (answer.equalsIgnoreCase("quit")) {
                break;
            }
            if (answer.equalsIgnoreCase("add")) {
                System.out.println("Name:");
                String name = scan.nextLine();
                System.out.println("Name in Latin:");
                String nameInLatin = scan.nextLine();
//                birdDatabase.add(new Bird(name, nameInLatin));
                birdDatabase.add(name, nameInLatin);
            }
            if (answer.equalsIgnoreCase("Observation")) {
                System.out.println("Bird?");
                String bird = scan.nextLine();
                birdDatabase.observation(bird);
            }
            if (answer.equalsIgnoreCase("All")) {
                birdDatabase.all();
            }
            if (answer.equalsIgnoreCase("One")) {
                System.out.println("Bird?");
                String bird = scan.nextLine();
                birdDatabase.one(bird);

            }
        }
    }
}
