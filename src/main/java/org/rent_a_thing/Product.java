package org.rent_a_thing;

public abstract class Product {
    private String name;
    private String productStatus;
    private double pricePerDay;
    private double insuranceFee;
    private String description;

    public Product(String name, double dailyRentalPrice, double insuranceFee, String description){
        this.name = name;
        this.pricePerDay = dailyRentalPrice;
        this.insuranceFee = insuranceFee;
        this.productStatus = "available";
        this.description = description;
    }
    public String getName() {
        return name;
    }
    public String getProductStatus() {return productStatus;}
    public void setProductStatus(String productStatus) {this.productStatus = productStatus;}
    public double getDailyRentalPrice(){
        return pricePerDay;
    }
    public double getInsuranceFee() {
        return insuranceFee;
    }
    public String getDescription() {
        return description;
    }
    public final double calculateDailyPrice(){
        return berekenHuurPrijs() + berekenVerzekeringPrijs();
   }

    public abstract double berekenHuurPrijs();
    public abstract double berekenVerzekeringPrijs();
    public abstract void getProductDetails();
}