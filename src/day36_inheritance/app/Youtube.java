package day36_inheritance.app;

public class Youtube extends App {

    public Youtube( double version) {
        super("youtube", version);
    }

    public void watchVideo() {
        System.out.println("Watching java tutorial on " + name);
    }
}
