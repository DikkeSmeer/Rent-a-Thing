package org.rent_a_thing;

public class Drill extends Product {
    private final String brand;
    private final String type;

    public Drill() {
        super("Drill", 5.00, 1.00, "This is a Drill!");
        this.brand = "Super Tools";
        this.type = "PowerDrill";
    }

    @Override
    public double berekenHuurPrijs() {
        return getDailyRentalPrice();
    }
    @Override
    public double berekenVerzekeringPrijs() { return getInsuranceFee() ; }

    // for this example we use system outs for the information and no frontend information getters
    @Override
    public void getProductDetails() {
        System.out.println("Product type: " + getDescription());
        System.out.println("name: " + getName());
        System.out.println("brand: " + brand);
        System.out.println("type: " + type);
    }
}
