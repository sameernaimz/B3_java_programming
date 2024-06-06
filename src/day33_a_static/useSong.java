package day33_a_static;

public class useSong {
    public static void main(String[] args) {

        Song s1 = new Song("Waka waka");
        System.out.println(s1.name);
        System.out.println(s1);

        Song s2 = new Song("Shape of Heart", 3.0);
        System.out.println(s2);

        Song s3 = new Song("Rich Girl", 3.5, "Gwen Stefani", "pop");
        System.out.println(s3);
    }
}