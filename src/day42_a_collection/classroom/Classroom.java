package day42_a_collection.classroom;

import java.util.HashMap;
import java.util.Map;

public class Classroom {
    public static void main(String[] args) {

        Map<Integer, Student> map = new HashMap<>();
        Student s1 = new Student("Tom",30.0,10);
        map.put(1,s1);

        map.put(2, new Student("Jack",27.0,7));
        map.put(3, new Student("Mickey",30.0,8));
        map.put(4, new Student("Mouse",30.0,5));
        System.out.println(map);
        //Q: get me the student which is assigned to the KEY 3
        System.out.println(map.get(3));

        //Q: get me the student name which is assigned to the KEY 4
        System.out.println(map.get(4).name);

        //Q: how can i get all the  KEYs only.
        //A: .keySet
        System.out.println(map.keySet());

        System.out.println();
        //Q: How can i get all the VALUES only
        //A: values();
        System.out.println(map.values());
    }
}
