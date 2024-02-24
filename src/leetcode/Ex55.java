package leetcode;

public class Ex55 {
    public boolean checkRecord(String s) {
        int count =0;
        int res=0;
        char[]arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='A'){
                res++;
                count=0;
            }else if(arr[i]=='L'){
                count++;
            }
            if(res==2||count==3){
                return false;
            }
        }
        return true;
    }
}

