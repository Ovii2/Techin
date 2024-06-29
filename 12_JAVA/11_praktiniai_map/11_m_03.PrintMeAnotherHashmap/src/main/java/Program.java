
import java.util.HashMap;

public class Program {

    public static void printValues(HashMap<String, Book> hashMap) {
//        for (String value: hashMap.keySet()){
//            System.out.println(hashMap.get(value));
//        }
        for (Book value : hashMap.values()) {
            System.out.println(value);
        }
    }

    public static void printValueIfNameContains(HashMap<String, Book> hashMap, String text) {
        for (Book value : hashMap.values()) {
            if (value.getName().contains(text)) {
                System.out.println(value);
            }
        }
    }


    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, Book> hashMap = new HashMap<>();

        hashMap.put("sense", new Book("Sense and sensibility", 1811, "..."));
        hashMap.put("prejudice", new Book("Pride and prejudice", 1813, "..."));
        hashMap.put("happy", new Book("Don't let the pigeon drive the bus", 2003, "..."));
        printValues(hashMap);
//        System.out.println("---");
//        printValueIfNameContains(hashMap, "prejud");
        printValueIfNameContains(hashMap, "ide");
    }

}
