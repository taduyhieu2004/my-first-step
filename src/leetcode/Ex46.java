package leetcode;

import java.util.Arrays;

public class Ex46 {
    //    public void merge(int[] nums1, int m, int[] nums2, int n) {
    public static void main(String[] args) {
        int nums1[] = {1, 2, 3, 0, 0, 0};
        int nums2[] = {2, 5, 6};
        int m = 3;
        int n = 3;
        int arr[] = new int[m + n];
        int x = 0;
        for (int i = 0; i < m; i++) {
            arr[x] = nums1[i];
            x++;
        }
        for (int i = 0; i < n; i++) {
            arr[x] = nums2[i];
            x++;
        }
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.println(i);

        }

    }
}

