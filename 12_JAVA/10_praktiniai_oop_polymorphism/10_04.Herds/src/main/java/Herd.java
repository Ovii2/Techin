import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Herd implements Movable {
    private List<Movable> herds = new ArrayList<>();

    public void addToHerd(Movable movable) {
        herds.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable herd : herds) {
            herd.move(dx, dy);
        }
    }


    @Override
    public String toString() {
        return herds.stream()
                .map(Movable::toString)
                .collect(Collectors.joining("\n"));
    }
}