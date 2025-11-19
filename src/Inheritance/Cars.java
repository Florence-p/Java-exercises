package Inheritance;

public class Cars extends Vehicle {

    String model;

    Cars(String brand, int year, String model) {
        super(brand, year);
        this.model = model;

    }

    void showCarInfo() {
        displayVehicle();
        System.out.println("model: " + model);

    }
}

