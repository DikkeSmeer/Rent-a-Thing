package org.example;

public class TruckFactory extends ProductFactory{
    @Override
    public Product createProduct(){
        return new Truck();
    }
}
