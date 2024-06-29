public class ProductWarehouse extends Warehouse {
    private String name;


    public ProductWarehouse(String productName, double capacity) {
        super(capacity);
        this.name = productName;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", this.name, super.toString());
    }
}
