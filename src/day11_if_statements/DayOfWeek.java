package day11_if_statements;
import java.util.Scanner;
public class DayOfWeek {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int weekDay  = key.nextInt();




                    if (weekDay == 1) {
                        System.out.println("Monday");
                    }else if (weekDay == 2) {
                        System.out.println("Tuesday");
                    } else if (weekDay ==3) {
                        System.out.println("Wednesday");
                    } else if (weekDay == 4) {
                        System.out.println("Thursday");
                    } else if (weekDay == 5) {
                        System.out.println("Friday");
                    } else if (weekDay == 6) {
                        System.out.println("Saturday. Nice Java day");
                    } else if (weekDay == 7){
                        System.out.println("Sunday. Chit Cat day");
                    } else {
                        System.out.println("There is no number like this representing a day of week");
                    }

                    // You can do this solution above with the SINGLE IF statements as well.
                    // The difference is it will check every SINGLE IF statement on the execution.
                    // But with MULTI BRANCH IF / ELSE_IF statement, it skips the execution after FIRST match./ FIRST true condition.
        }
}
