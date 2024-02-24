package baitap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2 {

  private static long gcd(long a, long b) {
    if (b == 0) {
      return a;
    } else {
      return gcd(b, a % b);
    }
  }

  private static void handle(List<Integer> list1, List<Integer> list2) {
    for (int i = 0; i < list1.size(); i++) {
      for (int j = 0; j < list2.size(); j++) {
        if (list2.get(j) == 1) {
          continue;
        }
        if (list1.get(i) % list2.get(j) == 0) {
          list1.set(i, list1.get(i) / list2.get(j));
          list2.set(j, 1);
        }
      }
    }
  }


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    List<Integer> arr = new ArrayList<>();
    List<List<Integer>> arr1 = new ArrayList<>();
    for (int i = 0; i < a; i++) {
      arr.add(scanner.nextInt());
    }

    for (int i = 0; i < b; i++) {
      List<Integer> query = new ArrayList<>();
      for (int j = 0; j < a; j++) {
        query.add(scanner.nextInt());
      }
      arr1.add(query);
    }
    List<Integer> newArr = new ArrayList<>();
    List<Integer> newArr1 = new ArrayList<>();

    int arr2[] = new int[a];
    int check = 1;
    int count = 0;
    int prod = 1;
    int prodB = 1;
    for (int i = 0; i < b; i++) {
      newArr.clear();
      newArr1.clear();
      newArr.addAll(arr);
      newArr1.addAll(arr1.get(i));
      handle(newArr, newArr1);
      prod = 1;
      prodB = 1;
      check = 1;
      for (int j = 0; j < a; j++) {
        prodB *= newArr1.get(j);
      }
      for (int j = 0; j < a; j++) {
        prod *= newArr.get(j);
      }
      if (gcd(prod, prodB) != prodB) {
        check = 0;

      }

      if (check == 1) {
        arr2[count] = i + 1;
        count++;
      }
    }
    System.out.println(count);

    for (int i = 0; i < count; i++) {
      System.out.print(arr2[i] + " ");
    }
  }
}






