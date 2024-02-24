package leetcode;

public class Ex20 {
    public static void main(String[] args) {
        int sum1=0;
        int sum2=0;
        int sum3=0;

        int[] nums = new int[]{1,7,9,8,2};
        int n = nums.length, i = 0;
        int[] arrCheck = new int[n];
        for(int k=0;k<n;k++){
            arrCheck[k]=0;

        }
        for(int j=0;j<n;j+=2){
            sum2+=nums[j];

        }
        for(int j=1;j<n;j+=2){
            sum3+=nums[j];

        }

        int[] arrRes = new int[n];

        while (n-- > 0) {
            int index = getNumberMax(nums, arrCheck);
            if (index == -1) break;
            arrRes[i++] = index;
            arrCheck[index] = 1;
            sum1 += nums[index];

            }

        if(sum1<sum2){
            sum1=sum2;
        }
        if(sum1<sum3){
            sum1=sum3;
        }



//        System.out.println(s);
//    System.out.println(arrRes.toString());
    }


    private static int getNumberMax(int[] arrInput, int[] arrCheck) {
        int maxValue = 0;
        int indexMax = -1;
        for (int i = 0; i < arrInput.length; i++) {
            if (arrInput[i] > maxValue && arrCheck[i] == 0) {
                if (i > 0 && i == arrCheck.length - 1 && arrCheck[i - 1] == 1) {
                    continue;
                }
                if (i > 0 && i < arrCheck.length - 1 && arrCheck[i - 1] == 1 ||
                        i > 0 && i < arrCheck.length - 1 && arrCheck[i + 1] == 1) {
                    continue;
                }
                if (i == 0 && arrCheck[i + 1] == 1) {
                    continue;
                }

                maxValue = arrInput[i];
                indexMax = i;
            }
        }

        return indexMax;
    }
}

