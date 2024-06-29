public class Main {
    public static void main(String[] args) {
        /*Realizuokite parduotuvės funkcionalumą. Parduotuvė parduoda prekes: maisto prekes, alkoholi-
                nius gėrimus, knygas ir laikraščius. Bet kokios parduodamos prekės savybė:
        - Pavadinimas
        - Kaina
        Prekė žino savo kaina ir kainą su PVM. Apie PVM tarifus galite paskaityti čia: ”Pridėtinės
        vertės mokestis”. Klientai gali apsipirkti parduotuvėje ir nupirkti bet kokias ir bet kiek prekių.
        Apmokant prekių krepšelį klientui turi būti nurodoma bendra prekių kaina, kaina su PVM ir kaina
        doleriais pagal galiojanti šiai dienai Eur / USD keitimo kursą. Taip pat parduotuvėje gali vykti
        įvairios akcijos, tad klientui turi būti pritaikomos nuolaidos jei tokios priklauso.*/

        Basket myBasket = new Basket();
        Book book1 = new Book("Altoriu sesely", 10.5);
        Alcohol vodka = new Alcohol("Sostines", 15);
        Medicine panadol = new Medicine("Panadol", 2.54);
        myBasket.addProduct(book1);
        myBasket.addProduct(vodka);
        myBasket.addProduct(panadol);

        System.out.println("total price " + myBasket.getAllProductPrice());
        System.out.println("total price with vat " + myBasket.getAllProductPriceWithVat());
        System.out.println(myBasket.getProductsList());

    }
}