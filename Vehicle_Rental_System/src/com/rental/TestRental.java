package com.rental;

public class TestRental {

    public static void main(String[] args) {

        System.out.println("***** Car Rental Info *****");

        Vehicle car = new Car(101, "Tata Safari", 2000);

        car.displayVehicleInfo();
        car.rentVehicle(3);
        car.returnVehicle();

        System.out.println("\n***** Bike Rental Info *****");

        Vehicle bike = new Bike(201, "BMW S1000RR", 15000);

        bike.displayVehicleInfo();
        bike.rentVehicle(2);
        bike.returnVehicle();
        
        System.out.println("\n***** Bike Rental Info *****");

        
        Vehicle bike2 = new Bike(202, "Ninja H2R", 18000);

        bike2.displayVehicleInfo();
        bike2.rentVehicle(2);
        bike2.returnVehicle();
    }
}