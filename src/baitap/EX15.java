package baitap;

import java.util.Scanner;

public class EX15 {
  public static double sum(int n) {
    double sum = 0;
    for (int i = 0; i < n; i++) {
      sum += 1.0 / (i + 1);
    }
    return sum;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    double sum1 = sum(t);
    System.out.println(sum1);
  }
}

