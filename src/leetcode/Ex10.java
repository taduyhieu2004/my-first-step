package leetcode;

public class Ex10 {
    private static double mypow(double x, int n) {
        double y = 1;
        long a = n;
        if (n < 0)
            a = -1 * a;
        while (a > 0) {
            if (a % 2 == 1) {
                y *= x;
                a--;
            } else {
                x = x * x;
                a /= 2;
            }
        }

        if (n < 0) {

            y = 1.0 / y;
        }

        return y;
    }


    public static void main(String[] args) {
        System.out.println(mypow(2.000, Integer.MIN_VALUE));
    }
}

