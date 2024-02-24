package baitap;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ICPC7 {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int t = sc.nextInt();
    for(int j =0; j< t; j++) {
      Set<Character> set = new HashSet<>();
      String s =sc.next();
      int k =sc.nextInt();

      for(int i =0 ;i <s.length();i++) {
        set.add(s.charAt(i));
      }
      if(set.size() + k >= 26){
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }
    }

  }
}
