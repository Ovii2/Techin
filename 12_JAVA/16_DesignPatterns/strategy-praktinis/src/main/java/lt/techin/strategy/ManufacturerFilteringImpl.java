package lt.techin.strategy;

import java.util.ArrayList;
import java.util.List;

public class ManufacturerFilteringImpl implements FilteringStrategy {

    private String manufacturer;

    public ManufacturerFilteringImpl(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public boolean filter(Product product) {
        return product.getManufacturer().equalsIgnoreCase(manufacturer);
    }
}
