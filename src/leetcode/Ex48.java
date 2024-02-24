package leetcode;

public class Ex48 {
    private static int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int []arr=new int [2];
        int i=0;
        int j=numbers.length-1;
        while(i<j){
            int sum=numbers[i]+numbers[j];
            if(sum<target){
                i++;
            }else if(sum>target){
                j--;
            }else{
                arr[0]=i+1;
                arr[1]=j+1;
                break;
            }
        }

        return arr;
    }
}

