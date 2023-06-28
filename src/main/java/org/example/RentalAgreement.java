package org.example;

public class RentalAgreement implements Observable {
    private final Employee employee;
    private final Product rentable;
    private final int rentalDays;

    private Observer observer;

    public RentalAgreement(Product rentable, int days,Employee employee){
        this.rentable = rentable;
        this.rentalDays = days;
        this.employee = employee;
    }

    public void startRental() {
        toggleStatus();
        registerObserver(employee);
        notifyObservers();
    }
    public void endRental() {
        toggleStatus();
        removeObserver(employee);
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
        observer = o;
    }
    public void removeObserver(Observer o){
        if (observer != null && observer.equals(o)) {
            observer = null;
        }
    }
    public void notifyObservers(){
        if (observer != null) {
            observer.update();
        }
    }

    public Product getRentable() {
        return rentable;
    }
    public double calculateRentalPrice(){
        return rentable.calculateDailyPrice() * rentalDays;
    }
}
