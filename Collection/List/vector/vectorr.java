// Vector is a legacy class in Java (introduced in JDK 1.0).
// It is synchronized, meaning it's thread-safe.
// It behaves like a resizable array, similar to ArrayList, but slower due to synchronization.
// It's part of the java.util package and implements List, RandomAccess, Cloneable, and Serializable interfaces.

import java.util.*;

public class vectorr {
    public static void main(String[] args) {
        // Creating a Vector of Integers
        Vector<Integer> vector = new Vector<>();

        // Add elements
        vector.add(10);
        vector.add(20);
        vector.add(30);
        System.out.println("Vector: " + vector); // [10, 20, 30]

        // Add element at specific index
        vector.add(1, 15);
        System.out.println("After add at index 1: " + vector); // [10, 15, 20, 30]

        // Access element at index
        System.out.println("Element at index 2: " + vector.get(2)); // 20

        // Remove element
        vector.remove(2); // remove element at index 2
        System.out.println("After removing index 2: " + vector); // [10, 15, 30]

        // Check size
        System.out.println("Size of vector: " + vector.size()); // 3

        // Check if vector contains an element
        System.out.println("Contains 15? " + vector.contains(15)); // true

        // Traverse using for loop
        System.out.println("Traversing using for loop:");
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }

        // Traverse using for-each
        System.out.println("Traversing using for-each:");
        for (Integer num : vector) {
            System.out.println(num);
        }

        // Clear the vector
        vector.clear();
        System.out.println("Vector after clear(): " + vector); // []
    }
}
