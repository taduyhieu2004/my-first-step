package vidu;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Test2 {

  public static void main(String[] args) {
    Queue<Integer> numbers = new PriorityQueue<>();
    numbers.add(5);
    numbers.add(9);
    numbers.add(3);
    numbers.add(7);

    System.out.println("Danh sach ban dau: ");
    for (Integer i : numbers) {
      System.out.print(i + "\t");
    }

    //Lấy ra phần tử đầu tiên và xóa phần tử đó:
    System.out.println("\nphan tu dau tien: " + numbers.poll());
    System.out.println("phan tu dau tien: " + numbers.poll());

    numbers.offer(1);
    System.out.println("\nDanh sach ban dau: ");
    for (Integer i : numbers) {
      System.out.print(i + "\t");
    }
  }
}


