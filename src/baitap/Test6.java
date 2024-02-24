package baitap;

import java.util.*;

public class Test6 {
  private static void handle1(int[] arr, int[] arr1) {
    int x = 0;
    int y =0;
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i+1; j < arr.length; j++) {
        if (arr1[i] > arr1[j]) {
          y = arr1[i];
          arr1[i] = arr1[j];
          arr1[j] = y;
          x = arr[i];
          arr[i] = arr[j];
          arr[j] = x;
        }
      }
    }
  }

  private static int[] handle(int[] arr) {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
      if (!list.contains(arr[i])) {
        list.add(arr[i]);
      }
    }
    Collections.sort(list);
    int arr1[] = new int[list.size()];
    for (int i = 0; i < list.size(); i++) {
      arr1[i] = list.get(i);
    }

    return arr1;
  }

  private static   int[] topKFrequent(int[] nums, int k) {

    Map<Integer, Integer> map = new TreeMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(nums[i])) {
        map.put(nums[i], map.get(nums[i]) + 1);
      } else {
        map.put(nums[i], 1);
      }
    }
    int arr[] = new int[map.size()];
    int x = 0;
    for (Integer i : map.values()) {
      arr[x++] = i;
    }
    int arr1[] = handle(nums);
    handle1(arr1, arr);
    int arr3[] = new int[k];
    int n = map.size() - 1;
    for (int i = 0; i < k; i++) {
      arr3[i] = arr1[n--];
    }
    return arr3;
  }

  public static void main(String[] args) {
    int arr[] = {3,0,1,0};
    int arr1[] = topKFrequent(arr, 1);
    for (int i : arr1) {
      System.out.println(i);
    }
  }
}

