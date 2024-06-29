import java.util.ArrayList;

public class MisplacingBox extends Box {

    private int capacity;
    private ArrayList<Item> items = new ArrayList<>();

    public MisplacingBox() {
        this.capacity = 1;
    }

    @Override
    public void add(Item item) {
        if (capacity - weight() >= item.getWeight()) {
            items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }

    public int weight() {
        return items.stream().mapToInt(Item::getWeight).sum();
    }
}
