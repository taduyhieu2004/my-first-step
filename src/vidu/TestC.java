package vidu;

import java.util.*;

public class TestC {
    private static int input() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static int[] getArr(int n) {
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input();
        }
        return arr;

    }

    private static List<Integer> handleArr(int[] arr) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                list.add(arr[i]);

            } else {
                map.put(arr[i], i);
            }
        }
        return list;

    }

    private static void output(List<Integer> list) {
        for (int a : list) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        int n = input();
        int arr[] = getArr(n);
        List<Integer> list = handleArr(arr);
        output(list);

    }
}
