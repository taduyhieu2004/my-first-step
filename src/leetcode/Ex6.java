package leetcode;

public class Ex6 {
    private static int []arr={2,7,11,15};
   private static int[] twoSum(int[] nums, int target) {
        int x=0,y=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=1;j< nums.length;j++){
                if(nums[i]+nums[j]==target){
                    x=i;
                    y=j;

                }
            }
        }
        int arr1[]={x,y};
        return arr1;
    }

    public static void main(String[] args) {
        int []arr1=twoSum(arr,9);
        for (int a:arr1){
            System.out.println(a);
        }
    }
}
