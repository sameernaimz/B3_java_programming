package day34_b_encapsulation;

import static java.lang.Math.PI;
import static java.util.Arrays.sort;
import static my_utilities.ArrayUtil.minNumInArr;
import static my_utilities.StringUtil.reverse;

public class WithImport {

        public static void main(String[] args) {

            int [] a = {81,23,65,33};

            //Arrays.sort(a);
            sort(a);

            System.out.println(Math.PI);
            System.out.println(PI);
            //System.out.println(StringUtil.reverse("java));
            System.out.println(reverse("java"));

            minNumInArr(a);

            //  System.out.println(toString(a)); // Since this is a special method. Sometimes it is instance method, thAT IS WHY JAVA HERE DOES NOT know if it is a static version.
        }
    }


