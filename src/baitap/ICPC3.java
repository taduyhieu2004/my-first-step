package baitap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ICPC3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 0;
    n = sc.nextInt();
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      list.add(sc.nextInt());
    }
    int k = 0;
    double sum = 0;
    double maxSum = 0;
    List<Integer> listTest = new ArrayList<>();

    for (int i = 1; i <= n - 2; i++) {
      listTest.addAll(list);
      sum = handle(listTest, i);
      if (sum > maxSum) {
        maxSum = sum;
        k = i;
      }
      listTest.clear();
    }
    System.out.println(k);
  }

  private static double handle(List<Integer> list, int k) {

    while (k != 0) {
      list.remove(0);
      k--;
    }
    Collections.sort(list);
    list.remove(0);
    double sum = 0;
    for (Integer i : list) {
      sum += i;
    }
    sum = sum / list.size();
    return sum;

  }
}
