package cabbooking;

class Customer {

    private String name;
    private String pickupLocation;
    private String dropLocation;
    private int distance;

    public Customer(String name, String pickupLocation, String dropLocation, int distance) {
        this.name = name;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public String getDropLocation() {
        return dropLocation;
    }

    public int getDistance() {
        return distance;
    }
}
