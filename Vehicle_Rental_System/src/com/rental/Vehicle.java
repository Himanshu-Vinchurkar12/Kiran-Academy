package com.rental;

public abstract class Vehicle implements RentalTransaction {

    private int vehicleId;
    private String vehicleName;
    private double rentPerDay;

    public Vehicle(int vehicleId, String vehicleName, double rentPerDay) {
        this.vehicleId = vehicleId;
        this.vehicleName = vehicleName;
        this.rentPerDay = rentPerDay;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public double getRentPerDay() {
        return rentPerDay;
    }

    public abstract double calculateRent(int days);

    public void displayVehicleInfo() {

        System.out.println("Vehicle ID : " + vehicleId);
        System.out.println("Vehicle Name : " + vehicleName);
        System.out.println("Rent Per Day : " + rentPerDay);
    }
}
