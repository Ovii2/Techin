package farmsimulator;

import java.util.Locale;

public class BulkTank {
    private double capacity;
    private double volume;

    public BulkTank() {
        this.capacity = 2000.0;
    }

    public BulkTank(double capacity) {
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getVolume() {
        return volume;
    }

    public double howMuchFreeSpace() {
        return capacity - volume;
    }

    public void addToTank(double amount) {
        if (amount <= howMuchFreeSpace()) {
            volume += amount;
        } else {
            volume = capacity;
        }

    }

    public double getFromTank(double amount) {
        if (amount <= volume) {
            volume -= amount;
            return amount;
        }
        return volume = 0.0;
    }

    @Override
    public String toString() {
        return String.format(Locale.US, "%.1f/%.1f", Math.ceil(volume), Math.ceil(capacity));
    }
}
