package Exercise;

class A {
    private A() {
        System.out.println("Private Constructor");
    }

    public static void createInstance() {
        new A();
    }
}

public class Person {
    public static void main(String[] args) {
        A.createInstance();
    }
}