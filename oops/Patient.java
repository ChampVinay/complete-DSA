package oops;

public class Patient {
    private int patientID;
    private String name;
    private int age;

    public Patient(int patientID, String name, int age) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
    }

    public int getPatientID(){
        return this.patientID;
    }
    public void setPatientID(int patientID){
        this.patientID = patientID;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
