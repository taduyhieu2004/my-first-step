package vidu;

import java.util.*;

public class ViDu1 {
    private static int []arr={2,4,9};
    private static int[] handle(int digits[]){
        for(int i = digits.length-1; i>=0; i--)
            if (digits[i]==9)
                digits[i]=0;
            else{
                digits[i]++;
                return digits;
            }
        digits = new int[digits.length+1];
        digits[0]=1;
        return digits;
    }


    public static void main(String[] args) {
      int[] arr1=handle(arr);
      for (int a: arr1){
          System.out.println(a);
      }




}}
