package baitap;

import java.util.ArrayList;
import java.util.List;

public class Test9 {
  private static int longestCommonSubsequence(String text1, String text2) {
    char arr[] = text1.toCharArray();
    char arr1[] = text2.toCharArray();
    int i = text1.length();
    int j = text2.length();

    if (i > j) {
      return handle(i, j, arr, arr1);
    }
    return handle(j, i, arr1, arr);

  }

  private static int handle(int i, int j, char arr[], char arr1[]) {
    int x = 0;
    int y = 0;
    int count = 0;
    while (x < i && y < j) {
      if (arr[x] == arr1[y]) {
        y++;
        count++;
      }
      x++;
    }

    return count;
  }

  public static void main(String[] args) {
    List<Integer > list = new ArrayList<Integer>();
    list.add(1);
    list.add(2);
    list.add(3);

    System.out.println(longestCommonSubsequence("psnw", "vozsh"));
  }
}

