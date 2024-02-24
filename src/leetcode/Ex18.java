package leetcode;

import java.util.Arrays;

public class Ex18 {
    private static int findMax(int[] nums) {

        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        return max;
    }

    private static int handleMaxProduct(int[] nums) {
        int max = findMax(nums);
        for (int i = 0; i < nums.length; i++) {
            int temp = 1;
            for (int j = i; j < nums.length; j++) {
                temp *= nums[j];
                if (max < temp) {
                    max = temp;
                }
            }
        }
        return max;
    }

    private static int nums[] = {-1, -2, -3, 0};

    public static void main(String[] args) {
        System.out.println(handleMaxProduct(nums));

    }
}
