package lt.techin.ovidijus;

import itadesign.beerdrinker.BeerBottle;
import itadesign.beerdrinker.BeerConsumer;
import itadesign.beerdrinker.DefaultBeerBottle;

public class BeerConsumerImpl extends BeerConsumer {
    @Override
    protected boolean shouldConsumeBeer(BeerBottle beerBottle) {
        if (beerBottle.getVolumeInLiters() > 0.5) {
            return false;
        } else if (beerBottle.getAlcoholContentInPercent() > 6) {
            return false;
        } else if (getBloodAlcoholContentInLiters() > 0.12) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public BeerBottle showBeerBottleToAStranger(BeerBottle beerBottle, boolean b) {
        return b ? new BeerDecorator(beerBottle) : beerBottle;
    }
}
