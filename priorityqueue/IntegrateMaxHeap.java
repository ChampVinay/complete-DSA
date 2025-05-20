package priorityqueue;

public class IntegrateMaxHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public IntegrateMaxHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    public void insert(int value) {
        if (size == capacity) {
            throw new IllegalStateException("Heap is full");
        }
        heap[size] = value;
        size++;
        heapifyUp(size - 1);
    }

    public int extractMax() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }
        int maxValue = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);
        return maxValue;
    }

    public int peekMax() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }
        return heap[0];
    }

    private void heapifyUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (heap[index] > heap[parentIndex]) {
                swap(index, parentIndex);
                index = parentIndex;
            } else {
                break;
            }
        }
    }

    private void heapifyDown(int index) {
        while (index < size / 2) {
            int leftChildIndex = 2 * index + 1;
            int rightChildIndex = 2 * index + 2;
            int largerChildIndex = leftChildIndex;

            if (rightChildIndex < size && heap[rightChildIndex] > heap[leftChildIndex]) {
                largerChildIndex = rightChildIndex;
            }

            if (heap[index] < heap[largerChildIndex]) {
                swap(index, largerChildIndex);
                index = largerChildIndex;
            } else {
                break;
            }
        }
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public static void main(String[] args) {
        IntegrateMaxHeap maxHeap = new IntegrateMaxHeap(11);
        maxHeap.insert(3);
        maxHeap.insert(5);
        maxHeap.insert(1);
        maxHeap.insert(10);
        maxHeap.insert(2);
        maxHeap.insert(7);
        maxHeap.insert(0);
         System.out.println("Max value: " + maxHeap.extractMax()); // 10
        // System.out.println("Next max value: " + maxHeap.peekMax()); // 5
        while (maxHeap.size > 0) {
            System.out.print(" " + maxHeap.extractMax());
        }
    }
    
}
