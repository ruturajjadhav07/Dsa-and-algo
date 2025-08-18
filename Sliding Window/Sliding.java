// with given size
public class Sliding {
    public static long maximumSubarraySum(int[] nums, int k) {

        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }

        int maxSum = currentSum;

        for (int i = k; i < nums.length; i++) {
            currentSum += nums[i] - nums[i - k];
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {

        int[] nums = { 1, 5, 4, 2, 9, 9, 9 };
        int k = 3;

        System.out.println(maximumSubarraySum(nums, k));
    }
}
