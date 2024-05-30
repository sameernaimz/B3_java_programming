package day21_arrays;

public class EvenOrOdd {
    /*
    Even and odd from array
    Write a program that can count the even and odd number from an array of integers
    Ex:
        Input: [4,1,3,12,5]
        Output:
            Even: 2
            Even Numbers: 4 14 20
            Odd: 3
            Odd Numbers: 1 3 5 13
 */

        public static void main(String[] args) {



            int [] nums = {4, 1, 3, 12, 5, 20, 13};
            int evenCount = 0;
            int oddCount = 0;
            String evenNums = "".trim();
            String oddNums = "";


            for (int eachNum : nums) {

                if (eachNum % 2 == 0) {
                    evenCount++;
                    evenNums += eachNum + " ";
                } else {
                    oddCount++;
                    oddNums += eachNum + " ";
                }
            }
            System.out.println(evenNums); // 4 12 20_

            evenNums = evenNums.trim();
            oddNums = oddNums.trim();

            System.out.println("Even: " + evenCount);
            System.out.println("Even nums: " + evenNums.trim());
            System.out.println("Odd: " + oddCount);
            System.out.println("Odd nums: " + oddNums.trim());



        }
    }

