package lt.techin.pvz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarNumberPricingCalculatorTest {

    CarNumberPricingCalculator carNumberPricingCalculator = new CarNumberPricingCalculator();

    @Test
    public void testAllNumbersAndLettersCost1000() {
        assertEquals(Double.valueOf(1000.0), carNumberPricingCalculator.calculatePrice("AAA123"), 0.01);
        assertEquals(Double.valueOf(1000.0), carNumberPricingCalculator.calculatePrice("ASD000"), 0.01);
        assertEquals(Double.valueOf(1000.0), carNumberPricingCalculator.calculatePrice("BBB123"), 0.01);
        assertEquals(Double.valueOf(1000.0), carNumberPricingCalculator.calculatePrice("CCC001"), 0.01);
    }

    @Test
    public void testAllNumbersAndLettersAreTheSameCost5000() {
        assertEquals(Double.valueOf(5000.0), carNumberPricingCalculator.calculatePrice("AAA111"), 0.01);
        assertEquals(Double.valueOf(5000.0), carNumberPricingCalculator.calculatePrice("BBB222"), 0.01);
        assertEquals(Double.valueOf(5000.0), carNumberPricingCalculator.calculatePrice("CCC333"), 0.01);
    }


    @Test
    public void testLettersCost2000() {
        assertEquals(Double.valueOf(2000.0), carNumberPricingCalculator.calculatePrice("GOD456"));
        assertEquals(Double.valueOf(2000.0), carNumberPricingCalculator.calculatePrice("KLR789"));
        assertEquals(Double.valueOf(2000.0), carNumberPricingCalculator.calculatePrice("BOS345"));
    }

    @Test
    public void testLettersAndNumbersCost7000() {
        assertEquals(Double.valueOf(7000.0), carNumberPricingCalculator.calculatePrice("GOD111"));
        assertEquals(Double.valueOf(7000.0), carNumberPricingCalculator.calculatePrice("KLR222"));
        assertEquals(Double.valueOf(7000.0), carNumberPricingCalculator.calculatePrice("BOS333"));
    }

    @Test
    public void testPersonalCost10_000() {
        assertEquals(Double.valueOf(10_000.0), carNumberPricingCalculator.calculatePrice("ZZZZ123"));
        assertEquals(Double.valueOf(10_000.0), carNumberPricingCalculator.calculatePrice("QQQQ023"));
        assertEquals(Double.valueOf(10_000.0), carNumberPricingCalculator.calculatePrice("LLLLL124"));
    }
}
