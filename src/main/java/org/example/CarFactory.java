package org.example;

public class CarFactory extends ProductFactory{
    @Override
    public Product createProduct(){
        return new Car();
    }
}
