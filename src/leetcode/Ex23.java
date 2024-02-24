package leetcode;

public class Ex23 {
    private static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int left = 1, right = 1;
        for (int i = 0; i < n; i++) {
            arr[i] = left;
            left *= nums[i];
        }
        for (int i = n - 1; i >= 0; i--) {
            arr[i] *= right;
            right *= nums[i];


        }
        return arr;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4};
        int arr[] = productExceptSelf(nums);
        for (int i : arr) {
            System.out.println(i);
        }
    }

}
