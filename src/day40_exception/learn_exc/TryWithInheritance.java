package day40_exception.learn_exc;

public class TryWithInheritance {
    public static void main(String[] args) {
        try {
            int [] a = {1,2,3,4,5};
            System.out.println(a[9]); //IndexOutOfBoundsException
        } catch (IndexOutOfBoundsException e) {

        } catch (RuntimeException e) {

        } catch(Exception e) {
            /**
             * Parent exception class cannot be before child exception class
             * Because the Parent Exception will can whatever Child would catch as well
             * So, Child Exception class will never be reached.
             */


        /*
            All possible references of IndexOutOfBoundsException class

                IndexOutOfBoundsException e = new IndexOutOfBoundsException();

                RuntimeException e = new IndexOutOfBoundsException();

                Exception e = new IndexOutOfBoundsException();


         */
        }
    }
}
