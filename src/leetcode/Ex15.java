package leetcode;

import java.util.Arrays;

public class Ex15 {
    private static int Sortnums(int []nums){
        Arrays.sort(nums);
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[k]){
                k++;
                nums[k]=nums[i];

            }
        }
        return k+1;

    }

    private static int handle(int []nums) {
        int k = 1;
        int longestConsecutive = 1;
        int n = Sortnums(nums);
        int j=nums.length;
        if(j==1){
            return 1;
        }
        for (int i = 0; i < n -1; i++) {
            if (nums[i + 1] - nums[i] == 1) {
                k++;
            } else {
                k = 1;
            }
            if (longestConsecutive < k)
                longestConsecutive = k;
        }
        return longestConsecutive;
    }

    public static void main(String[] args) {
        int arr[]={1,2,0,1};
        System.out.println(handle(arr));

    }
}
