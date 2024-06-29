package boxes;

import java.util.ArrayList;

public class OneThingBox extends Box {
    private ArrayList<Thing> things = new ArrayList<>();

    private int limit;

    public OneThingBox() {
        this.limit = 0;
    }

    @Override
    public void add(Thing thing) {
        if (limit < 1) {
            things.add(thing);
            limit++;
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return things.contains(thing);
    }
}
