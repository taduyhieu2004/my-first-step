package baitap;

import java.util.Scanner;
import java.util.Stack;

public class ICPC49 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.next();
    char[] arr = new char[s.length()];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = '0';
    }
    if (s.length() == 1) {
      if (s.charAt(0) < '5') {
        System.out.println(s.charAt(0));
      } else {
        System.out.println(10);
      }
    } else {
      arr[0] = s.charAt(0);
      if (s.charAt(0) == '9' && s.charAt(1) >= '5') {
        arr[0] = '1';
        for (char c : arr) {
          System.out.print(c);
        }
        System.out.println(0);
      } else {


        if (s.charAt(1) >= '5') {
          arr[0] = (char) (s.charAt(0) + 1);
        }
        for (char c : arr) {
          System.out.print(c);
        }
      }
    }


  }
}
