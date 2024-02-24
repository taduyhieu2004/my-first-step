package leetcode;

public class Ex53 {
  private static int countSegments(String s) {
        String data[]=s.split(" ");
        int count =0;
        if( s.equalsIgnoreCase("")){
            return 0;
        }
        for(int i=0;i<data.length;i++){
            if(data[i]!=""){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSegments(", , , ,        a, eaefa"));
    }
}
