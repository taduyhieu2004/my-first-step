package baitap;

import java.util.Scanner;

public class Ex10 {
    private static int[] input() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("nhap n");
        n = sc.nextInt();
        int arr[];
        arr = new int[n];
        System.out.println("nhap arr");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        return arr;
    }

    private static int[] handleData(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int x = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (x > arr[j]) {
                    arr[i] = arr[j];
                    arr[j] = x;
                    x = arr[i];
                }
            }
        }
        return arr;
    }

    private static int handleSearch(int arr[], int x) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    private static void output(int result) {
        if (result == -1) {
            System.out.println("ko ton tai phan tu");
        } else {
            System.out.println("ton tai phan tu tai vi tri " + result);
        }
    }

    public static void main(String[] args) {
        int[] arr = input();
        int arr1[] = handleData(arr);
        int result = handleSearch(arr1, 10);
        output(result);
    }
}
