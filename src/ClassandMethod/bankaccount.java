package ClassandMethod;

public class bankaccount {
    String accountName;
    double balance;

    //method 1
    void deposit(double amount) {
        System.out.println("Deposit Successful!");

    }

    //method2
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Insufficient funds!");
        }

    }

    //method3
    void checkBalance() {
        System.out.println("Current balance:" + balance);


    }
}
