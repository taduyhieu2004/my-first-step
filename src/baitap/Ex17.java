package baitap;

import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int t = scanner.nextInt();
      scanner.nextLine(); // Đọc ký tự xuống dòng sau khi đọc t

      for (int a = 0; a < t; a++) {
        String arr = scanner.nextLine();
        int n = arr.length();
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
          b[i] = arr.charAt(i);
        }

        int[] count = new int[1000];
        for (int i = 0; i < arr.length(); i++) {
          count[b[i]]++;
        }

        for (int i = 0; i < arr.length(); i++) {
          if (count[b[i]] == 1) {
            System.out.print(arr.charAt(i));
          }
        }

        System.out.println();
      }
    }
  }

