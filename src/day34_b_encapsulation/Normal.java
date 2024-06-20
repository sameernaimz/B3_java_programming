package day34_b_encapsulation;

import my_utilities.StringUtil;

import java.util.Arrays;

import static java.lang.Math.PI;
import static java.util.Arrays.sort;
import static my_utilities.ArrayUtil.minNumInArr;
import static my_utilities.StringUtil.reverse;

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