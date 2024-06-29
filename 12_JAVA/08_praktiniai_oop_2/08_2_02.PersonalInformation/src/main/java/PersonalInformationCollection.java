
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("First name: ");
            String firstName = scanner.nextLine().trim();
            if (firstName.isEmpty()) {
                break;
            }
            System.out.println("Last name: ");
            String lastName = scanner.nextLine().trim();
            System.out.println("Identification number: ");
            String idNumber = scanner.nextLine().trim();


            PersonalInformation info = new PersonalInformation(firstName, lastName, idNumber);
            infoCollection.add(info);
        }
        for (int i = 0; i < infoCollection.size(); i++) {
            System.out.printf("%s %s%n", infoCollection.get(i).getFirstName(), infoCollection.get(i).getLastName());
        }
        scanner.close();
    }
}
