package day37_a_abstraction.Language;

public class Spanish implements Language {
    @Override
    public void hi() {
        System.out.println("Hola");
    }

    @Override
    public void bye() {
        System.out.println("Adios");
    }
}
