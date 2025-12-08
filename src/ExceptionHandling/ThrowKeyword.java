package ExceptionHandling;

public class ThrowKeyword {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try{
            j = 18/i;
            if (j == 0)
                throw new ArithmeticException();
        } catch (ArithmeticException e) {
            j = 18/i;
            System.out.println("That is the default output");
        } catch (Exception e) {
            System.out.println("Something went wrong.." + e);
        }
        System.out.println(j);
    }
}
