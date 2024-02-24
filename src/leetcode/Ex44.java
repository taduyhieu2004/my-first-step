package leetcode;

public class Ex44 {
    private static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int pos = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] >= target) {
                pos = i;
                break;
            } else {
                pos = n;
            }


        }
        return pos;
    }
}
