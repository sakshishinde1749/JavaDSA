//Q1 n is postive or negative (taking inputs from user)

// IF ELSE METHOD:
import java.util.Scanner;
    public class conditionalstate{

        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");
        float n = sc.nextFloat();

        if(n>0){
            System.out.println("positive");
        }
        else{
            System.out.println("negative");

        }



    // TERNARY OPERATOR METHOD:
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");
        float n = sc.nextFloat();

        String result = (n>0)? "The number is positive" : "The number is negative";

        System.out.println(result);
    

    //SWITCH METHOD:
        System.out.println("enter a number");
        int n = sc.nextInt();

        int absn = Math.abs(n);
        int c = absn - n;

        switch(c){
            case 0 : System.out.println("positive");
                    break;
            
            default : System.out.println("negative");
        }



    //Q.2 CALCULATE YOU HAVE A FEVER OR NOT
        double temp = 103.5;
        if(temp>100){
            System.out.println("you have a fever");
        }
        else{
            System.out.println("you dont have a fever");
        }


    //Q.3 DAY OF WEEKS BY SWITCH
        System.out.println("enter a number for week day");
        int weekday = sc.nextInt();

        switch(weekday){
            case 1 : System.out.println("Its monday:)");
                    break;
            
            case 2 : System.out.println("Its tuesday:)");
                    break;

            case 3 : System.out.println("Its wednesday:)");
                    break;
            
            case 4 : System.out.println("Its thurday:)");
                    break;

            case 5 : System.out.println("Its friday:)");
                    break;

            case 6 : System.out.println("Its saturday:)");
                    break;

            case 7 : System.out.println("Its sunday:)");
                    break;
            
              default :System.out.println("oops! ans is invalid pls, enter a number between 1 to 7")
        }



    // Q.4 YEAR IS LEAP YEAR OR NOT:
        System.out.println("enter a year");
        int year = sc.nextInt();

        if(year%4==0 && year%100==0 && year%400==0){
            System.out.println("its a leap year");
        }
        else if(year%100!=0 && year%4==0){
            System.out.println("its a leap year");
        }
        else{
            System.out.println("its not a leap year");
        }
        
        
    }
}



