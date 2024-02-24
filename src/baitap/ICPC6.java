package baitap;

import java.util.Scanner;

public class ICPC6 {

    public static int calculateFirstTwoDigits(int n) {
      int a = 2;
      int b = 1;
      int c = 0;
      int d = 0;

      for (int i = 0; i < n; i++) {
        // Cập nhật giá trị của c và d
        int newC = (a * c + 3 * b * d) % 100;
        int newD = (a * d + b * c) % 100;
        c = newC;
        d = newD;
      }

      return c;
    }

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int T = scanner.nextInt(); // Số lượng bộ test

      for (int t = 0; t < T; t++) {
        int n = scanner.nextInt();
        int result = calculateFirstTwoDigits(n);
        System.out.printf("%02d%n", result); // In ra 2 chữ số với định dạng số có 2 chữ số
      }
    }
  }

