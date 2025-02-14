import java.util.*;
import User.*;
import Payment.*;

public class BikeTaxiSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rider rider = new Rider("rider", "Mall", "1234567890", "SBI0001");
        Driver driver = new Driver("Driver", "Mall", "1234567890", "HDFC0001");
        // User selects ride type
        System.out.println("Welcome to Bike Taxi App!");
        System.out.println("Select Ride Type: \n1. Standard Ride \n2. Premium Ride");
        int rideChoice = scanner.nextInt();

        System.out.println("Enter the Distance!");

        int distance = scanner.nextInt();

        if (rideChoice == 1) {
            rider.getStanderdRide("Train Station", distance);
        } else {
            rider.getPremiumRide("Train Station", distance);
        }

        int calculateFair = rider.getFare();

        driver.acceptRide(rider.getRide());

        System.out.println("Ride Started ....");

        System.out.println("Ride Finished, total amount to ride was " + calculateFair);

        System.out.println("Select Payment Type: \n1. cash Payment \n2. Online Payment");

        int paymentChoise = scanner.nextInt();
        Payment payment;

        if (paymentChoise == 1) {
            payment = new CashPayment(calculateFair);
        } else {
            payment = new OnlinePayment(calculateFair, rider.getBankDetails(), driver.getBankDetails());
        }

        payment.makePayment();

        payment.acceptPayMent();

        System.out.println("Ride Completed. Thank you for using Bike Taxi!");
        System.out.println("Rating For the Rider");
        rider.setRating(scanner.nextByte());
        System.out.println("Rating For the Driver");
        driver.setRating(scanner.nextByte());

        driver.CompleteRide(calculateFair);

        scanner.close();
    }
}