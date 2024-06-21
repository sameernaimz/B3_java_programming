package AccountNumber.day41_collection.bank;
// Anything class which is child class of Exception is checked/compile Exception [Expect RunTimeException]
// Any class which is child class of RunTimeException is unchecked/runtime Exception
public class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String message) {
        super(message);


    }


}
