package day_13string;

import java.sql.SQLOutput;

public class StringMemory {
    public static void main(String[] args) {
        String str1 = "java"; //option 1 - STRING LITERALS

        // Option 2 - by "new" KEYWORD
        String str2 = new String("|JAVA");

        String str3 = "java";

        String str4 = "javad";

        System.out.println(str1);
        System.out.println(str2);
        System.out.println("-=-=-=-=-=-=-=");
        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str1== str3);

        // == -=-=-=-=-=> WITH THIS RELATIONAL OPERATOR


    }
}
