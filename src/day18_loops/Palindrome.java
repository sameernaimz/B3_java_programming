package day18_loops;

import day12_switch_statements.Atm;

public class Palindrome {
    public static void main(String[] args) {
        String str = "abcd";
        String reversed = "";

        str.charAt(str.length() -1);
        reversed += "" str.charAt(str.length() -1);

        for(int i = str.length() -1; i >= 0; i--) {
            reversed += str.charAt(i);

        }
    }
}
