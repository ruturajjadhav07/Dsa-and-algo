public class MergeSort {

    // Method
    public static void mergeSort(int[] array) {
        int length = array.length;

        if (length <= 1) { // base case
            return;
        }

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        // copy element of original array in left and right array
        int i = 0; // left array
        int j = 0; // right array

        for (; i < length; i++) {
            if (i < middle) {
                leftArray[i] = array[i];
            } else {
                rightArray[j] = array[i];
                j++;
            }
        }

        // recursion condition
        mergeSort(leftArray);
        mergeSort(rightArray);

        // helper call
        merge(leftArray, rightArray, array);

    }

    // Helper method

    public static void merge(int[] leftArray, int[] rightArray, int[] array) { // array of integers [] [] []
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;

        int i = 0; // to keep track of original array
        int l = 0; // for left array
        int r = 0; // for right array

        // checking condition for merging
        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }

        // for remaining one element
        while (l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }

        while (r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }

    public static void main(String[] args) {

        int[] array = { 4, 1, 9, 7, 2, 6, 5, 3, 8 };

        System.out.println("Before Sorting: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        mergeSort(array);

        System.out.println("\nAfter Sorting: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}