package baitap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Ex14 {
  private static boolean checkPalindrome(char s[], int n){
    int i =0;
    int j =n-1;
    while(i<j){
      if(s[i++] != s[j--]){
        return false;
      }
    }
    return true;
  }
  private static boolean isPalindrome(String s) {
    s=s.toLowerCase();
    int count =0;
    char s1[]= s.toCharArray();
    char s2[]= new char [s1.length];
    int n =0;
    for(int i =0; i < s1.length; i++){
      if(s1[i]>='a' && s1[i]<= 'z'){
        count ++;
        s2[n++]= s1[i];
      }
    }
    if(count ==1){
      return true;
    }

    return checkPalindrome(s2,n);
  }


  public static void main(String[] args) {

    System.out.println(isPalindrome("0P"));
  }
}
