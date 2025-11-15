package Exercise;

public class MyStudent {
    public static void main(String[] args) {
        MyStudent2 students1 = new MyStudent2("Rick", 20, "500 Level", 70);
        MyStudent2 students2 = new MyStudent2("Scooby", 18, "200 Level", 65);
        MyStudent2 students3 = new MyStudent2("Keisha", 22, "2OO Level", 45);
        MyStudent2 students4 = new MyStudent2("Dante", 23, "200 Level", 98);

        //array
        MyStudent2[] students = {students1, students2, students3, students4};
        for (MyStudent2 s : students) {
            s.displayInfo();  // prints name, age, grade, score
            System.out.println("Status: " + (s.hasPassed() ? "Passed" : "Failed"));
            System.out.println();

            System.out.println();

        }


    }
}
