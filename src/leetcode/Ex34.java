package leetcode;

import java.util.Arrays;

public class Ex34 {
    private static int minMoves(int[] nums) {
        Arrays.sort(nums);
        int min = 0;
        for (int i = 1; i < nums.length; i++) {
            min += nums[i] - nums[0];

        }
        return min;
    }



    public static void main(String[] args) {
        int nums[] = {1, 3, 5};
        System.out.println(minMoves(nums));
    }
}

