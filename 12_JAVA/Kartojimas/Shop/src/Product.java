public abstract class Product {
    private String name;
    private double price;
    private double discount = 0.0;


    public Product(String name, double price) {
        this.name = name;
        this.price = price;

    }

    public Product(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public double getPrice() {
        return price - price * discount;
    }

    public String getName() {
        return name;
    }


    public abstract double getPriceWithVat();


    public abstract String productDescription();

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                '}';
    }
}
