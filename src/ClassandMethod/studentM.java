package ClassandMethod;

public class studentM {
    public static void main(String[] args) {


        Student sd = new Student();

        sd.name = "Tom";
        sd.age = 24;
        System.out.println("My name is " + sd.name + " and I am " + sd.age + " Years old");

        sd.introduce();
    }
}
