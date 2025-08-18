public class recursion {

    public static void walk(int num) {

        if (num == 5) {
            return;
        }
        System.out.print(num);

        walk(num + 1);

    }

    public static void main(String[] args) {
        walk(1);
    }
}
