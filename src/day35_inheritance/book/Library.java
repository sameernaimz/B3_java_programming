package day35_inheritance.book;

public class Library {
    public static void main(String[] args) {

        Book obj1 =new Book();
        //obj1. - has access to 5 members of the class

        AudioBook ab1 = new AudioBook();
        //ab1. - has access to 7 instance variables (5 from Parent + 2 from itself) and 1 instance method from itself
        ab1.duration = 100;
        ab1.narrator = "Morgan Freeman";
        ab1.listen();
        ab1.title = "java is fun";

        Ebook EB1 = new Ebook();
            EB1.size =10;
            EB1.pages = 600;
            EB1.title = "Soft Skills";

            EB1.read();


            Author a1 = new Author("jojo moyes" , 40);

            Book b1 = new Book();

            b1.author = new Author("Gabriel Garicia Marquez", 80);
        System.out.println(b1.author);

        AudioBook audio1 = new AudioBook();
        audio1.author = new Author ("Thomas Jefferson", 70);
        }
}
