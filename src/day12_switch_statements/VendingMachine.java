package day12_switch_statements;
import java.util.Scanner;
public class VendingMachine {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("|wELCOME TO THE vending Machine");
        System.out.println("please, select one of the following: \n\tDrinks\n\tSnacks\n\tGums");
        System.out.print("\n\tSelect:");
        String selectedItem = key.next();
        String item = "";

        switch(selectedItem) {

        }
    }
}