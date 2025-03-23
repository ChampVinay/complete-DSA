package multithreading;

public class OrderProcessor implements Runnable  {
    
    private Inventory inventory;
    private String productName;
    private int quantity;

    public OrderProcessor(Inventory inventory, String productName, int quantity) {
        this.inventory = inventory;
        this.productName = productName;
        this.quantity = quantity;
    }

    @Override
    public void run() {
        inventory.updateInventory(productName, quantity);
    }
}
