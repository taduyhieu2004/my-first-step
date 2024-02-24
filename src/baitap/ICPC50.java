package baitap;

import java.util.*;

public class ICPC50 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int i = 0; i < t; i++) {
      List<Long> list = new ArrayList<>();

      long n = sc.nextInt();
      long k = sc.nextInt();
      long x = n % 100;
      int sum = 0;
      while (!list.contains(x)) {
        list.add(x);
        x = (x + x % 100) % 100;
        sum += x;
      }

      int pos = list.indexOf(x);
      int g = 0;
      while (pos >= 0) {
        sum -= list.get(g++);
        pos--;
      }
      int test = (int) (k / (list.size()-pos));
      int y = (int) (k %  (list.size()-pos));
      long result = 0;
      for (int j = 0; j < y; j++) {
        result += list.get(j);
      }
      result = n + result + (long) sum * test;
      System.out.println(result);


    }


  }
}
