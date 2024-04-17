package day10_if_statements;


    /*
    create a char variable with a letter (can only do this one hardcoded, no Scanner method for char)
    find out if the letter is an uppercase letter or lowercase letter. Print the type of letter it is

    ex:
        'b'
        lowercase

    ex:
        'U'
        uppercase
 */

int score = 70;

        if (score >= 75){
        System.out.println("Passing the exam!");
        } else {
                System.out.println("Failing the exam!");
        }


                // if score is > 90 -- > print excellent else print keep working
                // what happens is score is  == 90
                // what happens if score is  < 90

                if (score > 90) { // 70
        System.out.println("Excellent");
        } else {
                System.out.println("Keep Working");
        }



int year = 2029;
boolean isLockdown = year == 2020 || year == 2021;

        if(isLockdown) {
        System.out.println("Stay at home.");
            System.out.println("Practice CODING");
        } else {
                System.out.println("Go outside");
            System.out.println("Meet with friends");
        }

public class BankAccount {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);


        System.out.print("What is your balance: $");
        double balance = key.nextDouble();

        System.out.print("How much you want to withdraw? $");
        // double withdraw = 500; // hardcoded
        double withdraw = key.nextDouble(); // Dynamic

        // balance = balance - withdraw;  // regular way
        balance -= withdraw;  // shorthand operator way

        if (balance < 0) {
            System.out.println("You took too much money. $100 overdraft fee will be applied");
            //balance = balance - 100;
            balance -= 100;
            System.out.println("You balance after fee $" + balance);
        }  else {
            System.out.println("Your balance after withdraw is $" + balance);
        }



















    }
}