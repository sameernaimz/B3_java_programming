package day39_a_polymorphism.cloth;

public class Store {
    public static void main(String[] args) {

        // ALL Possible references of Tshirt
        // 1 - Itself

        Tshirt t1 = new Tshirt();
        t1.wear();


        // #2 - Parent CLASS
        Clothes t2 = new Tshirt();
        t2.wear();
        System.out.println("-----------------");
        //All Possible references of Jacket
        // #1 - ITSELF


        Jacket j1 = new Jacket();
        j1.wear();
        j1.putOnHood();


        // #2 - Parent CLASS
      Clothes j2  = new Jacket();
      j2.wear();
      //j2.putOnWood(); //Cloths reference does no have access

        // #2 - INTERFACE
        HasHood J3 = new Jacket();
        //J3.wear(); // HasHood refrence does not have access to hood method
        J3.putOnHood();

        // #3 - Object
        Object j4 = new Jacket();
        //j4.wear(); // Object refrence does not have access to put putOnHood();
        //j4.putOnHood(); // Object reference does not have access to putOnHood();

        System.out.println("----------------");

        Tshirt ts = new Tshirt(); // References -> Tshirt , Clothes
        // References Iself > - > TShirt ts = new TShirt();
        //Refrences Parent - > Clothes ts = new TShirt();
        //ts.wear();
        Jacket jt = new Jacket();
        // References Itself - > Jacket ts = new Jacket();
        // References Parent - > Clothes ts = new Jacket();
        // References Interface - > HasHood ts = new Jacket();
        buy(ts); // buy(new TShirt() ):
        buy(jt); // buy( new Jacket() );
        buy(new Tshirt());
        buy(new Jacket());

        HasHood jj3 = new Jacket();
        buy((Jacket)jj3); // //  HasHood jj3 = new Jacket(); -- > Jacket jj3 = new Jacket();
        //buy( (jj3) ); //  HasHood jj3 = new Jacket(); -- > Clothes close cannot accept HasHood jj3



    }
    public static void buy(Clothes clothes) { // Clothes clothes = new Tshirt();
        if(clothes instanceof Tshirt) {
            // Clothes clothes = new TShirt(); -- > new TShirt(); is instanceOf TShirt
            // Clothes clothes = new Jacket(); -- > new Jacket(); is instanceof TShir
            System.out.println("Bought Tshirt");

        } else if(clothes instanceof Jacket) {
            System.out.println("Bought Jacket");
           // Clothes clothes = new Jacket(); -- > new Jacket(); is instanceof Jacket
        }


    }
    public static void test(String str) {

    }
}
