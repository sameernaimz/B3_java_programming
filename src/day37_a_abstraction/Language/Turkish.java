package day37_a_abstraction.Language;

public class Turkish implements Language {
    @Override
    public void hi() {
        System.out.println("Merhaba");
    }

    @Override
    public void bye() {
        System.out.println("Gule Gule");
    }
}
