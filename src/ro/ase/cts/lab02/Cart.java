package ro.ase.cts.lab02;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> products;

    public Cart(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void add(Product product) {
        products.add(product);
    }
}
