import java.util.Locale;

public class ProductWarehouseWithHistory extends ProductWarehouse {


    private ChangeHistory changeHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        changeHistory = new ChangeHistory();
        addToWarehouse(initialBalance);
    }

    public String history() {
        return changeHistory.toString();
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        changeHistory.add(getBalance());

    }

    @Override
    public double takeFromWarehouse(double amount) {
        double result = super.takeFromWarehouse(amount);
        changeHistory.add(getBalance());
        return result;
    }

    public void printAnalysis() {
        System.out.printf("Product: %s%n", getName());
        System.out.printf("History: %s%n", history());
        System.out.printf(Locale.US, "Largest amount of product: %.1f%n", changeHistory.maxValue());
        System.out.printf(Locale.US, "Smallest amount of product: %.1f%n", changeHistory.minValue());
        System.out.printf(Locale.US, "Average: %.1f", changeHistory.average());
    }
}
