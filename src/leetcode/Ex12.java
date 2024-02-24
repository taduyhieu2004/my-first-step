package leetcode;

public class Ex12 {
    private static int mySqrt(int x) {

       long value=0;
       long i=1;
       while (i*i<=x){
           value=i;
           i++;

       }
       return (int)value;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(4));
    }
    }
