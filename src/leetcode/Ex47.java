package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Ex47 {
    private static String reverseWords(String s) {
        String value = "";
        String[] str = s.split(" ");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            if (str[i].equalsIgnoreCase("")) {
            } else {
                list.add(str[i]);
            }
        }
        for (int i = list.size() - 1; i > 0; i--) {
            value += list.get(i) + " ";
        }
        return value + list.get(0);
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("  hello world  "));
    }
}

