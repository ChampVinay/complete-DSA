package multithreading;

public class MyThread2 implements Runnable {


    static
    {
     System.out.println("hii this is static block !!");
    }

    @Override
    public void run() {
        try {
            for(int i=0;i<10;i++){
                System.out.print(i+" ,"+" ");
            }
           // double d=0/10;
            System.out.println("value of d :: ");
        } catch (ArithmeticException e) {
            throw new ArithmeticException("when perform divide operation then throw error :: "+ e.getMessage());
        }
        finally{
            double d=10/0;
            System.out.println("value of d :: "+ d);
        }
        
    }

    public static void main(String[] args) {
        
        MyThread2 t=new MyThread2();
        Thread t2=new Thread(t);
        t2.start();
    }
    
}
