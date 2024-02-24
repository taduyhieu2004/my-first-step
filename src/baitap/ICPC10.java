package baitap;

import java.util.Scanner;
import java.util.Stack;

public class ICPC10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Stack<Integer> stack = new Stack<>();
    int n = sc.nextInt();
    int x = 1;
    int[] before = new int[n];
    int[] after = new int[n];
    int[] arr = new int[100000];
    for (int i = 0; i < n; i++) {
      before[i] = sc.nextInt();
    }
    for (int i = 0; i < n; i++) {
      after[i] = sc.nextInt();
    }
    for (int i = n - 1; i >= 0; i--) {
      arr[before[i]] = x++;
    }
    stack.push(arr[after[n-1]]);
    int count =0;
    for(int i =n-2; i>=0 ;i--){
      if(stack.peek() > arr[after[i]]){
        count ++;
      }else{
        stack.push(arr[after[i]]);
      }
    }
    System.out.println(count);
  }
}
