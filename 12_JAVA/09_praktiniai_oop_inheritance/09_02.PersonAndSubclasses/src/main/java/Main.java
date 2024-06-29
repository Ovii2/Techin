import java.util.ArrayList;

public class Main {
    public static void printPersons(ArrayList<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    public static void main(String[] args) {
        // write your test code here
//        Person ada = new Person("Ada Lovelance", "24 Maddox St. London W1S 2QN");
//        Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
//
//        System.out.println(ada);
//        System.out.println(esko);

//        Teacher ada = new Teacher("Ada Lovelance", "24 Maddox St. London W1S 2QN", 1200);
//        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
//        System.out.println(ada);
//        System.out.println(esko);
//
//
//        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
//
//        int i = 0;
//        while (i < 25) {
//            ollie.study();
//            i++;
//        }
//        System.out.println(ollie);


        ArrayList<Person> person = new ArrayList<Person>();
        person.add(new Teacher("Ada Lovelance", "24 Maddox St. London W1S 2QN", 1200));
        person.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

        printPersons(person);

    }
}
