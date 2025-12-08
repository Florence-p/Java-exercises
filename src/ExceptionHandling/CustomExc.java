package ExceptionHandling;

import java.util.Scanner;

public class CustomExc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        try{
            Checkage (age);
        } catch (Exception e) {
            System.out.println("A problem occured: " + e);
        }
    }
    static void Checkage (int age)throws AgeException{
        if (age < 18){
            throw new AgeException("\n" + "You must be 18 to sign up");
        }
        else{
            System.out.println("You are now signed up");
        }
    }
}
