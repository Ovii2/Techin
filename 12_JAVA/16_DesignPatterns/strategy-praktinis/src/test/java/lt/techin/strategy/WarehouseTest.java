package lt.techin.strategy;

public class WarehouseTest extends BaseWarehouseTests {

    @Override
    Warehouse getWarehouse() {
        return new WarehouseImpl();
    }

    @Override
    FilteringStrategy getManufacturerFilteringStrategy(String manufacturer) {
        return new ManufacturerFilteringImpl(manufacturer);
    }

    @Override
    FilteringStrategy getMaxPriceFilteringStrategy(double maxPrice) {
        return new MaxPriceWithFilteringImpl(maxPrice);
    }
}
