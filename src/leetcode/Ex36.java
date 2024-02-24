package leetcode;

public class Ex36 {
    private static boolean checkPerfectNumber(int num) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum1 += i;
                sum2 += num / i;
            }
        }
        int sum = sum1 + sum2;
        if (sum == num*2) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(28));
    }
}
