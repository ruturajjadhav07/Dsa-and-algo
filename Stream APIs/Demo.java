import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3, 4, 5, 6, 7);

        nums.forEach(n -> System.out.println(n * 2));

    }
}
