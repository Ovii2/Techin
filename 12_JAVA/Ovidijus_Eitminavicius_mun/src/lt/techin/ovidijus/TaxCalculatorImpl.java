package lt.techin.ovidijus;

import lt.techin.municipality.Person;
import lt.techin.municipality.TaxCalculator;

public class TaxCalculatorImpl implements TaxCalculator {
    @Override
    public double calculateTax(Person person) {
        double tax;
        if (person.getYearlyIncome() < 14_000) {
            tax = 0.0;
        } else if (person.getYearlyIncome() > 1_000_000) {
            tax = person.getYearlyIncome() * 0.16;
        } else {
            tax = person.getYearlyIncome() * 0.15;
        }
        return tax;
    }
}
