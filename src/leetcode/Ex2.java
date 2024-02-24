package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {
    private static String[] input() {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.next();
        }
        return arr;
    }

    private static String handle(String[] arr) {
        Arrays.sort(arr);
        String s = "";
        String a = arr[0];
        String b = arr[arr.length - 1];
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(i)) {
                s += a.charAt(i);

            } else {
                break;
            }

        }
        return s;
    }
    private static void output(String s){
        System.out.println(s);

    }

    public static void main(String[] args) {
        String arr[]=input();
        String s=handle(arr);
        output(s);

    }
}
