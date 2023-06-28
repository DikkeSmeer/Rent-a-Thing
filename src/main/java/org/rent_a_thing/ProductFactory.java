package org.rent_a_thing;

public abstract class ProductFactory {

    public static final TruckFactory TRUCK = new TruckFactory();
    public static final CarFactory CAR = new CarFactory();
    public static final DrillFactory DRILL = new DrillFactory();

    public abstract Product createProduct();
}

