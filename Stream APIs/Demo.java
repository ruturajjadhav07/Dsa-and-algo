import java.util.*;

public class Demo {
    public static void main(String[] args) {
        // Create a list of integers from 1 to 10
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        // Add a few duplicate values to demonstrate distinct()
        list.add(2);
        list.add(4);

        // Print the original list
        System.out.println("Original List: " + list);

        // Stream operations
        list.stream()

                // 🔹 filter: keep only even numbers
                .filter(n -> n % 2 == 0)

                // 🔹 map: square each number
                .map(n -> n * n)

                // 🔹 distinct: remove duplicate squares
                .distinct()

                // 🔹 sorted: sort the squared values in ascending order
                .sorted()

                // 🔹 skip: skip the first result
                .skip(1)

                // 🔹 limit: take only the next 3 values
                .limit(3)

                // 🔹 peek: for debugging - print each value before final output
                .peek(n -> System.out.println("Processing: " + n))

                // 🔹 forEach: terminal operation to print each final result
                .forEach(System.out::println); // using method reference (::)
    }
}

// Even
// numbers→[2,4,6,8,10,2,4]→Squared→[4,16,36,64,100,4,16]→Distinct&Sorted→[4,16,36,64,100]→

// skip(1) → [16, 36, 64] → limit(3)