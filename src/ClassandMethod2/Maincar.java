package ClassandMethod2;


public class Maincar {
    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println(myCar.make);
        System.out.println(myCar.model);

        myCar.brake();
        myCar.brake();
    }
}
