package baitap;

import java.util.Scanner;

public class ICPC2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = 0;
    t = sc.nextInt();
    for (int j = 0; j < t; j++) {
      int n = sc.nextInt();
      int i = (int) Math.pow(2 + Math.sqrt(3), n);
      char c[] = String.valueOf(i).toCharArray();

      System.out.print(c[c.length - 2]);
      System.out.println(c[c.length - 1]);
    }
  }
}
