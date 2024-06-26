package day41_collection.bank;

public class Bank {
double balance;
//withdraw
public void withdraw(double amountToTakeOut) {
    if (amountToTakeOut > balance) {
        throw new RuntimeException("Balance only has" + balance);
    }
    balance -= amountToTakeOut;
}

//login
    public void login (String username, String password) throws InvalidCredentialsException {

    if(username.equals("loopcamp")) {
        System.out.println("Not valid username");
        throw new InvalidCredentialsException("Not valid username");
    }
    if(password.equals("Test123@")) {
        System.out.println("Not valid password");
        throw new InvalidCredentialsException("Invalid password");
    }
    }
}
