package leetcode;

public class Ex11 {
    private static int climbStairs(int x){
        if(x==1){
            return x;
        }
        int oneStep=1;
        int twoStep=2;
        for(int i=3;i<=x;i++){
            int temp=twoStep;
            twoStep=oneStep+twoStep;
            oneStep=temp;

        }
        return twoStep;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }
}
