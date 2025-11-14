package ClassandMethod;

public class patient {
    String name = "Ken";
    int age = 36;
    String illness = "Malaria";
    boolean admitted = false;

    void admitPatient(){
        admitted = true;
        System.out.println(name + " has been admitted");

    }
    void  dischargePatient() {
        admitted = true;
        System.out.println(name + " has been discharged");
    }
    void showDetails(){
        System.out.println("Patient Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Illness: " + illness);
        System.out.println("Admitted: " + admitted);





    }




}
