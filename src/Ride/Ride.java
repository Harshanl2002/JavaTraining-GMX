package Ride;

public class Ride {
    String startLocation;
    String endLocation;
    int distance;

    public Ride(String from, String to, int distance) {
        this.startLocation = from;
        this.endLocation = to;
        this.distance = distance;
    }

    public int CalculateFair() {
        return this.distance * 12;
    }
}