package day31_custom_classes;

public class Carpet {
    double width;
    double length;
    boolean isPersian;
    double unitPrice;
    double totalPrice;

    public Carpet (boolean inputPersian, double inputWidth, double inputLength, Double inputUnitPrice) {

        isPersian = inputPersian;
        width = inputWidth;
        length = inputLength;
        unitPrice = inputUnitPrice;
        calculatePrice();
    }

    @Override
    public String toString() {
        return "Carpet Info" +
                "\n\twidth=" + width +
                "\n\t length=" + length +
                "\n\tisPersian=" + isPersian +
                ",\n\tunitPrice=" + unitPrice +
                ", \n\ttotalPrice=" + totalPrice ;
    }

    public void calculatePrice () {
        totalPrice = width * length * unitPrice;
        if(isPersian) {
            totalPrice += 200;
        }




    }
}
