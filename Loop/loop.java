package Loop;
/*loop : (note: if we want to find last digit of any num then take modulo with 10 and for removing last digit of that num divide by 10)
 *       1) while(condition){        2)for(initiaisation; condition; updation){      3)do{
 *           do something                   do something                                 do something
 *           }                             }                                              }while(condition)
 */


import java.util.Scanner;
public class loop{
    public static void main(String args[]){
       try(Scanner sc = new Scanner(System.in));

        int counter = 0;

        while(counter<100){
            System.out.println("Dont waste your time");
            counter++;
        }
        System.out.println("printed 100x");



//printing from 1 to 10
        int n = 1;
        while(n<=10){
            System.out.println(n);
            n++;
        }



//printing numbers from 1 to n (taking input n from user)
        int counterr = 1;

        System.out.println("enter a last number");
        int range = sc.nextInt();

        while(counter<=range){
            System.out.println(counterr);
            counterr++;
        }
        System.out.println("numbers are printed till "+ range);



//sum of natural numbers
        int num = 1;

        System.out.println("enter a last number");
        int lastDigit = sc.nextInt();

        System.out.print("the sum of"+lastDigit+"natural numbers is ");
    
        int sum = 0;
        while(num<=lastDigit){
                        
            sum += num;
            num++;
        }
        System.out.println(sum);



//printing ... statement 10 times
        for(int i=1; i<=10; i++){
            System.out.println("I am not short");
        }
        System.out.println("we printed our statement 10 times");
    


//printing square pattern 
        for(int i=1; i<=4; i++){
            System.out.println("* * * *");
        }



//printing reverse of a number
        System.out.println("enter a number");
        int number = sc.nextInt();

        while(number>0){
            int lastdigit = number%10;
            System.out.print(lastdigit);

            number = number/10;
            
        }



//reverse the given number
        System.out.println("enter a number");
        int numberr = sc.nextInt();
        int rev = 0;

        while(numberr>0){

            int lastdigit = numberr%10;

            rev = (rev*10) + lastdigit;

            numberr = numberr/10;

        }
        System.out.println(rev);


//printing ... by do while loop
        int countingNum = 0;
        do{
            System.out.println("life sucks:(");
            countingNum++;
        }while(countingNum<=10);



//using break statement
        System.out.println("Enter a number");


        do{
            int a = sc.nextInt();
            if(a%10==0){
                break;
            }

            System.out.println(":)");
        }while(true);



//using continue statement
        do{
            System.out.println("enter a number");
            int b = sc.nextInt();
            if(b%10==0){
                continue;
            }
            System.out.println("Yes you can");
        }while(true);



//prime or not
        System.out.print("enter a number");
        int c = sc.nextInt();

        int i = 2;

    for( i=2; i<c; i++){
            if(c%i==0){

                System.out.println("number is not prime");
                break;
            }
    }
    if(i==c){
        System.out.println("this is prime number");
    }
}

}