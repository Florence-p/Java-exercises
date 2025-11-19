package GettersAndSetters;

public class animalMain {
    public static void main(String[] args) {

        animal a = new animal();
        a.setName("leo");
        a.setType("Lion");
        a.setAge(9);
       // System.out.println("Name: " + a.getName());
     //   System.out.println("Type: " + a.getType());
       // System.out.println("Age: " + a.getAge());

        a.makeSound();
        a.description();

        }


    }

