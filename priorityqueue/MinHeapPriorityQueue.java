package priorityqueue;

public class MinHeapPriorityQueue {
    
    private int[] heap;
    private int size;
    private int capacity;

    public MinHeapPriorityQueue(int capacity) {
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

    public int extractMin() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }
        int minValue = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);
        return minValue;
    }

    public int peekMin() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }
        return heap[0];
    }

    private void heapifyUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (heap[index] < heap[parentIndex]) {
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
            int smallerChildIndex = leftChildIndex;

            if (rightChildIndex < size && heap[rightChildIndex] < heap[leftChildIndex]) {
                smallerChildIndex = rightChildIndex;
            }

            if (heap[index] > heap[smallerChildIndex]) {
                swap(index, smallerChildIndex);
                index = smallerChildIndex;
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

    public boolean isEmpty() {
        return size == 0;
    }
    public int getSize() {
        return size;
    }
    public int getCapacity() {
        return capacity;
    }
    public int[] getHeap() {
        return heap;
    }
    public void setHeap(int[] heap) {
        this.heap = heap;
    }

    public static void main(String[] args) {
        MinHeapPriorityQueue minHeap = new MinHeapPriorityQueue(10);
        minHeap.insert(5);
        minHeap.insert(3);
        minHeap.insert(8);
        minHeap.insert(1);

        // System.out.println("Minimum: " + minHeap.peekMin()); // Output: 1
        // System.out.println("Extracted Minimum: " + minHeap.extractMin()); // Output: 1
        // System.out.println("New Minimum: " + minHeap.peekMin()); // Output: 3
        // //print object of minHeap
        // System.out.println("Heap Size: " + minHeap.getSize()); // Output: 3

        // Print elements in sorted order by extracting min repeatedly
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.extractMin() + " ");
        }


    }
}
