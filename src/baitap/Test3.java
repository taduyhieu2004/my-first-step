package baitap;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

  public static List<Integer> calculateProductOfKNumbers(int[] array, int K) {
    List<Integer> results = new ArrayList<>();

    // Lấy tất cả các tổ hợp của K phần tử từ mảng
    calculateCombinations(array, K, results);

    return results;
  }

  private static void calculateCombinations(int[] array, int K, List<Integer> results) {
    int[] combination = new int[K];
    calculateProductOfKNumbersHelper(array, K, 0, combination, 0, results);
  }

  private static void calculateProductOfKNumbersHelper(int[] array, int K, int start, int[] combination, int index, List<Integer> results) {
    if (index == K) {
      // Tính tích của tổ hợp và thêm vào kết quả
      int product = 1;
      for (int num : combination) {
        product *= num;
      }
      results.add(product);
      return;
    }

    for (int i = start; i < array.length; i++) {
      combination[index] = array[i];
      calculateProductOfKNumbersHelper(array, K, i + 1, combination, index + 1, results);
    }
  }

  public static void main(String[] args) {
    int[] array = {250, 625,40};
    int K = 2;
    List<Integer> result = calculateProductOfKNumbers(array, K);
    System.out.println(result);
  }
}

