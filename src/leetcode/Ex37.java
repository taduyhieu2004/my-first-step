package leetcode;

public class Ex37 {
    private static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxcount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;

            } else {
                count = 0;

            }
            if (maxcount < count) {
                maxcount = count;
            }



        }
        return maxcount;
    }

        public static void main (String[]args){
            int[] arr = {1, 1, 0, 1, 1, 1};
            System.out.println(findMaxConsecutiveOnes(arr));
        }
    }

