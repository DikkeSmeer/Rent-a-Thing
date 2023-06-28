package org.rent_a_thing;

import java.util.ArrayList;

public class ProductManagement {
    private final ArrayList<Product> products = new ArrayList<>(); // only one database, cannot create more

    public ArrayList<Product> getProducts() {
        return products;
    }

    public boolean addProduct(Product product){
        return products.add(product);
    }

    public boolean removeProduct(Product product) {
        for(Product pr : products){
            if (pr.equals(product)){
                return products.remove(pr);
            }
        }
        return false;
    }
}
