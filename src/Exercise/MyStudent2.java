package Exercise;

public class MyStudent2 {
    String name;
    int age;
    String grade;
    double score;

    MyStudent2(String name, int age, String grade, double score) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.score = score;

    }

    void displayInfo() {
        System.out.println("Student: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Score: " + score);


    }

    boolean hasPassed() {
        if (score >= 50) {
            return true;
        } else {
            return false;
        }
    }
}
