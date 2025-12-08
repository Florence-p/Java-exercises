package ThreadPractice;

import java.util.Scanner;

public class ThreadTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);

        thread.setDaemon(true);
        thread.start();

        System.out.println("You have 10 sec");
        System.out.println("Enter your name: ");

        String name = scanner.nextLine();
        System.out.println("Hello " + name);

    }
}
