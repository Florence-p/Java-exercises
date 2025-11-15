package ClassandMethod3;

import ClassandMethod.patient;

public class Hospital {
    private String name;
    int age;
    String illness;
    patient patient;


    public Hospital(String name, patient patient, String illness, int age) {
        this.name = name;
        this.patient = patient;
        this.illness = illness;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public patient getPatient() {
        return patient;
    }

    public void setPatient(patient patient) {
        this.patient = patient;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
