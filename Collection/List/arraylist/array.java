
import java.util.*;

public class array {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.remove(list.get(1));
        System.out.println(list);

        list.add(1, 2);
        System.out.println(list);

        list.forEach(System.out::println);

        list.clear();

        System.out.println(list);
    }
}
