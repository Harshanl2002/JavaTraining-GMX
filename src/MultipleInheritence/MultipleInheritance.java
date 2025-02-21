package MultipleInheritence;

interface WiFi {
    void connectToWiFi(String network);
}

interface Bluetooth {
    void pairWithDevice(String device);
}

class SmartPhone implements WiFi, Bluetooth {
    @Override
    public void connectToWiFi(String network) {
        System.out.println("Smartphone connected to WiFi: " + network);
    }

    @Override
    public void pairWithDevice(String device) {
        System.out.println("Smartphone paired with Bluetooth device: " + device);
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        phone.connectToWiFi("Home_Network");
        phone.pairWithDevice("Wireless Earbuds");
    }
}
