package cabbooking;

public class CabBookingApp {
	public static void main(String[] args) {

        Customer customer = new Customer(
                "Tejas",
                "Pune Station",
                "Hinjewadi",
                20
        );

        Driver driver = new Driver(
                101,
                "Rahul",
                true
        );

        RideService rideService = new RideService();

        try {

            rideService.bookRide(customer, driver, true);

        } catch (InvalidLocationException e) {

            System.out.println("Location Error: " + e.getMessage());


        } catch (DriverNotAvailableException e) {

            System.out.println("Driver Error: " + e.getMessage());

        } catch (DistanceLimitException e) {

            System.out.println("Distance Error: " + e.getMessage());


        } catch (PaymentFailedException e) {

            System.out.println("Payment Error: " + e.getMessage());


        } finally {

            System.out.println("Thank for using us for your rides.");


        }
    }
}
