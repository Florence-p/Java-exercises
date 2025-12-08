package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a number to divide");
            int x = scanner.nextInt();

            System.out.println("Enter a number to divide by");
            int y = scanner.nextInt();
            int z = x / y;
            System.out.println("result : " + z);
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by Zero!");
        } catch (InputMismatchException e) {
            System.out.println("Please try again");

        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {
            scanner.close();
        }

    }
}
