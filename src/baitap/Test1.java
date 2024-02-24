package baitap;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {


  private static int count5(int n) {
    int count = 0;

    while (n % 5 == 0) {
      n /= 5;
      count++;
    }
    return count;
  }

  private static int count2(int n) {
    int count = 0;

    while (n % 2 == 0) {
      n /= 2;
      count++;
    }
    return count;
  }

  private static int[] sort(int arr[], int arrTest[]) {
    int n = arr.length;

    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (arrTest[j] > arrTest[j + 1]) {

          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    return arr;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = 0;
    int b = 0;

    a = sc.nextInt();
    b = sc.nextInt();
    int count = 0;
    int sum1 = 0;
    int sum2 = 0;
    int arr[] = new int[a];
    int arr2[] = new int[a];
    int arr3[] = new int[a];


    for (int i = 0; i < a; i++) {
      arr[i] = sc.nextInt();

      arr2[i] = count5(arr[i]);
      arr3[i] = count2(arr[i]);
    }
    int arr4[] = sort(arr, arr2);
    int arr5[] = sort(arr, arr3);
    Arrays.sort(arr2);
    Arrays.sort(arr3);
    int j = a - 1;
    int i = a - 1;
    while (b != 0) {
      if (arr4[i] == arr5[j]) {
        b--;
      } else {
        b -= 2;
      }
      sum1 += arr2[i--];
      sum2 += arr3[j--];

    }
    if (sum1 > sum2) {
      count = sum2;
    } else {
      count = sum1;
    }
    System.out.println(count);

  }
}
