package baitap;

import java.util.HashMap;
import java.util.Map;

public class Test8 {
  private static int search(int[] nums, int target) {
    int left =0;
    int right = nums.length -1;
    int mid = (left+right)/2;
    int i =0;
    while( nums[mid ]!= target ){
      mid = (left+right)/2;
      if(nums[mid] >target){
        right =mid-1;
      }else if ( nums[mid] <target){
        left =mid+1;
      }
    }
    return mid;

  }

  public static void main(String[] args) {
    int []arr ={-1,0,3,5,9,12};
    System.out.println(search(arr,9));
    Map<String,String> map = new HashMap<String,String>();
    String s1;

  }
}
