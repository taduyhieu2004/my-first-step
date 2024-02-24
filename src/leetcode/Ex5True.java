package leetcode;

public class Ex5True {
    private static int[] height = {1,8,6,2,5,4,8,3,7};
    private static int handle(int []height){
        int max=0;
        int n=height.length;
        int i=0;
        int j=n-1;
        while (i<j){
            int temp;
            if(height[i]>height[j]){
                temp=height[j]*(j-i);
                j--;
            }
            else {
                temp=height[i]*(j-i);
                i++;
            }
            if(max<temp){
                max=temp;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int max=handle(height);
        System.out.println(max);
    }
}
