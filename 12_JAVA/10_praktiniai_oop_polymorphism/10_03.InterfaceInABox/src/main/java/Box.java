import java.util.ArrayList;
import java.util.Locale;

public class Box implements Packable {
    private double maxCapacity;


    private ArrayList<Packable> items = new ArrayList<>();

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }


    public double getMaxCapacity() {
        return maxCapacity;
    }

    public void add(Packable item) {
        if (weight() + item.weight() <= maxCapacity) {
            items.add(item);
        }
    }

    @Override
    public double weight() {
        return items.stream().mapToDouble(Packable::weight).sum();
    }

    @Override
    public String toString() {
        return String.format(Locale.US, "Box: %d items, total weight %.1f kg", items.size(), weight());
    }
}
