package leetcode;

public class Ex56 {
    private  static boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i=0;i<flowerbed.length;i++){
            if(i ==flowerbed.length-1){
                if(flowerbed[i]==0&& flowerbed[i-1]!=1){
                    flowerbed[i]=1;
                    n--;
                }
            }else if(i ==0){
                if(flowerbed[i]==0&&flowerbed[i+1]!=1){
                    flowerbed[i]=1;
                    n--;

                }
            }
            else {
                if(flowerbed[i]==0&&flowerbed[i+1]!=1&& flowerbed[i-1]!=1){
                    flowerbed[i]=1;
                    n--;

                }
            }
        }



        if(n>0){
            return false;
        }
        return true;

    }

    public static void main(String[] args) {
        int arr[]={1,0,0,0,1,0,0};
        System.out.println(canPlaceFlowers(arr,2));
        
    }
}


