package leetcode;

import java.util.Arrays;

public class Ex17 {
    private static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 1;
        int x = 0;
        int n = nums.length;
        while (i < n - 1) {
            if (nums[i] == nums[i - 1]) {
                x = n - 1;
            } else {
                x = i - 1;
                break;
            }
            i += 3;
        }
        return nums[x];
    }

    public static void main(String[] args) {
        int arr[] = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 4, 4, 4};
        System.out.println(singleNumber(arr));
    }
}
