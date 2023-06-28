package org.rent_a_thing;

public class TruckFactory extends ProductFactory{
    @Override
    public Product createProduct(){
        return new Truck();
    }
}
