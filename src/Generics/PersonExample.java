package Generics;

import java.util.Arrays;
import java.util.List;

public class PersonExample {
    public static void main(String[] args) {
        Person person1 = new Person ("Jane" , 32);
        Person person2 = new Person ("Ray" , 64);
        Person person3 = new Person ("Mike" , 31);
        Person person4 = new Person ("Jon" , 23);
        Person person5 = new Person ("Mary" , 37);

        List<Person> list = Arrays.asList(person1, person2, person3, person4, person5);
        //can we sort this by age?

        System.out.println("Before sorting" + list + "\n \n");
//use comparator!!
        //Comparator<Person> comparatorByAge = Comparator.comparingInt(p -> p.age);
        list.sort(new PersonAgeComparator());
        System.out.println("After sorting" + list);

    }
}
