package org.example;

public class Truck extends Product {
    private final double loadCapacity;
    private final double engineCapacity;

    public Truck() {
        super("Truck", 0.10, 0.01, "This is a Truck!");
        this.loadCapacity = 5000;
        this.engineCapacity = 2000;
    }

    @Override
    public double berekenHuurPrijs() { return loadCapacity * getDailyRentalPrice(); }
    @Override
    public double berekenVerzekeringPrijs() { return getInsuranceFee() * engineCapacity; }

    // for this example we use system outs for the information and no frontend information getters
    @Override
    public void getProductDetails(){
        System.out.println("Product type: " + getDescription());
        System.out.println("name: " + getName());
        System.out.println("loadcap: " + loadCapacity);
        System.out.println("enginecap: " + engineCapacity);
    }
}

