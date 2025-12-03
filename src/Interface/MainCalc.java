package Interface;

public class MainCalc {
    public static void main(String[] args) {

        SimpleCalculator calc = new SimpleCalculator();

        System.out.println("Addition: " + calc.add(5, 3));
        System.out.println("Subtraction: " + calc.subtract(5, 3));
    }
}
