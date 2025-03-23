package multithreading;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

class Inventory {
    private ConcurrentHashMap<String, Integer> stock = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, ReentrantLock> locks = new ConcurrentHashMap<>();

    // Method to add initial stock
    public void addProduct(String productName, int quantity) {
        stock.put(productName, quantity);
        locks.put(productName, new ReentrantLock()); // Create a lock for each product
    }

    // Thread-safe inventory update method
    public void updateInventory(String productName, int quantity) {
        if (!stock.containsKey(productName)) {
            System.out.println("Product not found!");
            return;
        }

        // Acquire the lock for the specific product
        ReentrantLock lock = locks.get(productName);
        lock.lock();
        try {
            int currentStock = stock.get(productName);
            if (currentStock >= quantity) {
                stock.put(productName, currentStock - quantity);
                System.out.println(productName + " inventory updated. Remaining stock: " + stock.get(productName));
            } else {
                System.out.println("Insufficient stock for " + productName);
            }
        } finally {
            lock.unlock(); // Ensure the lock is released
        }
    }
}
