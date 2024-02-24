package oop;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
  public static void main(String[] args) {
    // Size of the
    // ArrayList
    int n = 5;

    // Declaring the ArrayList with
    // initial size n
    B b = new B();
    List arr1 = new ArrayList<>(5);
    arr1.add(1.0);
    arr1.add(2);
    arr1.add("hello");
    arr1.add(b);

    // Declaring the ArrayList
    ArrayList<Integer> arr = new ArrayList<>(arr1);

    // Printing the ArrayList
    System.out.println("Array 1:" + arr1);
    System.out.println("Array 2:" + arr);

    // Appending new elements at
    // the end of the list
    for (int i = 1; i <= n; i++) {
      arr1.add(i);

    }

    // Printing the ArrayList
    System.out.println("Array 1:" + arr1);
    System.out.println("Array 2:" );
  }
}

