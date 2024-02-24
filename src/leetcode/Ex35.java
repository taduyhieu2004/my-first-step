package leetcode;

import java.util.Arrays;

public class Ex35 {
    private static int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int k = nums[n / 2];
        int count = 0;
        for (int i = 0; i < n; i++) {
            count += Math.abs(k - nums[i]);

        }
        return count;

    }


}
//        int n = nums.length;
//        if (n % 2 == 0) {
//            int average = findTheAverageValue(nums);
//            int count = 0;
//            for (int i = 0; i < nums.length; i++) {
//                count += Math.abs(average - nums[i]);
//            }
//            return count;
//        } else {
//            Arrays.sort(nums);
//            int average = nums[n / 2];
//            int count = 0;
//            for (int i = 0; i < nums.length; i++) {
//                count += Math.abs(average - nums[i]);
//            }
//            return count;
//
//        }
//
//    }
//
//    private static int findTheAverageValue(int nums[]) {
//        int sum = 0;
//        int n = nums.length;
//        for (int a : nums) {
//            sum += a;
//        }
//        int average = sum / n;
//        return average;
//    }
//}
