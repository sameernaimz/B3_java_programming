package day34_a_static;

import com.sun.jdi.PathSearchingVirtualMachine;
import static java.util.Arrays.*;
import static java.lang.Math.*;
import static my_utilities.StringUtil.*;
import static my_utilities.ArrayUtil.*;
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
