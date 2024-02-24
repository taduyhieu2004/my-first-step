package leetcode;

public class Ex41 {
    private static int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n ; i++) {
            int sum = 0;
            sum += nums[i];
            if (sum == k) {
                count++;
            }
            for (int j = i + 1; j < n; j++) {
                sum += nums[j];
                if (sum == k) {
                    count++;
                }
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(subarraySum(arr, 3));
    }
}
