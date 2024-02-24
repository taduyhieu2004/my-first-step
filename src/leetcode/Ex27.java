package leetcode;

import java.util.Arrays;

public class Ex27 {
    private static void wiggleSort(int[] nums) {
        int n = nums.length - 1;
        int arr[] = new int[n+1];
        int x = 0;
        for (int a : nums) {
            arr[x] = a;
            x++;
        }

        Arrays.sort(arr);
        for (int k = 1; k < nums.length; k += 2) {
            nums[k] = arr[n--];
        }

        for (int k = 0; k < nums.length; k += 2) {
            nums[k] = arr[n--];
        }


        for (int a : nums) {
            System.out.println(a);
        }


    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 5, 6};
        wiggleSort(nums);
    }
}


