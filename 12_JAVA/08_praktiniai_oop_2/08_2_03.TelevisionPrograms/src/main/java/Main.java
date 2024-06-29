import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Name: ");
            String program = scanner.nextLine();
            if (program.isEmpty()) {
                break;
            }
            System.out.println("Duration: ");
            int duration = Integer.parseInt(scanner.nextLine());

            TelevisionProgram tvProgram = new TelevisionProgram(program, duration);
            programs.add(tvProgram);
        }

        System.out.println("Program's maximum duration?");
        int duration = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < programs.size(); i++) {
            if (programs.get(i).getDuration() <= duration) {
                System.out.printf("%s, %d minutes%n", programs.get(i).getName(), programs.get(i).getDuration());
            }
        }
        scanner.close();
    }
}
