package leetcode;

public class Ex32 {
    private static int integerReplacement(int n) {
        int x = 0;
        if (n == Integer.MAX_VALUE) {
            return 32;
        }


        while (n > 1) {

            if (n % 2 == 0) {
                n /= 2;

            } else if (n % 4 == 1 || n == 3) {
                n--;

            } else {
                n++;

            }
            x++;
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(integerReplacement(2147483647));
    }
}
