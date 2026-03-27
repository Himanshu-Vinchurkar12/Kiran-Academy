package com.rental;

public class Bike extends Vehicle {

    private double helmetCharge = 50;

    public Bike(int vehicleId, String vehicleName, double rentPerDay) {
        super(vehicleId, vehicleName, rentPerDay);
    }

    @Override
    public void rentVehicle(int days) {

        double total = calculateRent(days);

        System.out.println("Bike rented for " + days + " days");
        System.out.println("Total Rent : " + total);
    }

    @Override
    public void returnVehicle() {

        System.out.println("Bike returned successfully");
    }

    @Override
    public double calculateRent(int days) {

        return (getRentPerDay() * days) + helmetCharge;
    }
}
