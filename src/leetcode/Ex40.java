package leetcode;

public class Ex40 {
    private static int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int k = nums[n - 1];

        for (int i = 0; i < n; i += 2) {
            if (nums[i] != nums[i + 1]) {
                k = nums[i];
                break;
            }
        }
        return k;
    }
}
