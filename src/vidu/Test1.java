package vidu;

import java.util.*;

public class Test1 {


  public static void main(String[] args) {
    List<Integer> list = new Stack<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(1);
    list.add(3);
    list.add(10);
    for (Integer i : list) {
      System.out.print(i+" ");
    }
  }
}
