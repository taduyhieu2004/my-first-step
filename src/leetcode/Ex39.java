package leetcode;

import java.util.Arrays;

public class Ex39 {
    private static boolean checkSubarraySum(int[] nums, int k) {
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
            if (sum % k == 0) {
                return true;
            }
            int temp = sum;
            for (int j = 0; j < nums.length - 1; j++) {
                temp -= nums[j];
                if (temp % k == 0) {
                    return true;
                }
            }

        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr = {23, 2, 6, 4, 7};
        System.out.println(checkSubarraySum(arr, 13));
    }
}
