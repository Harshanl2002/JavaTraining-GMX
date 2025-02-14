package User;

public class User {
    protected String userName;
    protected String location;
    protected String contact;
    private String bankDetails;
    private byte Rating;

    public User(String name, String location, String contact, String bankDetails) {
        this.userName = name;
        this.location = location;
        this.contact = contact;
        this.bankDetails = bankDetails;
    }

    public User(String name, String location, String contact) {
        this.userName = name;
        this.location = location;
        this.contact = contact;
    }

    public String getBankDetails() {
        return this.bankDetails;
    }

    protected void setBankDetails(String bankDetails) {
        this.bankDetails = bankDetails;
    }

    public User getUserProfile() {
        return new User(this.userName, this.location, this.contact, this.getBankDetails());
    }

    public Byte getRating() {
        return this.Rating;
    }

    public Byte setRating(byte rating) {
        this.Rating = rating;
        return this.Rating;
    }

    public User updateUserProfile(String name, String location, String contact, String bankDetails) {
        this.userName = name;
        this.location = location;
        this.contact = contact;
        this.setBankDetails(bankDetails);
        return getUserProfile();
    }

}
