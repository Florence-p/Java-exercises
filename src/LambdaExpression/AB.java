package LambdaExpression;

public class AB {
    public static void main(String[] args) {
        A obj = (int i) -> System.out.println("in method show " + i);

        obj.show(6);
    }
}
