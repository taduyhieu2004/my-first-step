package leetcode;

public class Ex4 {
    private static int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

    private static int handle(int[] nums) {
        int sum = 0;
        int maxsum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (maxsum < sum) {
                maxsum = sum;
            }
            if (sum < 0) {
                sum = 0;

            }
        }

        return maxsum;
    }

    public static void main(String[] args) {
        int maxsum = handle(arr);
        System.out.println(maxsum);
    }
}
