package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Ex52 {
    private static char findTheDifference(String s, String t) {

        char []arr=s.toCharArray();
        char []arr1=new char[t.length()];
        for(int i=0;i<s.length();i++){
            arr[i]=s.charAt(i);
        }
        for(int i=0;i<s.length();i++){
            arr1[i]=t.charAt(i);
        }
        Arrays.sort(arr);
        Arrays.sort(arr1);
        for(int i=0;i<s.length();i++){
            if(arr[i]!=arr1[i]){
                return arr1[i];
            }
        }
        return arr1[t.length()-1];
    }

    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd","abcde"));
    }

}
