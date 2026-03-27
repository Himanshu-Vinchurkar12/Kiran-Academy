package com.rental;

public class Car extends Vehicle {

    private double insuranceCharge = 200;

    public Car(int vehicleId, String vehicleName, double rentPerDay) {
        super(vehicleId, vehicleName, rentPerDay);
    }

    @Override
    public void rentVehicle(int days) {

        double total = calculateRent(days);
        System.out.println("Car rented for " + days + " days");
        System.out.println("Total Rent : " + total);
    }

    @Override
    public void returnVehicle() {

        System.out.println("Car returned successfully");
    }

    @Override
    public double calculateRent(int days) {

        return (getRentPerDay() * days) + insuranceCharge;
    }
}