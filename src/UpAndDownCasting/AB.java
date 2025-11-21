package UpAndDownCasting;

public class AB {
    public static void main(String[] args){

        A obj = new B();
        obj.show1();

        B obj1 = (B) obj;
        obj1.show2();
    }
}

