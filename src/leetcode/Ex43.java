package leetcode;

public class Ex43 {
    private static int[] handle(int[] nums, int target) {
        int[] arr = {-1, -1};
        int x = 0;
        int j = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                arr[x] = i;
                arr[j] = i;
                x++;
                if (x > 1) {
                   x=x-1;
                }
            }
        }
        return arr;


    }

    public static void main(String[] args) {
        int arr[] = {3, 3, 3};
        int arr2[] = handle(arr, 3);
        for (int a : arr2) {
            System.out.println(a);
        }

    }
}

