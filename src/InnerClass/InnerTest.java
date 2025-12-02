package InnerClass;

public class InnerTest {
    public static void main(String[] args) {
        Phone redmi = new Phone("Redmi", "Redmi 13X");
        Phone.SimCard sim = redmi.createSimCard("MTN", 1210038943);
        redmi.display();
        sim.displaySimCard();

    }
}
