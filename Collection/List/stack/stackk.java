
import java.util.*;

public class stackk {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Initial stack: " + stack); // [10, 20, 30]

        // Peek at the top element (does not remove)
        System.out.println("Peek (top element): " + stack.peek()); // 30

        // Pop (remove) the top element
        System.out.println("Popped element: " + stack.pop()); // 30
        System.out.println("Stack after pop: " + stack); // [10, 20]

        // Check if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty()); // false

        // Search for an element (1-based position from top)
        System.out.println("Position of 10 from top: " + stack.search(10)); // 2

        // Push more elements
        stack.push(40);
        stack.push(50);
        System.out.println("Stack after pushing 40 and 50: " + stack); // [10, 20, 40, 50]

        // Loop through the stack (top to bottom)
        System.out.println("Traversing stack (top to bottom):");
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }

        // Clear the stack manually
        stack.clear();
        System.out.println("Stack after clear(): " + stack); // []
    }
}
