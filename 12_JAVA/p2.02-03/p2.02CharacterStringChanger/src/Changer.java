import java.util.ArrayList;

public class Changer {
    private ArrayList<Change> changes = new ArrayList<>();

    public Changer() {

    }

    public void addChange(Change change) {
        changes.add(change);
    }

    public String change(String characterString) {
        for (Change c : changes) {
            characterString = c.change(characterString);
        }
        return characterString;
    }
}
