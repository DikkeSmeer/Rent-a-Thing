package org.example;

import java.util.ArrayList;

public class RentalAgreement implements Observable {
    private String rentalId;
    private Employee employee;
    private Product rentable;
    private int rentalDays;

    private final ArrayList<Observer> observers = new ArrayList<>();

    public RentalAgreement(Product rentable, int days,Employee employee){
        this.rentable = rentable;
        this.rentalDays = days;
        this.employee = employee;
    }

    public void startRental() {
        toggleStatus();
        notifyObservers();
    }
    public void endRental() {
        toggleStatus();
        notifyObservers();
    }

    public void toggleStatus() {
        if (rentable.getProductStatus().equalsIgnoreCase("rented")){
            rentable.setProductStatus("available");
        }else {
            rentable.setProductStatus("rented");
        }
    }

    // observer
    public void registerObserver(Observer o){
        observers.add(o);
    }
    public void removeObserver(Observer o){
        for(Observer obs : observers){
            if (obs.equals(o)){
                observers.remove(obs);
            }
        }

    }
    public void notifyObservers(){
        employee.update();
    }

    public Product getRentable() {
        return rentable;
    }
    public double calculateRentalPrice(){
        return rentable.calculateDailyPrice() * rentalDays;
    }
}
