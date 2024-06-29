package lt.techin.ovidijus;

import itadesign.beerdrinker.BeerFactory;
import itadesign.beerdrinker.DefaultBeerBottle;
import itadesign.beerdrinker.NoMoreMaltException;

import java.util.Random;

public class BeerFactoryImpl implements BeerFactory {
    private int reserves = 1000;

    @Override
    public void receiveMaltShippment(double v) {
        reserves += (int) v * 1000;
    }

    @Override
    public DefaultBeerBottle produceNextBeerBottle() throws NoMoreMaltException {
        double alcoholContent = Math.round(new Random().nextDouble(4.5, 5.7) * 10.0) / 10.0;
        double bottleCapacity = Math.round(new Random().nextDouble(0.33, 0.5) * 100.0) / 100.0;

        if (reserves < 25) {
            throw new NoMoreMaltException("no more malt");
        } else {
            reserves -= 25;
            return new DefaultBeerBottle(bottleCapacity, alcoholContent);
        }
    }
}
