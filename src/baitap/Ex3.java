package baitap;


import java.util.*;

public class Ex3 {
  private static List<Integer> input() {
    int n = 0;
    List<Integer> arr = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Nhap n: ");
    n = scanner.nextInt();

    while (n > 0) {

      arr.add(scanner.nextInt());
      n--;

    }
    return arr;
  }

  private static Map<Integer, Integer> handleData(List<Integer> arrInput) {
    int n = arrInput.size();
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < n; i++) {


      if (map.containsKey(arrInput.get(i))) {
        map.put(arrInput.get(i), map.get(arrInput.get(i)) + 1);
      } else {
        map.put(arrInput.get(i), 1);
      }

    }

    return map;
  }


  private static void output(Map<Integer, Integer> map) {

    for (Map.Entry entry : map.entrySet()) {
      System.out.println("So lan suat hien cua " + entry.getKey() + " la : " + entry.getValue());
    }

  }

  public static void main(String[] args) {
    List<Integer> arrInput = input();
    Map<Integer, Integer> map = handleData(arrInput);
    output(map);
    String s1 = "ngu";
    char[] s = s1.toCharArray();
  }


}


//}




