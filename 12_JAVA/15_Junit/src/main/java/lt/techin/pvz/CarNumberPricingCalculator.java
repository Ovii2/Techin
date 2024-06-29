package lt.techin.pvz;

class CarNumberPricingCalculator {


    /**
     * Naudojam TDD
     * Kursime programą Regitrai, kuri turi paskaičiuoti kainą pagal
     * pageidautiną automobilio numerį. Kainą politika yra tokia: Jeigu visos
     * trys raidės yra vienodos, arba jeigu visi trys skaičiai vienodi arba
     * "001","666" - numerio kaina 1000 eur. Jeigu trys raidės vienodos IR trys
     * skaičiai vienodi - numerio kaina 5000 EUR. Jeigu raidžių rinkinys yra
     * vienas iš "GOD", "KLR", "BOS" numerio kaina 2000 EUR. Jeigu prie aukščiau
     * minėto raidžių rinkinio pridėsime tris vienodus skaičius - 7000 EUR.
     * Jeigu numeris yra ne iš trijų simbolių ir trijų skaičių (1-6 simboliai)
     * jis yra vardinis - kaina 10 000 EUR.
     * Jei skaičiuoklei paduodamas blogo formato numeris - turi mesti
     * IllegalArgumentException su pranešimu - "Incorrect plate number format. Must be 1-6 symbols
     * latin letters and number combination"
     * mažosiomis ir d P.S. NIEKADA realiose sistemose nenaudokite float/double
     * pinigų ir kitoms tikslioms operacijoms tam naudokite BigDecimal tipą!
     */


    public static void main(String[] args) {
        CarNumberPricingCalculator c = new CarNumberPricingCalculator();
        System.out.println(c.calculatePrice("vvv258"));
        System.out.println(c.calculatePrice("vvv258"));
    }

    //testo metodo pvz.:
    //@Test
    // public void testAllNumbersAndLettersAreTheSameCost5000() {
    //	assertEquals(new Double(5000.0), priceCalc.calculatePrice("AAA111"));
    //}
    public boolean validateLetters(String letters) {
        for (int i = 0; i < letters.length(); i++) {
            if (letters.charAt(i) != letters.charAt(0)) {
                return false;
            }
        }
        return true;
        // return letters.charAt(0) == letters.charAt(1) && letters.charAt(1) == letters.charAt(2);
    }


    public double calculatePrice(String number) {
        double price = 0;
        if (validateLetters(number.substring(0, 3)) || validateLetters(number.substring(3, 6))) {
            price = 1000;
        }
        if (number.endsWith("001")) {
            price = 1000;
        }

        if (validateLetters(number.substring(0, 3)) && validateLetters(number.substring(3, 6))) {
            price = 5000;
        }

        if (number.startsWith("GOD") || number.startsWith("KLR") || number.startsWith("BOS")) {
            price = 2000;
        }

        if ((number.startsWith("GOD") && validateLetters(number.substring(3, 6))) || (number.startsWith("KLR") &&
                validateLetters(number.substring(3, 6))) || (number.startsWith("BOS") &&
                validateLetters(number.substring(3, 6)))) {
            price = 7000;
        }

//        if (number.length() >= 1 && number.length() <= 6) {
//            price = 10_000;
//        }
        if (number.substring(0, 3).length() != 3 && number.substring(3, 6).length() != 3) {
            price = 10_000;
        }
        return price;
    }

}
