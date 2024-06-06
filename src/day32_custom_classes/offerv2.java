package day32_custom_classes;

public class offerv2 {

        String location;
        String company;
        double salary;
        boolean isFullTime;
        int numberOfPTO;

        public offerv2(String company, String location) {
            this.company = company;
            this.location = location;
            this.salary = salary;
        }


        public offerv2(String company, String location, double salary) {
            //           this.company = company;
            //           this.location = location;
            this(company, location);
            this.salary = salary;
        }
        //BAD CONSTRUCTOR EXAMPLE
    // ASSIGNING  WRONG VALUES TO WRONG INSTANCE VARIABLES
        public offerv2 (String location, String company, double salary, boolean isFullTime, int numberOfPTO,String name, String lastName) {
            //  this.location = location;
            // this.company = company;
            // this.salary = salary;
            this(name, lastName); // NOT GOOD PRACTICE. WRONG ASSIGNING
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
