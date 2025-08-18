import java.util.*;

public class MinHeap {
    public static void main(String[] args) {
        // ✅ Min Heap (default behavior of PriorityQueue)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Insert elements
        minHeap.add(40);
        minHeap.add(10);
        minHeap.add(30);
        minHeap.add(20);
        minHeap.add(5);

        System.out.println("Min Heap: " + minHeap);

        // Peek (smallest element)
        System.out.println("Peek (min): " + minHeap.peek());

        // Poll elements to sort them
        System.out.print("Sorted order: ");
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }
    }
}
