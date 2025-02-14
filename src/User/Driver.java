package User;

import Ride.Ride;

public class Driver extends User {
    private int earnedAmmount;
    Ride ride;

    public Driver(String name, String location, String contact, String bankDetails) {
        super(name, location, contact, bankDetails);
    }

    public Driver(String name, String location, String contact) {
        super(name, location, contact);
    }

    public int getEarnedAmount() {
        return this.earnedAmmount;
    }

    public int setEarnedAmount(int amount) {
        this.earnedAmmount += amount;
        return this.earnedAmmount;
    }

    public void acceptRide(Ride ride) {
        this.ride = ride;
    }

    public void CompleteRide(int amount) {
        this.earnedAmmount += amount;
    }

}
