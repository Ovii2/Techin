import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry = new HashMap<>();

    public VehicleRegistry() {
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (registry.containsKey(licensePlate)) {
            return false;
        }
        registry.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        if (!registry.containsKey(licensePlate)) {
            return null;
        }
        return registry.get(licensePlate);

    }

    public boolean remove(LicensePlate licensePlate) {
        if (registry.containsKey(licensePlate)) {
            registry.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate key : registry.keySet()) {
            System.out.println(key);
        }
    }

    public void printOwners() {
        Set<String> owners = new HashSet<>(registry.values());
        for (String owner : owners) {
            System.out.println(owner);
        }
    }
}
