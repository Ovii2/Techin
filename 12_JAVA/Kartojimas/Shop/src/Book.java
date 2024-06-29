public class Book extends Product {
    private static final int VAT = 9;

    public Book(String name, double price) {
        super(name, price);
    }

    @Override
    public double getPriceWithVat() {
        return super.getPrice() + (super.getPrice() * VAT / 100);
    }

    @Override
    public String productDescription() {
        return null;
    }
}
