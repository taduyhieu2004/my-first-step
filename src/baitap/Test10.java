package baitap;

import java.util.Arrays;

public class Test10 {
  private static int findNumberOfLIS(int[] nums) {
    int arr[] = new int[nums.length];
    int arr1[]= new int [nums.length];
    Arrays.fill(arr1,1);
    for (int i = 0; i < nums.length; i++) {
      arr[i] = 1;
    }
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < i; j++) {
        if (nums[i] > nums[j]) {
          arr[i] = Math.max(arr[i], arr[j] + 1);
          if(arr[i] == arr[j]+1){
            arr1[i]++;
          }
        }
      }
    }
    Arrays.sort(arr);
    int count = 0;
    int maxCount = 0;
    for (int i = arr.length - 1; i >= 0; i--) {
      if (arr[i] == arr[arr.length - 1] - 1) {
        count++;
      } else if(arr[i] < arr[arr.length - 1]-1){
        break;
      }
    }
    for (int i = arr.length - 1; i >= 0; i--) {
      if (arr[i] == arr[arr.length - 1]) {
        maxCount++;
      } else {
        break;
      }
    }
    if (count == 0 && maxCount == 0) {
      return 1;
    }
    if(maxCount <count){
      maxCount = count;
    }
    return maxCount;
  }
  public static void main(String[] args) {
    int arr[] = {2,2,2,2,2};
    System.out.println(findNumberOfLIS(arr));
  }
}

