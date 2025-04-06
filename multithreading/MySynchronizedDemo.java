package multithreading;

public class MySynchronizedDemo {

    // Class-level lock
    public static synchronized void classLevelLock() {
        System.out.println(Thread.currentThread().getName() + " has acquired class-level lock");
        try {
            Thread.sleep(2000); // Simulate some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " has released class-level lock");
    }

    // Object-level lock
    public synchronized void objectLevelLock() {
        System.out.println(Thread.currentThread().getName() + " has acquired object-level lock");
        try {
            Thread.sleep(2000); // Simulate some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " has released object-level lock");
    }

    public static void main(String[] args) {
        MySynchronizedDemo demo = new MySynchronizedDemo();

        // Thread for class-level lock
        Thread t1 = new Thread(() -> MySynchronizedDemo.classLevelLock(), "Thread-1");

        // Thread for object-level lock
        Thread t2 = new Thread(() -> demo.objectLevelLock(), "Thread-2");

        // Thread for another object-level lock
        Thread t3 = new Thread(() -> demo.objectLevelLock(), "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
