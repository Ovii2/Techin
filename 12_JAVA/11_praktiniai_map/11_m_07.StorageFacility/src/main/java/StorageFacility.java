import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    HashMap<String, ArrayList<String>> warehouse = new HashMap<>();

    public void add(String unit, String item) {
        if (!warehouse.containsKey(unit)) {
            ArrayList<String> items = new ArrayList<>();
            items.add(item);
            warehouse.put(unit, items);
        } else {
            ArrayList<String> items = warehouse.get(unit);
            items.add(item);
        }

    }

    public ArrayList<String> contents(String storageUnit) {
        return warehouse.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item) {
        if (warehouse.containsKey(storageUnit)) {
            ArrayList<String> items = warehouse.get(storageUnit);
            items.remove(item);

            if (items.isEmpty()) {
                warehouse.remove(storageUnit);
            }
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<>();
        for (String unit : warehouse.keySet()) {
            units.add(unit);
        }
        return units;
    }
}
