package baitap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("nhap a");
        a = sc.nextInt();
        System.out.println("nhap b");
        b = sc.nextInt();
        a = a + b;
        b = a - b;
        a = a-b;
        System.out.println("a=" + a + "b=" + b);
    }
}