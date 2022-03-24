package ro.ase.cts.lab02;

import java.util.ArrayList;

public class User {
    private int id;  //>=1
    private String username;  //min 5 caractere
    private String name;  //min 10
    private ArrayList<Order> orderHistory;
    private Cart shoppingCart;

    public User(int id, String username, String name) {
        this.id = id;
        this.username = username;
        this.name = name;
    }

    public void addOrderToHistory(Order order){
        orderHistory.add(order);
    }

    public void addProductToCart(Product product) {
        shoppingCart.add(product);
    }
}
