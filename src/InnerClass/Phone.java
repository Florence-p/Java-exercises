package InnerClass;

public class Phone {
    String brand = "Redmi";
    String model = "Redmi 13X";

    public void display() {
        System.out.println("Brand: " + brand);
    }

    public SimCard createSimCard(String networkProvider, int phoneNumber) {
        return new SimCard(networkProvider, phoneNumber);
    }


    Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    class SimCard {
        String networkProvider = "MTN";
        int PhoneNumber = +1210038943;

        public void displaySimCard() {
            System.out.println("Phone number: " + PhoneNumber);
        }

        SimCard(String networkProvider, int PhoneNumber) {
            this.networkProvider = networkProvider;
            this.PhoneNumber = PhoneNumber;

        }
    }
}


