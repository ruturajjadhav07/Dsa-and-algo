
import java.util.TreeMap;

public class TreeM {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(3, "Apple");
        map.put(1, "Mango");
        map.put(2, "Cherry");

        System.out.println(map);

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());

        System.out.println(map.higherEntry(1));
        System.out.println(map.lowerEntry(3));

        for (int key : map.keySet()) {
            System.out.println("Key " + key + " has " + map.get(key));
        }
    }
}