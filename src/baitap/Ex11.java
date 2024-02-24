package baitap;

import java.util.Locale;

public class Ex11 {
    private static String input() {
        String name = "tA dUy hIeu";
        return name;
    }

    private static String handleName(String name) {
       String newName="";
        name=name.toLowerCase();
        String[] data = name.split(" ");

        for (String a : data){
            newName += String.valueOf(a.charAt(0)).toUpperCase()+ a.substring(1)+ " ";



      }
        return newName;


    }

    public static void main(String[] args) {
        String name =input();
        String data =handleName(name);
        System.out.println(data);
    }

}

