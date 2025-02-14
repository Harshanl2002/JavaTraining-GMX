package User;

import Ride.*;

public class Rider extends User {
    Ride ride;

    public Rider(String name, String location, String contact, String bankDetails) {
        super(name, location, contact, bankDetails);
    }

    public Rider(String name, String location, String contact) {
        super(name, location, contact);
    }

    public Ride getStanderdRide(String toLocation, int distance) {
        this.ride = new StanderedRide(this.location, toLocation, distance);
        return this.ride;
    }

    public Ride getPremiumRide(String toLocation, int distance) {
        this.ride = new PremiumRide(this.location, toLocation, distance);
        return this.ride;
    }

    public Ride getRide() {
        return this.ride;
    }

    public int getFare() {
        return this.ride.CalculateFair();
    }
}
