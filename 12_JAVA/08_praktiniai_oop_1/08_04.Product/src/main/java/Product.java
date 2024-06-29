import java.util.Locale;

public class Product {
    private double price;
    private int quantity;
    private String name;

    public Product(String initialName, double initialPrice, int initialQuantity) {
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initialQuantity;
    }

    public void printProduct() {
        System.out.printf(Locale.US, "%s, price %.2f, %d pcs", name, price, quantity);
    }

}
