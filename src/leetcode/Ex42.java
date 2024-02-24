package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Ex42 {
    private static boolean isValid(String s) {
        int n = s.length();
        if (n == 1) {
            return false;
        }
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.charAt(i);
        }

        if ((arr[0] == '(' && arr[n - 1] == ')') || (arr[0] == '[' && arr[n - 1] == ']')
                || (arr[0] == '{' && arr[n - 1] == '}')) {
            for (int i = 1; i < n - 1; i += 2) {
                if (arr[i] == ')' || arr[i] == ']' || arr[i] == '}') {
                    return false;
                }
                if (arr[i] == '(' && arr[i + 1] != ')') {
                    return false;

                } else if (arr[i] == '[' && arr[i + 1] != ']') {
                    return false;

                } else if (arr[i] == '{' && arr[i + 1] != '}') {
                    return false;
                }
            }


        } else {
            for (int i = 0; i < n; i += 2) {
                if (arr[i] == ')' || arr[i] == ']' || arr[i] == '}') {
                    return false;
                }
                if (arr[i] == '(' && arr[i + 1] != ')') {
                    return false;

                } else if (arr[i] == '[' && arr[i + 1] != ']') {
                    return false;

                } else if (arr[i] == '{' && arr[i + 1] != '}') {
                    return false;


                }
            }
        }


        return true;


    }


    public static void main(String[] args) {
        System.out.println(isValid("){"));
    }
}
