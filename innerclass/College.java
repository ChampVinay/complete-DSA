package innerclass;

public class College {
    String college;
    String affilitation;
    String principle;

    College(String college,String affilitation,String principle){

        this.college=college;
        this.affilitation=affilitation;
        this.principle=principle;
    }


    class Student{
        String name;
        int rollNo;
        String branch;
    
        Student(String name,int rollNo,String branch){
            this.name=name;
            this.rollNo=rollNo;
            this.branch=branch;
        }

        public void display(){
            System.out.println("college name :: "+college);
            System.out.println("principle name :: "+ principle);
            System.out.println("affilated :: "+ affilitation);
        }
    }

    public void method2(){
        Student s=new Student("Donald", 45, "Electrical");
        s.display();
    }

    public static void main(String[] args) {
        College c=new College("VMIT", "JUT", "Vinay malothra");
        c.method2();
    }
}
