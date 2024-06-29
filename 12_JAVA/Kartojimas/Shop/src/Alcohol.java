public class Alcohol extends Product {
    private static final int VAT = 21;

    public Alcohol(String name, double price) {
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


