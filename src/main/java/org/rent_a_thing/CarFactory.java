package org.rent_a_thing;

public class CarFactory extends ProductFactory{
    @Override
    public Product createProduct(){
        return new Car();
    }
}
