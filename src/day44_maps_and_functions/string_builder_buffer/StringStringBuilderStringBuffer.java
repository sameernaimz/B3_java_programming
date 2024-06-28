package day44_maps_and_functions.string_builder_buffer;

public class StringStringBuilderStringBuffer {
    public static void main(String[] args) {


        //1. String Class
        /// Strings are IMMUTABLE - we cannot change


        String str1 = "Loopcamp"; // Stored in String Pool in Heap
        String str2 = new String("Loopcamp"); // stored directly in Heap
        str1 = str1 + str2; // IMMUTABLE - we cannot change it - here we created a new String.
        System.out.println();
        //2. StringBuilder class
        // It is in java.lang package
        // **MUTABLE** once object is created, we still can change the SAME object
        // It is NOT synchornized
        // It can only be created using "new" keyword

        StringBuilder str3 = new StringBuilder(str1); // Stored directly in heap
        System.out.println(str3);
        str3.append("course");
        System.out.println(str3);

        System.out.println();
        //3. StringBuffer class
        //It is in java.lang package
        // **MUTABLE** once object is created, we still can change the SAME object
        // It iss synchornized
        // It can only be created using "new" keyword
            StringBuffer str4 = new StringBuffer("Loopcamp");
        System.out.println(str4);
        str4.reverse();
        System.out.println(str4);

    }
}
