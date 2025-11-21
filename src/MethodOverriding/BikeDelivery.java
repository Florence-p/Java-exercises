package MethodOverriding;

class BikeDelivery extends JumiaDelivery {
    @Override
    void deliverOrder() {
        System.out.println("Delivering via bike rider...");
    }
}
