package ClassandMethod3;

import ClassandMethod.patient;

public class HospitalMain {

    Hospital hospital = new Hospital("Florence", new patient(), "malaria", 18);
    Hospital florenceHospital =  new Hospital("John", new patient(), "malaria", 18);

    public void test() {
        hospital.setName("David");
        System.out.println(hospital.getName());
        System.out.println(florenceHospital.getName()+","+florenceHospital.getIllness());
    }
}
