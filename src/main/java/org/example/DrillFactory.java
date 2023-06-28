package org.example;

public class DrillFactory extends ProductFactory{
    @Override
    public Product createProduct(){
        return new Drill();
    }

}
