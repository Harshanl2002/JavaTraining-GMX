package Ride;
public class PremiumRide extends Ride {
    public PremiumRide(String from, String to, int distance){
        super(from, to, distance);
    }
    
    @Override
    public int CalculateFair(){
        return 22 * this.distance;
    }
}
