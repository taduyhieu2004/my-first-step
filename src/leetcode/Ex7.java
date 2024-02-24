package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Ex7 {
    private static int[] input() {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    private static int handle(int arr[], int target) {
        Arrays.sort(arr);
        int sum = 0;
        int sumclosest = arr[0] + arr[1] + arr[2];
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            int j = i + 1;
            int k = arr.length - 1;
            while (j < k) {
                sum = arr[i] + arr[j] + arr[k];
                if (sum == target) {
                    sumclosest = sum;
                }
                if (sum < target) {
                    j++;
                } else { k--;
                }
                if(Math.abs(sum-target)<Math.abs(sumclosest-target)){
                    sumclosest=sum;
                }
            }
        }
        return sumclosest;
    }

    public static void main(String[] args) {
        int []arr=input();
        int sumclosest=handle(arr,1);
        System.out.println(sumclosest);
    }
}
