import java.util.*;

// insert and delete
public class MaxHeap {
    public static void main(String[] args) {
        // Max Heap using reverseOrder comparator
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Insert elements 8,7,6,5,4,3,2
        int[] elements = { 8, 7, 6, 5, 4, 3, 2 };
        for (int e : elements) {
            maxHeap.add(e);
        }

        System.out.println("Max Heap before inserting 9: " + maxHeap);

        // Insert 9
        maxHeap.add(9);

        System.out.println("Max Heap after inserting 9: " + maxHeap);

        // Show elements in order by repeatedly polling
        System.out.print("Elements in order (polling): ");
        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " ");
        }
    }
}
