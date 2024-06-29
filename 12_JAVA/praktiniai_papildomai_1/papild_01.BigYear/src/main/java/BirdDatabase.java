import java.util.*;

public class BirdDatabase {
    private Map<String, Bird> database = new HashMap<>();

    public void add(String name, String nameInLatin) {
        if (!database.containsKey(name)) {
            database.put(name, new Bird(name, nameInLatin));
        } else {
            System.out.println("Bird is already in the database");
        }
    }

    public void observation(String name) {
        Bird bird = database.get(name);
        if (bird != null) {
            bird.setObservation();
            System.out.printf("%s (%s): %d %s%n", name, bird.getLatinName(), bird.getObservation(), bird.getObservation() == 1 ? "observation" : "observations");
        } else {
            System.out.println("Bird not found in the database!");
        }
    }

    public void one(String name) {
        Bird bird = database.get(name);
        if (bird != null) {
            System.out.printf("%s (%s): %d observations%n", name, bird.getLatinName(), bird.getObservation(), bird.getObservation() == 1 ? "observation" : "observations");
        } else {
            System.out.println("Bird not found in the database!");
        }
    }


    public void all() {
        database.forEach((key, value) -> {
            System.out.printf("%s (%s): %d observations%n", key, value, value.getObservation());
        });
    }

}
