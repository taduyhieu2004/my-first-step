package leetcode;

import java.util.Arrays;

public class Ex51 {
  private static boolean handle(String ransomNote, String magazine) {
    int count = 0;
    int i = 0;
    int j = 0;
    char arr1[] = new char[ransomNote.length()];
    char arr2[] = new char[magazine.length()];
    for (int m = 0; m < ransomNote.length(); m++) {
      arr1[m] = ransomNote.charAt(m);
    }

    for (int n = 0; n < magazine.length(); n++) {
      arr2[n] = magazine.charAt(n);
    }
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    while (i < ransomNote.length() && j < magazine.length()) {
      if (arr1[i] == arr2[j]) {
        count++;
        i++;
        j++;
      } else if (arr1[i] > arr2[j]) {
        j++;
      } else if (arr1[i] < arr2[j]) {
        i++;
      }
    }
    if (count == ransomNote.length()) {
      return true;
    }

    return false;
  }


  public static void main(String[] args) {
    System.out.println(handle("ad", "abcd"));
  }

}
