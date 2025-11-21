package Inheritance;

public class Vehicle {
    String brand;
    int year;

    Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void displayVehicle() {
        System.out.println("Brand: " + brand + ", Year: " + year);

    }

}
