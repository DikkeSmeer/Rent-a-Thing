package org.rent_a_thing;

public class DrillFactory extends ProductFactory{
    @Override
    public Product createProduct(){
        return new Drill();
    }

}
