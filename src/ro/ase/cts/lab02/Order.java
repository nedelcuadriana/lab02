package ro.ase.cts.lab02;

import java.util.ArrayList;

public class Order {

    private ArrayList<Product> productList;
    private String addr;

    public Order(ArrayList<Product> productList, String addr) {
        this.productList = productList;
        this.addr = addr;
    }

    public void add(Product p)
    {
        if(productList.size() > 99)
            return;

        productList.add(p);
    }

    public void remove(Product p)
    {
        productList.remove(p);
    }

}
