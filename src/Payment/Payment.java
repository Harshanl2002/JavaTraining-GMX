package Payment;

public class Payment {
    int amount;

    Payment(int amount) {
        this.amount = amount;
    }

    public void makePayment() {
        System.out.println("Ammount given to Driver: " + this.amount);
    }

    public void acceptPayMent() {
        System.out.println("Ammount Resived by Driver:" + this.amount);
    }
}
