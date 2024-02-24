package leetcode;

public class Ex5 {
    private static int[] height = {1,8,6,2,5,4,8,3,7};

    private static int handle(int[] height) {
        int max = 0;
        int n = height.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp;
                if (height[i] < height[j]) {
                    temp = height[i] * (j - i);
                } else {
                    temp = height[j] * (j - i);

                }
                if (max < temp) {
                    max = temp;

                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int max = handle(height);
        System.out.println(max);
    }
}
