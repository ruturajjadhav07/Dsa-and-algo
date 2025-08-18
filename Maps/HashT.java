import java.util.*;

public class HashT {

    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>(10);

        table.put(10, "A");
        table.put(15, "B");
        table.put(25, "C");
        table.put(32, "D");

        for (Integer key : table.keySet()) {
            System.out.println(key.hashCode() % 10 + " " + "key" + " " + table.get(key));
        }

    }
}