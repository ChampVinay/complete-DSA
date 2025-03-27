package oops;

public class InheritanceBasic {
    public static void main(String[] args) {
        
        InPatient inPatient = new InPatient(1, "John", 25, 101, "Jane");

        System.out.println("In-Patient Details:");
        System.out.println("Patient ID: " + inPatient.getPatientID());
        System.out.println("Name: " + inPatient.getName());
        System.out.println("Age: " + inPatient.getAge());
        System.out.println("Room Number: " + inPatient.getRoomNumber());

        java.sql.Date appointmentDate = java.sql.Date.valueOf("2021-10-01");
        OutPatient outPatient = new OutPatient(2, "Alice", 30, "Dr. Smith", appointmentDate);

        System.out.println("\nOut-Patient Details:");
        System.out.println("Patient ID: " + outPatient.getPatientID());
        System.out.println("Name: " + outPatient.getName());
        System.out.println("Age: " + outPatient.getAge());
    }
}
