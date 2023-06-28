package org.example;

public class Main {
    public static void main(String[] args) {
        // start a product database
        ProductManagement database = new ProductManagement();
        // logged in user from frontend
        Employee loggedGebruiker = new Employee("Gebruiker", "Testing", "Employee");

        Product testCar = ProductFactory.CAR.createProduct();
        Product testTruck = ProductFactory.TRUCK.createProduct();
        Product testDrill = ProductFactory.DRILL.createProduct();

        database.addProduct(testCar); // add it to the product database

        // create a rental agreement -- done in frontend
        RentalAgreement rentalCar = new RentalAgreement(testCar,10, loggedGebruiker);
        rentalCar.startRental(); // start renting the product -- notifies an employee of a change and should refresh the frontend
        rentalCar.getRentable().getProductDetails();
        System.out.printf("huurkosten: €%.2f \n", rentalCar.calculateRentalPrice());
        rentalCar.endRental(); // stop renting the product -- notifies an employee of a change and should refresh the frontend

        System.out.println("-----------------------------");

        RentalAgreement rentalTruck = new RentalAgreement(testTruck,5, loggedGebruiker);
        rentalTruck.startRental();
        rentalTruck.getRentable().getProductDetails();
        System.out.printf("huurkosten: €%.2f \n", rentalTruck.calculateRentalPrice());
        rentalTruck.endRental();

        System.out.println("-----------------------------");

        RentalAgreement rentalDrill = new RentalAgreement(testDrill,20, loggedGebruiker);
        rentalDrill.startRental();
        rentalDrill.getRentable().getProductDetails();
        System.out.printf("huurkosten: €%.2f \n", rentalDrill.calculateRentalPrice());
        rentalDrill.endRental();
    }
}