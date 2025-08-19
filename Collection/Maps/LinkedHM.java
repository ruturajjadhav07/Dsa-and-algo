
import java.util.LinkedHashMap;

public class LinkedHM {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> name = new LinkedHashMap<>();

        name.put(3, "parth");
        name.put(1, "ruturaj");
        name.put(2, "aniruddha");

        System.out.println(name);

        System.out.println(name.get(1));

        // for (int i : name.keySet()) {
        // System.out.println(i + "" + name.get(i));
        // }

        System.out.println(name);
        // for (Map.Entry<Integer, String> entry : name.entrySet()) {
        // System.out.println(entry.getKey() + " -> " + entry.getValue());
        // }
    }
}
