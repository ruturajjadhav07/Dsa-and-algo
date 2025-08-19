// hashset

import java.util.*;

public class hash {
    public static void main(String[] args) {
        // Create a HashSet of Strings
        Set<String> hashSet = new HashSet<>();

        // Add elements to the set
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Banana"); // Duplicate - will be ignored
        hashSet.add("Grapes");

        // Print the HashSet (order is not guaranteed)
        System.out.println("Original HashSet: " + hashSet);

        // Check the size of the set
        System.out.println("Size: " + hashSet.size());

        // Check if an element exists
        System.out.println("Contains 'Apple'? " + hashSet.contains("Apple"));
        System.out.println("Contains 'Mango'? " + hashSet.contains("Mango"));

        // Remove an element
        hashSet.remove("Orange");
        System.out.println("After removing 'Orange': " + hashSet);

        // Iterate using for-each loop
        System.out.println("Iterating using for-each:");
        for (String fruit : hashSet) {
            System.out.println(fruit);
        }

        // Iterate using iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Convert to array
        Object[] array = hashSet.toArray();
        System.out.println("Converted to array:");
        for (Object obj : array) {
            System.out.println(obj);
        }

        // Clone the HashSet
        HashSet<String> clonedSet = (HashSet<String>) ((HashSet<String>) hashSet).clone();
        System.out.println("Cloned HashSet: " + clonedSet);

        // Clear the original set
        hashSet.clear();
        System.out.println("After clear(), is empty? " + hashSet.isEmpty());
    }
}
