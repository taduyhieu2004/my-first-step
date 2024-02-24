package leetcode;

public class Ex13 {
    private static int handle(int[] nums) {
        int i = 1;
        int count = 1;
        int k = 0;

        while (i < nums.length) {
            if (nums[i] > nums[i - 1]) {
                count = 1;
            } else {
                count++;
            }

            if (count < 3) {
                k++;
                nums[k] = nums[i];
            }

            i++;
        }

        return k+1 ;
    }


    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2,2};
        int k = handle(arr);
        for (int i = 0; i < k; i++) {
            System.out.println(arr[i]);
        }
    }
}
