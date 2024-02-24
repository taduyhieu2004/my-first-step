package leetcode;

import java.util.Arrays;

public class Ex25 {
    private static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        while (i < nums.length - 1) {
            if (nums[i] == nums[i + 1]) {
                return nums[i];

            } else {
                i++;
            }
        }
        return 0;
    }
}
