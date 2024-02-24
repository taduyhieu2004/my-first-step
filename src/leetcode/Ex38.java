package leetcode;

public class Ex38 {
    private static int[] constructRectangle(int area) {
        int x = 0;
        int y = 0;

        for (int i = 1; i <= Math.sqrt(area); i++) {
            if (area % i == 0) {
                x = area / i;
                y = i;
            }

        }
        int arr[] = {x, y};


        return arr;
    }

    public static void main(String[] args) {
        int[] arr = constructRectangle(122122);
        for (int a : arr) {
            System.out.println(a);
        }
    }

}
