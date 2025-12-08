package LambdaExpression;

public class LbrM {
    public static void main(String[] args) {
        Lbr obj = (i, j) -> i + j;

        int result = obj.add(5, 4);
        System.out.println(result);

    }
}
