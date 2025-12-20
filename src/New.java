import java.util.Scanner;

public class New {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        String email = "Tola123@gmail.com";
//        String username = email.substring(0,6);
//        System.out.println(username);
        String email;
        String username;
        String domain;
        System.out.println("Enter your email: ");
        email = scanner.nextLine();

        if(email.contains("@")) {
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);

            System.out.println(username);
            System.out.println(domain);
        }
        else{
            System.out.println("Ëmails must contain @");
        }
    }
}
