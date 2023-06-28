package org.rent_a_thing;

import java.util.ArrayList;

public class RentAThing {
    private ArrayList<Product> products;
    private ArrayList<User> users;
    private User loggedInUser;

    public boolean login(String username, String password) {
        // Login logic
        return false;
    }

    public void logout() {
        // Logout logic
    }

    public User getLoggedInUser() {
        return loggedInUser;
    }

    public ArrayList<Product> getProductList() {
        return products;
    }

    public Product getProductById(int productId) {
        // Get product by ID logic
        return products.get(productId);
    }

    public void addUser(User user) {
        // Add user logic
    }

    public void removeUser(User user) {
        // Remove user logic
    }

    public void notifyUsers() {
        // Notify users logic
    }
}
