package Prince_project;

import java.util.ArrayList;

class ShoppingCart {
    ArrayList<Product> products = new ArrayList<>();

    void addProduct(Product product) {
        products.add(product);
    }

    void removeProduct(Product product) {
        products.remove(product);
    }

    double getTotal() {
        double total = 0.0;
        for (Product product : products) {
            total += product.price;
        }
        return total;
    }
}
