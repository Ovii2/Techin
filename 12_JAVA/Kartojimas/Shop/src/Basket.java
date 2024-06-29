import java.util.ArrayList;

public class Basket {
    ArrayList<Product> productsList = new ArrayList<>();

    void addProduct(Product product) {
        productsList.add(product);
    }

    double getAllProductPrice() {
        double sum = 0.0;
        for (Product product : productsList) {
            sum += product.getPrice();
        }
        return sum;
    }

    double getAllProductPriceWithVat() {
        double sum = 0.0;
        for (Product product : productsList) {
            sum += product.getPriceWithVat();
        }
        return sum;
    }

    public ArrayList<Product> getProductsList() {
        return productsList;
    }
}
