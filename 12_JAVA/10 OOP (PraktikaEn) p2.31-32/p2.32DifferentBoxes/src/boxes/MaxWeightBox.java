package boxes;

import java.util.ArrayList;

public class MaxWeightBox extends Box {
    private ArrayList<Thing> things = new ArrayList<>();
    private int maxWeight;

    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int weigh() {
       return things.stream().mapToInt(Thing::getWeight).sum();
    }

    @Override
    public void add(Thing thing) {
        if (weigh() + thing.getWeight() <= maxWeight) {
            things.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return things.contains(thing);
    }
}
