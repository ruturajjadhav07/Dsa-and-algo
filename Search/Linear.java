public class Linear {

    public static void linear(int[] array, int target) {
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                found = true;
                System.out.println("Element found at index " + i);
            }
        }
        if (!found) {
            System.out.println("Element not found");
        }
    }

    public static void main(String[] args) {
        int[] array = { 4, 1, 9, 7, 2, 6, 5, 3, 8 };
        int target = 5;

        linear(array, target);
    }
}
