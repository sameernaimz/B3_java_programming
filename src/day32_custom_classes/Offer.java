package day32_custom_classes;
/*
    create a class called Offer

    - data:

        location, company, salary, is full time, number of PTO
*/
public class Offer {
    String location;
    String company;
   public double salary;
  public  boolean isFullTime;
    int numberOfPTO;

    public Offer (String company, String location) {
        this.company = company;
        this.location = location;
        this.salary = salary;
    }



    public Offer (String company, String location, double salary) {
        this.company = company;
        this.location = location;
        this.salary = salary;
    }

    public Offer(String location, String company, double salary, boolean isFullTime, int numberOfPTO) {
        this.location = location;
        this.company = company;
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.numberOfPTO = numberOfPTO;


    }

    @Override
    public String toString() {

        String info = company + " is located in " + location;
        info += "\n" + (salary > 0 ? salary : "");

        info += "\n" + (isFullTime ? "Full Time" : "Contract");

        info += "\n" + (numberOfPTO > 0 ? numberOfPTO : "");


//        return "Offer{" +
//                "location='" + location + '\'' +
//                ", company='" + company + '\'' +
//                ", salary=" + salary +
//                ", isFullTime=" + isFullTime +
//                ", numberOfPTO=" + numberOfPTO +
//                '}';

        return info;

    }
}
