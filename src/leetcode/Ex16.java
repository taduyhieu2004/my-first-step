package leetcode;

import java.util.Arrays;

public class Ex16 {
    private static int handle(int[] nums) {
        int x = 0;
        int i=1;
        Arrays.sort(nums);
     while (i<nums.length){
         if(nums[i]==nums[i-1]){
             x=nums.length-1;
         }else {
             x=i-1;
             break;
         }
         i+=2;


     }
        return nums[x];
    }

    private static int[] arr = {4,1,2,1,2};

    public static void main(String[] args) {
        System.out.println(handle(arr));
    }
}
