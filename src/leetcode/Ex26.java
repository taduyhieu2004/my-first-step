package leetcode;

import java.util.Arrays;

public class Ex26 {
    private static int lengthOfLIS(int[] nums) {
        int n = nums.length;


        int value[] = new int[n];
        for (int i = 0; i < n; i++) {
            value[i] = 1;
        }
        for (int i = 0; i < n - 1; i++) {

            for (int j = i + 1; j < n; j++) {
                if (nums[j] > nums[i] && value[j] < value[i] + 1) {
                    value[j] = value[i] + 1;
                }
            }

        }
        Arrays.sort(value);
        return value[n - 1];


    }

    public static void main(String[] args) {
        int nums[] = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(lengthOfLIS(nums));
    }
}
