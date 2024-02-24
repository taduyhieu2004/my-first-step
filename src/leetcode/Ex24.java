package leetcode;

import java.util.Arrays;

public class Ex24 {
    private static int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int x = 0;
        if (n == 2) {
            return nums;
        }
        int arr[] = new int[2];

        int i = 0;
        int j = 1;
        while (j < n) {
            if (nums[i] == nums[j]) {
                j += 2;
                i += 2;
            } else {
                arr[x] = i;
                x++;
                i++;
                j++;
                if (x == 2) {
                    break;
                }
            }
            if (arr[1] == 0) {
                arr[1] = n - 1;
            }
        }
        int arr2[] = {nums[arr[0]], nums[arr[1]]};
        return arr2;


    }


    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4, 5, 5};
        int[] arr = singleNumber(nums);
        for (int a : arr) {
            System.out.println(a);
        }
    }
}

