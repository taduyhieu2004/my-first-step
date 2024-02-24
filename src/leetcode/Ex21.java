package leetcode;

public class Ex21 {
    private static int handleCountPrimes(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (checkPrimes(i) == 1) {
                count++;
            }
        }

        return count;


    }

    private static int checkPrimes(int i) {
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                return 0;
            }
        }
        return 1;
    }


    public static void main(String[] args) {
        System.out.println(handleCountPrimes(10));
    }
}


//    int count = 0;
//        for (int i = 2; i < n; i++) {
//        int k = 0;
//        for (int j = 2; j <= Math.sqrt(i); j++) {
//        if (i % j == 0) {
//        k++;
//        }
//        }
//        if (k == 0) {
//        count++;
//        }
//        }
//        return count;
//

//        }