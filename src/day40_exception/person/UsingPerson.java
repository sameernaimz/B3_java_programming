package day40_exception.person;



public class UsingPerson {
    public static void main(String[] args) {


        person obj = new person();
        try {
            obj.setName("jj");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(obj.getName());
// obj.setName("")
    //    System.out.println(obj.getName());
        System.out.println("Hello");

        try {
            obj.setAge(130);
        } catch (RuntimeException e) {
           // System.out.println(e.getMessage());
      e.printStackTrace();
        }
        System.out.println("Bye");
    }

}
