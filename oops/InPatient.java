package oops;

public class InPatient extends Patient {
    
    private int roomNumber;
    private String nurse;

    public InPatient(int patientID,String name,int age,int roomNumber,String nurse){
        super(patientID,name,age);
        this.roomNumber = roomNumber;
        this.nurse = nurse;
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }
    public void setRoomNumber(int roomNumber){
        this.roomNumber = roomNumber;
    }

    public String getNurse(){
        return this.nurse;
    }
    public void setNurse(String nurse){
        this.nurse = nurse;
    }
}
