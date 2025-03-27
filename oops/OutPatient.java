package oops;

import java.sql.Date;

public class OutPatient extends Patient {
    
    private String doctor;
    private Date appointmentDate;

    public OutPatient(int patientID,String name,int age,String doctor,Date appointmentDate){
        super(patientID,name,age);
        this.doctor = doctor;
        this.appointmentDate = appointmentDate;
    }

    public String getDoctor(){
        return this.doctor;
    }
    public void setDoctor(String doctor){
        this.doctor = doctor;
    }

    public Date getAppointmentDate(){
        return this.appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate){
        this.appointmentDate = appointmentDate;
    }
    
}
