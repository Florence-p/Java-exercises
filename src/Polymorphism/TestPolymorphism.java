package Polymorphism;

public class TestPolymorphism {
    public static void main(String[] args) {

        Teacher t;

        t = new MathTeacher();
        t.teach();

        t = new ScienceTeacher();
        t.teach();
    }
}
