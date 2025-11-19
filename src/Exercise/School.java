package Exercise;

import java.util.Scanner;

public class School {
    public  MyStudent2 getStudentByName(MyStudent2[] students)
    {
        Scanner details = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = details.nextLine();

        System.out.print("Enter student Score: ");
        String score = details.nextLine();

        MyStudent2 student = null;

        for(MyStudent2 student2 : students){

            if(student2.name.equalsIgnoreCase(name)){
                student = student2;
                break;
            }

        }

       /* if (name.equalsIgnoreCase("Rick")) {
            student = students[0];
        }
        else if (name.equalsIgnoreCase("Scooby")) {
            student = students[1];
        }
        else if (name.equalsIgnoreCase("Keisha")) {
            student = students[2];
        }
        else if (name.equalsIgnoreCase("Dante")) {
            student = students[3];
        }
        else {
            System.out.println("Student not found!");
        }*/

        return student;
    }
}



