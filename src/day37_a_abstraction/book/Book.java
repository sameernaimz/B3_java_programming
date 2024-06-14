package day37_a_abstraction.book;

public class Book implements Create {
    @Override
    public void read() {
        System.out.println("reading the book");

    }

    @Override
    public void write() {
        System.out.println("Writing the book");
    }
}
