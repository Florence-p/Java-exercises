package Generics;

import java.util.Comparator;

public class Person {
    String name;
    int age;

    public Person (String name, int age){
        this.name =  name;
        this.age = age;

    }
    @Override
    public String toString() {
        return  "Person{" +
                "name= ' " + name + '\'' +
                ", age=" + age +
                '}';

    }
}
class PersonAgeComparator implements Comparator<Person>{
    @Override
    public int compare(Person person1, Person person2){
        return Integer.compare(person1.age, person2.age);
    }

}
