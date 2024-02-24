package leetcode;

import java.util.Arrays;

public class Ex22 {
    private static int handle (int nums[],int taget){
        Arrays.sort(nums);
        int n= nums.length;
        int k=nums[n-taget];
        return k;

    }


}
