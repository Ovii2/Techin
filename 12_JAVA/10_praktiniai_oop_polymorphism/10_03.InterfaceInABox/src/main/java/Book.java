import java.util.ArrayList;

public class Book implements Packable {
    private ArrayList<Packable> items = new ArrayList<>();
    private String author;
    private String name;
    private double weight;

    public Book(String author, String name, double weight) {
        this.author = author;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", this.author, this.name);
    }
}
