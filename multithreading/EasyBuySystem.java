package multithreading;

public class EasyBuySystem {
    
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.addProduct("Laptop", 10);
        inventory.addProduct("Phone", 15);

        // Simulating multiple concurrent orders
        Thread t1 = new Thread(new OrderProcessor(inventory, "Laptop", 3));
        Thread t2 = new Thread(new OrderProcessor(inventory, "Laptop", 5));
        Thread t3 = new Thread(new OrderProcessor(inventory, "Phone", 7));

        t1.start();
        t2.start();
        t3.start();
    }
}
