import java.util.*;

public class treesetex {
    public static void main(String[] args) {
        // Create a TreeSet of Strings (sorted in natural order)
        TreeSet<String> treeSet = new TreeSet<>();

        // Add elements
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Grapes");
        treeSet.add("Mango");
        treeSet.add("Apple"); // Duplicate, will be ignored

        // Uncommenting this will throw NullPointerException
        // treeSet.add(null);

        // Print the TreeSet (sorted order)
        System.out.println("TreeSet (sorted): " + treeSet);

        // Size of the set
        System.out.println("Size: " + treeSet.size());

        // Check if it contains a specific element
        System.out.println("Contains 'Apple'? " + treeSet.contains("Apple"));
        System.out.println("Contains 'Pineapple'? " + treeSet.contains("Pineapple"));

        // Remove an element
        treeSet.remove("Grapes");
        System.out.println("After removing 'Grapes': " + treeSet);

        // First and last elements
        System.out.println("First: " + treeSet.first());
        System.out.println("Last: " + treeSet.last());

        // Iterate using for-each loop
        System.out.println("Iterating (for-each):");
        for (String fruit : treeSet) {
            System.out.println(fruit);
        }

        // HeadSet and TailSet
        System.out.println("HeadSet (before 'Mango'): " + treeSet.headSet("Mango"));
        System.out.println("TailSet (from 'Mango'): " + treeSet.tailSet("Mango"));

        // SubSet
        System.out.println("SubSet ('Apple' to 'Mango'): " + treeSet.subSet("Apple", "Mango"));

        // Clear the set
        treeSet.clear();
        System.out.println("After clear(): " + treeSet);
    }
}
