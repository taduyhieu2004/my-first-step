package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex50 {
    private static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i++;
                j++;

            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                i++;
            }
        }
        int arr[] = new int[list.size()];
        for (int k = 0; k < arr.length; k++) {
            arr[k] = list.get(k);
        }
        return arr;

    }

    public static void main(String[] args) {
        int nums1[] = {4,9,5};
        int nums2[] = {9,4,9,8,4};
        int arr[] = intersect(nums1, nums2);
        for (int a : arr
        ) {
            System.out.println(a);

        }

    }
}

