package leetcode;

import java.util.*;

public class Ex49 {
    private static int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        int x = 0;
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], 1);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i])) {
                set.add(nums2[i]);
            }
        }
        int[] arr = new int[set.size()];
        for (int i : set) {
            arr[x] = i;
            x++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int nums1[] = {1, 2, 2, 1};
        int nums2[] = {2, 2};
        int arr[] = intersection(nums1, nums2);
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}



