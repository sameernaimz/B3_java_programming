package day_14string;

public class RemoveSpace {
    public static void main(String[] args) {

        String str = "   Thursday   " ;
        System.out.println(str);
        System.out.println(str.length()); //16

        str = str.trim(); //
        System.out.println(str.length());

        String str2 = "Java is fun ";
        System.out.println(str2.length());
        str2 = str2.trim();
        System.out.println(str2.length());

        String str3 = "     lOOPCAMP HAS SDET PROGRAM";
        System.out.println(str3.startsWith("    loopcamp"));

        System.out.println(str3.trim());
        System.out.println(str3.length());

        str3 = str3.trim();
        System.out.println(str3.length());
    }
}
