package baitap;

import java.util.Arrays;

public class Test7 {
  private static int handle(int []arr, int n ,int amount){
    int count =0;
    int i = n;
    while( i >=0){
      if(amount >= arr[i]){
        amount -= arr[i];
        count ++;
      }else{
        i--;
      }

    }
    if(amount != 0){
      return -1;
    }
    return count;
  }

  private static int coinChange(int[] coins, int amount) {
    Arrays.sort(coins);
    int i = coins.length -1;
    while(i >=0){
      if(handle(coins, i, amount) != -1){
        return handle(coins, i, amount);
      }else{
        i--;
      }
    }
    return -1;

  }

  public static void main(String[] args) {
    int arr[]= {186,419,83,408};
    System.out.println(coinChange(arr,6249));
  }
}
