package day34_a_static;

import my_utilities.StringUtil;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Normal {
    public static void main(String[] args) {
        int[] a = {1,23,65,33};
        Arrays.sort(a);
        //sort(a);
        System.out.println(Arrays.toString(a));

        System.out.println(Math.PI);
        //System.out.println(PI);

        System.out.println(StringUtil.reverse("java"));
        //System.out.println(reverse("java"));

    }
}
