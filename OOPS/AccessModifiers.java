package OOPS;

/*
 *  Access Modifiers    Within class    within Package    outsidePackage bySubclass only   Outside package
 *  Private                 Y               N                           N                       N
 *  Default                 Y               Y                           N                       N
 *  Protected               Y               Y                           Y                       N
 *  Public                  Y               Y                           Y                       Y
 */


public class AccessModifiers {
    
    public static void main(String args[]){
        BankAccount myAccount = new BankAccount();
        myAccount.username = "Sakshi";
        myAccount.setPassword("thisIsNewPass");
    }

}

class BankAccount{
    public String username;
    private String password;  //no one can access this properties, acccessible only inside class

    void setPassword(String newPassword){
        password = newPassword;
    }
}
