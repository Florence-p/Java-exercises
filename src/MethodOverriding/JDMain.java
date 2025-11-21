package MethodOverriding;

public class JDMain {
    public static void main(String[] args) {


        JumiaDelivery d1 = new BikeDelivery();
        JumiaDelivery d2 = new DroneDelivery();

        d1.deliverOrder();
        d2.deliverOrder();
    }
}