package InnerClass;

public class Anon {
    public static void main(String[] args) {

        Anonymous anonymous = new Anonymous() {
            public void show() {
                System.out.println("Thank you!");
            }
        };
        anonymous.show();
    }
}

