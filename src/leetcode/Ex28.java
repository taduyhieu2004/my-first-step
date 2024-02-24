package leetcode;

import java.util.Arrays;

public class Ex28 {
    private static boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (nums[i] <= a) {
                a = nums[i];
            } else if (nums[i] <= b) {
                b = nums[i];
            } else if (nums[i] > b && b > a) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int nums[] = {20, 100, 10, 12, 5, 13};
        System.out.println(increasingTriplet(nums));
    }
}
