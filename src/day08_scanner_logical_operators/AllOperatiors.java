package day08_scanner_logical_operators;


    public class AllOperatiors {
        public static void main (String [] args) {

            System.out.println(5 + 2 * 3);
            //                  5 + 6
            //                  11

            System.out.println(5 * 2 + 4 / 2);
            //                  10 + 4 / 2
            //                  10 + 2
            //                  12


            System.out.println(5 + 2 > 4 - 3);
            //                  7 > 4 - 3
            //                  7 > 1
            //                  true

            int a = 20; // 19 > 20 > 19 > 18
            int b = -a-- + a++ + --a * a--;
            //      -20 + 19 + 19 * 19
            //      -20 + 19 + 361
            //      -1 + 361
            //      360

            System.out.println(a); // 18
            System.out.println(b); // 360

        }


    }

