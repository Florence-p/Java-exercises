package GettersAndSetters;

public class animal {
    private String name;
    private String type;
    private int age;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;


    }

    void makeSound() {
        System.out.println("The " + this.getType() + " makes a roar sound.");
    }

    void description() {
        System.out.println(this.getType() + " is a lion and is " + this.getAge() + " years old");
    }

}
