package lt.techin.strategy;

import java.util.ArrayList;
import java.util.List;

public class MaxPriceWithFilteringImpl implements FilteringStrategy {


    private double maxPrice;

    public MaxPriceWithFilteringImpl(double maxPrice) {
        this.maxPrice = maxPrice;
    }

    @Override
    public boolean filter(Product product) {
        return product.getPrice() <= maxPrice;
    }

}