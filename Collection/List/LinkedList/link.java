import java.util.*;

public class link {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        // Add elements to the list
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("Initial list: " + list); // [1, 2, 3]

        // Add element at the beginning
        list.addFirst(4);
        System.out.println("After addFirst(4): " + list); // [4, 1, 2, 3]

        // Add element at the end
        list.addLast(5);
        System.out.println("After addLast(5): " + list); // [4, 1, 2, 3, 5]

        // Peek at the first element (does not remove it)
        System.out.println("Peek (first element): " + list.peek()); // 4

        // Peek at the last element
        System.out.println("PeekLast (last element): " + list.peekLast()); // 5

        // Remove first element
        list.removeFirst();
        System.out.println("After removeFirst(): " + list); // [1, 2, 3, 5]

        // Remove last element
        list.removeLast();
        System.out.println("After removeLast(): " + list); // [1, 2, 3]

        // Add at specific index
        list.add(1, 10);
        System.out.println("After add(1, 10): " + list); // [1, 10, 2, 3]

        // Get element at index
        System.out.println("Element at index 2: " + list.get(2)); // 2

        // Check if list contains a value
        System.out.println("Contains 10? " + list.contains(10)); // true

        // Remove a specific element
        list.remove(Integer.valueOf(10));
        System.out.println("After removing 10: " + list); // [1, 2, 3]

        // Clear the list
        list.clear();
        System.out.println("After clear(): " + list); // []
    }
}
