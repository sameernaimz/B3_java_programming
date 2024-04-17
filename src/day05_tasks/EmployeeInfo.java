package day05_tasks;

public class EmployeeInfo {
    public static void main(String[] args) {
        String FIRSTNAME = "James";
        String LASTNAME = "Bond";
        String Gender = "M";
        int age = 40;
        String companyName = "MI6";
        boolean FullTime = true;
        String jobTitle = "Special Agent";
        long salary = 1000000;
        int numofPto = 15;
        boolean AreMarried = false;
        char suite = 'D';

        String fullDetail = "Employment information for" + " " + FIRSTNAME + " " +  LASTNAME + "\nGender" + Gender + "\n" + jobTitle + "\nCurrently " + age + " years old" + "\n" + companyName + " is located in suite " + suite + "\nThis years salary comes to $" + salary + "\nOtherDetails" + ":\n\tPto:" + numofPto + " is full time? " + FullTime + "\n\tMarried?  " +   AreMarried;
            System.out.println(fullDetail);
    }
}
