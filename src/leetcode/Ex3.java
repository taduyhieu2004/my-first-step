package leetcode;

public class Ex3 {
    private static int[] input() {
        int arr[] = {3, 2, 2,5,3,6, 3};
        return arr;
    }


    private static int handle(int[] arr, int x) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (x != arr[i]) {
                arr[k] = arr[i];
                k++;
            }

        }
        return k;

    }

    private static void output(int[] arr, int k) {
        for (int i = 0; i < k; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = input();
        int k = handle(arr, 2);
        output(arr,k);
    }
}
