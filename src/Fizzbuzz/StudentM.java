package Fizzbuzz;

public class StudentM {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Bluey";
        s1.rollno = 3;
        s1.marks = 80;

        Student s2 = new Student();
        s2.name = "Vic";
        s2.rollno = 4;
        s2.marks = 90;

        Student s3 = new Student();
        s3.name = "hova";
        s3.rollno = 2;
        s3.marks = 17;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i=0; i< students.length; i++){
            students[i].printInfo();
        }
    }
}
