package Payment;

public class OnlinePayment extends Payment {
    private String fromBankDetails;
    private String ToBankDetails;

    public OnlinePayment(int amount,String from,String to) {
        super(amount);
        this.fromBankDetails = from;
        this.ToBankDetails = to;
    }

    @Override
    public void makePayment() {
        System.out.println("Payment Amount of Rs." + this.amount + " sent  from " + fromBankDetails + " to "
                + ToBankDetails + " Successfully!.");
    }

    @Override
    public void acceptPayMent() {
        System.out.println("Payment Amount of Rs." + this.amount + " Resived  from " + fromBankDetails + " to "
                + ToBankDetails + " Successfully!.");
    }
}