package queue;

public class Intro_Queue {
   
    static class Queue {
        private int front, rear, size;
        private int capacity;
        private int array[];

        public Queue(int capacity) {
            this.capacity = capacity;
            front = this.size = 0;
            rear = capacity - 1;
            array = new int[this.capacity];
        }

        // Queue is full when size becomes equal to the capacity
        boolean isFull(Queue queue) {
            return (queue.size == queue.capacity);
        }

        // Queue is empty when size is 0
        boolean isEmpty(Queue queue) {
            return (queue.size == 0);
        }

        // Method to add an item to the queue.
        // It changes rear and size
        void enqueue(int item) {
            if (isFull(this))
                return;
            this.rear = (this.rear + 1) % this.capacity;
            this.array[this.rear] = item;
            this.size = this.size + 1;
            System.out.println(item + " enqueued to queue");
        }

        // Method to remove an item from queue.
        // It changes front and size
        int dequeue() {
            if (isEmpty(this))
                return Integer.MIN_VALUE;

            int item = this.array[this.front];
            this.front = (this.front + 1) % this.capacity;
            this.size = this.size - 1;
            return item;
        }

        // Method to get front of queue
        int front() {
            if (isEmpty(this))
                return Integer.MIN_VALUE;

            return this.array[this.front];
        }

        // Method to get rear of queue
        int rear() {
            if (isEmpty(this))
                return Integer.MIN_VALUE;

            return this.array[this.rear];
        }

        void display() {
            if (isEmpty(this)) {
                System.out.println("Queue is empty");
                return;
            }
            System.out.println("Front Element :: " + front());
            System.out.println("Rear Element :: " + rear());
            System.out.print("Queue elements are :: ");
            for (int i = 0; i < size; i++) {
                System.out.print(array[(front + i) % capacity] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create a queue of capacity 4
        Queue q = new Queue(4);

        // Insert elements in the queue
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        // Print Queue elements
        q.display();

        // Delete elements from the queue
        q.dequeue();
        q.dequeue();

        // Print Queue elements
        q.display();

        // Insert elements in the queue
        q.enqueue(60);
        q.enqueue(70);

        // Print Queue elements
        q.display();
    }
}
