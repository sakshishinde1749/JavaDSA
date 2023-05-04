package OOPS;

// Access Modifiers     within class    within package    outside Package by subclass only     outside package

// Private                  Y                  N                      N                              N
// Default                  Y                  Y                      N                              N
// Protected                Y                  Y                      Y                              N
// Public                   Y                  Y                      Y                              Y

public class AccessModifiers {

    public static void main(String args[]){

        BankAccount MyAcc = new BankAccount();
        MyAcc.username = "sakshi shinde";
        MyAcc.setPassword("sljfskajasf");
    }
    
}

class BankAccount{

    public string username;
    private string password;     //we cant access this because its private

    public void setPassword(string pwd){
        password = pwd;
    }

}
