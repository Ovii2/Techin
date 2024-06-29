public class Medicine extends Product {
    private static final int VAT = 5;

    public Medicine(String name, double price) {
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