package leetcode;

import java.util.Arrays;

public class Ex33 {
    private static boolean canPartition(int[] nums) {
        int k = sum(nums);
        if (k % 2 != 0) {
            return false;

        }
        int n = nums.length ;
        Arrays.sort(nums);

        for (int i=0;i<n;i++){
            int temp=0;
            for (int j=i;j<n;j++){
                temp+=nums[j];
                if(temp==k/2){
                    return true;

                }
            }
        }
        return false;
    }

    private static int sum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

//    private static boolean canPartition(int[] nums) {
//        int i = 0;
//        int j = nums.length - 1;
//        Arrays.sort(nums);
//
//        int sum1 = 0;
//        int sum2 = nums[j];
//        while (i < j) {
//            sum1 += nums[i++];
//
//            if (sum1 >= sum2) {
//                j--;
//                sum2 += nums[j];
//
//            }
//
//
//        }
//        if (sum1 == sum2) {
//            return true;
//        }
//        return false;
//    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,2};
        System.out.println(canPartition(nums));
    }
}
