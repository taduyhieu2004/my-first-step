package baitap;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
  private static int[] asteroidCollision(int[] asteroids) {
    List<Integer> list = new ArrayList<>();
    for(int i : asteroids){
      list.add(i);
    }
    int i =0;

    while(i<list.size()-1){
      if(list.get(i) >0 && list.get(i+1)<0){
        if(list.get(i)> Math.abs(list.get(i+1))){
          list.remove(list.get(i+1));
        }else if(list.get(i)== Math.abs(list.get(i+1))){

          list.remove(i);
          list.remove(i);
        }else{
          list.remove(list.get(i));
        }
        if(i>0){
          i--;
        }
      }else{
        i++;
      }
    }
    int arr[]=new int[list.size()];
    for(int j =0; j<arr.length; j++){
      arr[j]= list.get(j);
    }
    return arr;
  }

  public static void main(String[] args) {
    int a[]= {-2,-1,2,-2};
    int arr[]=asteroidCollision(a);
    for(int i:arr){
      System.out.println(i);
    }

  }
}
