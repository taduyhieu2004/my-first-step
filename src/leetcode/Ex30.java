package leetcode;

public class Ex30 {
    private static void reverseString(char[] s) {
        int n=s.length-1;
        for(int i=0;i<n+1;i++){
           char x=s[i];
           s[i]=s[n];
           s[n]=x;
           n--;
        }
    }
}
