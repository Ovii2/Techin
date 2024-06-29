package lt.techin.ovidijus;

import itadesign.beerdrinker.BeerBottle;

public class BeerDecorator implements BeerBottle {

    private BeerBottle wrappedBottle;

    public BeerDecorator(BeerBottle wrappedBottle) {
        this.wrappedBottle = wrappedBottle;
    }

    @Override
    public double getAlcoholContentInPercent() {
        return 0;
    }

    @Override
    public double getVolumeInLiters() {
        return wrappedBottle.getVolumeInLiters();
    }

    @Override
    public void takeASip(double v) {
        wrappedBottle.takeASip(v);
    }
}
