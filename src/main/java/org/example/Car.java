package org.example;

public class Car extends Product {
        private final String brand;
        private final double weight;
        private final double engineCapacity;

        public Car() {
                super("Car", 50.00, 0.01, "This is a Car!");
                this.engineCapacity = 1000;
                this.brand = "Volkswagen";
                this.weight = 3000;
        }

        @Override
        public double berekenHuurPrijs() {
                return 0.01 * getDailyRentalPrice();
        }
        @Override
        public double berekenVerzekeringPrijs() {
                return getInsuranceFee() * engineCapacity;
        }

        // for this example we use system outs for the information and no frontend information getters
        @Override
        public void getProductDetails(){
                System.out.println("Product type: " + getDescription());
                System.out.println("name: " + getName());
                System.out.println("brand: " + brand);
                System.out.println("weight: " + weight);
        }
}