package cabbooking;

class Driver {

    private final int driverId;
    private String driverName;
    private boolean available;

    public Driver(int driverId, String driverName, boolean available) {
        this.driverId = driverId;
        this.driverName = driverName;
        this.available = available;
    }

    public int getDriverId() {
        return driverId;
    }

    public String getDriverName() {
        return driverName;
    }

    public boolean isAvailable() {
        return available;
    }
}