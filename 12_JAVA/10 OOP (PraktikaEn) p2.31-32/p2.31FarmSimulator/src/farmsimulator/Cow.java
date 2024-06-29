package farmsimulator;

import java.util.Locale;
import java.util.Random;

public class Cow implements Milkable, Alive {
    private String name;
    private double capacity;
    private double milkInUdder = 0;

    private static final String[] NAMES = new String[]{
            "Anu", "Arpa", "Essi", "Heluna", "Hely",
            "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
            "Jaana", "Jami", "Jatta", "Laku", "Liekki",
            "Mainikki", "Mella", "Mimmi", "Naatti",
            "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
            "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    public Cow() {
        capacity = 15 + Math.floor(new Random().nextDouble() * 26);
        this.name = NAMES[(int) (Math.floor(Math.random() * NAMES.length))];
    }

    public Cow(String name) {
        capacity = 15 + Math.floor(new Random().nextDouble() * 26);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getAmount() {
        return milkInUdder;
    }

    @Override
    public double milk() {
        double milkLeft = milkInUdder;
        milkInUdder = 0.0;
        return milkLeft;

    }

    @Override
    public void liveHour() {
        double production = 0.7 + Math.floor(new Random().nextDouble() * 1.3);
        milkInUdder += production;
        if (milkInUdder > capacity) {
            milkInUdder = capacity;
        }

    }

    @Override
    public String toString() {
        return String.format(Locale.US, "%s %.1f/%.1f", name, Math.ceil(milkInUdder), Math.ceil(capacity));
    }
}
