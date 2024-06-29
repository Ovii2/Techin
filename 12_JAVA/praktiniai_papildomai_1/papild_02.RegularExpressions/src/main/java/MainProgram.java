import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainProgram {

    public static void main(String[] args) throws IOException {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        Checker checker = new Checker();

        System.out.println("Enter a string:");
        String answer = input.readLine();

//        if (checker.isDayOfWeek(answer)){
//            System.out.println("The form is correct");
//        } else{
//            System.out.println("The form is incorrect");
//        }

//        if (checker.allVowels(answer)){
//            System.out.println("The form is correct");
//        } else{
//            System.out.println("The form is incorrect");
//        }

        if (checker.timeOfDay(answer)) {
            System.out.println("The form is correct");
        } else {
            System.out.println("The form is incorrect");
        }
        input.close();
    }
}
