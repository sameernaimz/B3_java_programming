package day12_switch_statements;
import java.util.Scanner;
/*
     Task:

        Ask the user to enter which day it is
        print which class we have on that day, and the time of the class

        topic with instructor at time

        challenge:
            make each day flexible

                monday
                Monday
                mon

             reduce repeating code
 */
public class Schedule {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What day do you want to know about? ");

        System.out.print("What day do you want to know about? ");
        String day = input.next();
        String information = "";

        switch (day) {
            case "Monday":
            break;
            case"wednesday":
            case "thursday":
                information ="WE HAVE JAVA CLASS STARTS 7 P.M";
                break;
            case "Saturday":
                information = "We have java classes starting at 9:30 A.M";
                break;
            case "Sunday":
                information = "We have SOFTSKILLS class";
                break;
            default:
                information = "Not valid day of week";
        }

        System.out.println(information);

        }
    }


