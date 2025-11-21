package MethodOverriding;

public class DroneDelivery extends JumiaDelivery {
    @Override
    void deliverOrder() {
        System.out.println("Delivering via drone...");
    }
}
