import java.util.ArrayList;

public class OneItemBox extends Box {
    private int capacity;
    private ArrayList<Item> items = new ArrayList<>();

    public OneItemBox() {
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
        return items.contains(item);
    }

    public int weight() {
        return items.stream().mapToInt(Item::getWeight).sum();
    }
}
