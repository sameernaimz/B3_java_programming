package day31_custom_classes;

public class useCarpet {
    public static void main(String[] args) {


        Carpet carpet1 = new Carpet(true,8.5, 12, 2.5);
       // carpet1.calculatePrice();


        carpet1.length =14;
        //// We had to call teh .calculatePrice() method again because that method was called in constructor. Since, we have updated the length, I am calling .calculateMethod() to get updated totalPrice.
        System.out.println(carpet1);
        carpet1.calculatePrice();

        System.out.println();

    }
}
