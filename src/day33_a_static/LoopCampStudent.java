package day33_a_static;

import java.util.Arrays;

public class LoopCampStudent {
    String name;
    int GroupNumber;

    static int batchNumbert;
    static String [] teachers;
    static String schoolName;

    static {
        batchNumbert = 3;
        teachers = new String[]{"NADIR", "FEYRUZ", "JAMES", "DIANA"};
                schoolName = "Loopcamp";
        printInfo();
    }

    public static void printInfo() {
        System.out.println("School name:" + schoolName);
        System.out.println("Batch Numner: " + batchNumbert);
        System.out.println("Teachers: " + Arrays.toString(teachers));


    }
    public LoopCampStudent (String name, int groupNumber) {
        this.name = name;
        this.GroupNumber = groupNumber;

    }

    @Override
    public String toString() {
        return "Loopcamp Student Info: " +
                "\n\tName: " + name +
                "\n\tGroup Number:"  + GroupNumber;
    }
}

