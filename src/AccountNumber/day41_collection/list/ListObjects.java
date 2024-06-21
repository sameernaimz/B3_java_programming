package AccountNumber.day41_collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListObjects {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>(); // reference of the interface list, but the object is ArrayList
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add(null); // null can be reached

        System.out.println(list);
        System.out.println(list.get(3));

        List<String> list2 = new ArrayList<>(); // reference of the interface list, but the object is ArrayList
        list2.add("a");
        list2.add("b");
        list2.add("c");
        list2.add("d");
        list2.add(null); // null can be reached

        System.out.println(list2);
        System.out.println(list.get(3));
        List<String> list3 = new Vector<>(); // reference of the interface list, but the object is ArrayList
        list3.add("a");
        list3.add("b");
        list3.add("c");
        list3.add("d");
        list3.add(null); // null can be reached

        System.out.println(list3);
        System.out.println(list.get(3));

    }
}