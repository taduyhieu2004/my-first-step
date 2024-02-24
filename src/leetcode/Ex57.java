package leetcode;

public class Ex57 {
   private static int findLength(int[] nums1, int[] nums2) {
       int i = 0;

       int maxcount = 0;

int count =0;

       while (i < nums1.length) {

           int j = 0;
           int x=i;
           while (j < nums2.length) {
               if (nums1[i] == nums2[j]) {
                   count++;
                   i++;
                   j++;
                   maxcount = Math.max(count, maxcount);
                   if(i==nums1.length){

                       break;
                   }

               } else {
                   j++;
                   count = 0;
               }
//                maxcount = Math.max(count, maxcount);

           }
           i=x;
           i++;
       }
       return maxcount;
   }


    public static void main(String[] args) {
        int []nums1={0,0,0,0,0,0,1,0,0,0};
        int []nums2={0,0,0,0,0,0,0,1,0,0};
        System.out.println(findLength(nums1,nums2));
    }
}
