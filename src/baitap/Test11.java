package baitap;

public class Test11 {


  public static void main(String[] args) {
    StringBuilder s2 = new StringBuilder("ABC");
    String s1 = "ABC";
    migrate(s2);
    migrate(s1);
    System.out.println(s1);
    System.out.println(s2);
  }

  private static void migrate(String s1) {
    String s2="";
    for (int i = 0; i < s1.length(); i++) {
      s2  += Character.toLowerCase(s1.charAt(i));
    }

    s1 = s2;



  }

  private static void migrate(StringBuilder s2) {
    for (int i = 0; i < s2.length(); i++) {

      s2.setCharAt(i, Character.toLowerCase(s2.charAt(i)));
    }

  }
}
