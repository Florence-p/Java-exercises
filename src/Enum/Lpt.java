package Enum;

public class Lpt {
    public static void main(String[] args) {
       // Laptop lap = Laptop.xps

                for (Laptop lap : Laptop.values()){
                    System.out.println(lap + ":" + lap.getPrice());
                }
    }
}
