package day37_a_abstraction.Language;

import java.sql.SQLOutput;

public class Translator {
    public static void main(String[] args) {
        //Language obj = new Language(); //cannot create an object
        Spanish s = new Spanish();
        s.hi();
        s.bye();
        System.out.println(s.PLANET);
        System.out.println("----");

        Turkish turkish = new Turkish();
        turkish.hi();
        turkish.bye();
        System.out.println(turkish.PLANET);
        System.out.println("----");
        System.out.println(Language.PLANET);
        System.out.println(Turkish.PLANET);
        System.out.println(Spanish.PLANET);
        }
    }
