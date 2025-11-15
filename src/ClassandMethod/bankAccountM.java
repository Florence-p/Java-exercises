package ClassandMethod;

public class bankAccountM {
public static void main (String[] arg){
bankaccount ba = new bankaccount();
ba.accountName = "John";
ba.balance=5000;

ba.deposit(2000);
ba.withdraw(6000);
ba.checkBalance();
}
}