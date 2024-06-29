package lt.techin.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WarehouseImpl implements Warehouse {
    List<Product> warehouse = new ArrayList<>();

    @Override
    public void addProducts(List<Product> products) {
        warehouse.addAll(products);
    }

    @Override
    public int getNumberOfProducts() {
        return warehouse.size();
    }

    @Override
    public List<Product> executeFilteringStrategy(FilteringStrategy strategy) {
        return warehouse.stream().filter(strategy::filter).collect(Collectors.toList());
    }
}
