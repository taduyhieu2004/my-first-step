package baitap;

import java.util.ArrayList;
import java.util.List;

public class Test5 {
  private static boolean canJump(int[] nums) {
    List<Integer> list = new ArrayList<>();
    for(int i= 0; i< nums.length; i++){
      if(nums[i]==0){
        list.add(i);
      }
    }
    if(nums.length ==1){
      return true;
    }
    if(list.size()==0){
      return true;
    }
    int i =0 ;
    int x =0;
    while(i< list.get(x)){

      if(list.get(x) == nums.length -1 && nums[i] >= list.get(x)-i ){
        return true;
      }
      if(nums[i] > list.get(x)-i){
        x++;
      }else{
        i++;
      }

      if( x>list.size()-1){
        return true;
      }


    }
    return false;
  }

  public static void main(String[] args) {
    int arr[]={2,0,0};
    System.out.println(canJump(arr));
  }
}
