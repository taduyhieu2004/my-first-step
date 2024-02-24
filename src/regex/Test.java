package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    private static String REGEX_EMAIL = "^[a-zA-Z]+[a-z0-9]*@{1}[A-Za-z]{1}+mail.com$";
    private static String REGEX_PHONE = "^0\\d{9}$";
    private static String REGEX_NAME="^[\\S]+$";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Pattern pattern = Pattern.compile(REGEX_NAME);
        Matcher matcher = pattern.matcher(input);
        if (input.matches(REGEX_NAME)) {
            System.out.println("ok");


        }
    }
}
