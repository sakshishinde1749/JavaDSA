package PracticeQuestions;
//VARIABLES AND DATA TYPE HW
//Q.1)avg of 3 numbers(taking inputs from user)

// import java.util.Scanner;
// public class practiceq {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("entre num1");
//         int a=sc.nextInt();
//         System.out.println("enter num2");
//         float b=sc.nextFloat();
//         System.out.println("entre num3");
//         char c=sc.next().charAt(0);
//         float avg=a+b+c/3;
//         System.out.print("the avg of these numbers is ");
//         System.out.println(avg);

//     }
    
// }



//Q.2)area of square(taking inputs from user)

// import  java.util.Scanner;
// public class practiceq{
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("entre side of square");
//         float side=sc.nextFloat();
//         System.out.print("The area of square is ");
//         double area=side*side;
//         System.out.println(area);

        
//     }
// }



//Q.3)bill of 3 products

// import java.util.Scanner;
// public class practiceq{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         {
//             System.out.println("entre first product amount");
//             float product1=sc.nextFloat();
//             System.out.println("entre second product amount");
//             float product2=sc.nextFloat();
//             System.out.println("entre third product amount");
//             float product3=sc.nextFloat();
//             Float Billamount=product1+product2+product3;
//             System.out.print("The bill amount is ");
//             System.out.println(Billamount);
            
            
//         }

//     }
// }



//Q.4)
// public class practiceq{
//     public static void main(String args[]){
//         int $a = 24;    //name of variables called identifiers in java and it can start with any alphabet or "_" or "$"
//         System.out.println($a);
//     }
// }



//OPERATORS HW
//Q.1)
// public class practiceq{
//     public static void main(String args[]){
//         int x = 2;
//         int y = 5;
//         int exp1 = x*y/x;
//         int exp2 = x*(y/x);
//         System.out.println(exp1);
//         System.out.println(exp2);
//     }
// }



//CONDITIONAL STATEMENTS HW
//Q.1)n is postive or negative (taking inputs from user)

//IF ELSE METHOD:
// import java.util.Scanner;
// public class practiceq{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter a number");
//         float n = sc.nextFloat();

//         if(n>0){
//             System.out.println("positive");
//         }
//         else{
//             System.out.println("negative");

//         }
//     }
// }

//TERNARY OPERATOR METHOD:
// import java.util.Scanner;
// public class practiceq{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter a number");
//         float n = sc.nextFloat();

//         String result = (n>0)? "The number is positive" : "The number is negative";

//         System.out.println(result);
//     }
// }

//SWITCH METHOD:
// import java.util.Scanner;

// public class practiceq{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter a number");
//         int n = sc.nextInt();

//         int absn = Math.abs(n);
//         int c = absn - n;

//         switch(c){
//             case 0 : System.out.println("positive");
//                     break;
            
//             default : System.out.println("negative");
//         }

//     }
// }


//Q.2 CALCULATE YOU HAVE A FEVER OR NOT
// public class practiceq{
//     public static void main(String args[]){
//         double temp = 103.5;
//         if(temp>100){
//             System.out.println("you have a fever");
//         }
//         else{
//             System.out.println("you dont have a fever");
//         }
//     }
// }


//Q.3 DAY OF WEEKS BY SWITCH
// import java.util.Scanner;
// public class practiceq{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter a number for week day");
//         int weekday = sc.nextInt();

//         switch(weekday){
//             case 1 : System.out.println("Its monday:)");
//                     break;
            
//             case 2 : System.out.println("Its tuesday:)");
//                     break;

//             case 3 : System.out.println("Its wednesday:)");
//                     break;
            
//             case 4 : System.out.println("Its thurday:)");
//                     break;

//             case 5 : System.out.println("Its friday:)");
//                     break;

//             case 6 : System.out.println("Its saturday:)");
//                     break;

//             case 7 : System.out.println("Its sunday:)");
//                     break;
//             
//               default :System.out.println("oops! ans is invalid pls, enter a number between 1 to 7")
//         }
//     }
// }


//Q.4 YEAR IS LEAP YEAR OR NOT:
// import java.util.Scanner;
// public class practiceq{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter a year");
//         int year = sc.nextInt();

//         if(year%4==0 && year%100==0 && year%400==0){
//             System.out.println("its a leap year");
//         }
//         else if(year%100!=0 && year%4==0){
//             System.out.println("its a leap year");
//         }
//         else{
//             System.out.println("its not a leap year");
//         }
        
        
//     }
// }




//LOOP
//Q.1 SUM OF ODD AND EVEN INT
// import java.util.Scanner;
// public class practiceq{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter how many digits you want to enter");
//         int n = sc.nextInt();

//         int evensum = 0;
//         int oddsum = 0;

//         for(int i=1; i<=n; i++){
//             int num = sc.nextInt();

//             if(num%2==0){
//                 evensum += num;
//             }
//             else{
//                 oddsum += num;
//             }

//         }
//         System.out.println("the sum of even digits is ");
//         System.out.println(evensum);

//         System.out.println("the sum of odd digits is ");
//         System.out.println(oddsum);


//     }
// }


//BY DO WHILE LOOP
// import java.util.Scanner;
// public class practiceq{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         int evensum = 0;
//         int oddsum = 0;
//         int choice;

//         do{
//             System.out.println("Enter a number");
//             int n = sc.nextInt();

//             if(n%2==0){
//                 evensum += n;
//             }
//             else{
//                 oddsum += n;
//             }
//             System.out.println("do you wanna continue? press 1 for yes or 0 for no");
//             choice = sc.nextInt();
//         } while(choice==1);

//         System.out.println("the sum of even nummbers is "+ evensum);
//         System.out.println("the sum of odd numbers is "+oddsum);


//     }
// }



//factorial of n
// import java.util.Scanner;
// public class practiceq{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a number");
//         int n = sc.nextInt();
//         int fact = n;

//         for(int i=1; i<=n-1; i++){

//             fact = fact*(n-i);
            
//         }
//         System.out.println(fact);


//     }
// }



//MULTIPLICATION TABLE FOR INT ENTERTED BY USER
// import java.util.Scanner;
// public class practiceq{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a number");
//         int n = sc.nextInt();

//         for(int i=1; i<=10; i++){
//             int result = n*i;
//             System.out.println(n+"*"+i+"="+result);
//         }
//     }
// }



//FUNCTIONS/ METHODS :
//Q.1 AVG OF 3 NUM
// import java.util.Scanner;
// public class practiceq{
//     public static int AvgNum(int a, int b, int c){
//         int avg = (a+b+c)/3;

//         return avg;
//     }

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter n1, n2 and n3");
//         int n1 = sc.nextInt();
//         int n2 = sc.nextInt();
//         int n3 = sc.nextInt();

//         int AvgOfNum = AvgNum(n1, n2, n3);
//         System.out.println("The average of these 3 numbers is "+AvgOfNum);
//     }
// }



//EVEN OR ODD
// import java.util.Scanner;
// public class practiceq{

//     public static boolean EvenOdd(int n){
//         boolean ans;

//         if(n%2==0){
//             ans = true;
//         }
//         else{
//             ans = false;
//         }
//         return ans;
//     }

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a number");
//         int n1 = sc.nextInt();

//         Boolean EvenOrOdd = EvenOdd(n1);
//         System.out.println(EvenOrOdd);

//     }
// }



//Q.5 SUM OF DIGITS OF INTEGER
// public class practiceq{
//     public static void DigitSum(int n){
//         int sum = 0;

//         for(int i=1; n>0; i++){
//             int LastDigit = n%10;

//             sum += LastDigit;

//             n = n/10;
//         }
//         System.out.println(sum);
//     }
//     public static void main(String args[]){

//         System.out.print("The sum of digits of given integer is  ");
//         DigitSum(124254);
//     }
// }



//Q.3 palindrome
// public class practiceq{
//     public static void PalindromeOrNot(int n){
//         int rev = 0;

//         for(int i=1; n>0; i++){
//             int LastDigit = n%10;

//             rev = (rev*10) + LastDigit;

//             n = n/10;
//         }

//         if(n==rev){
//             System.out.println("The number is palindrome");
//         }
//         else{
//             System.out.println("The nummber is not palindrome");
//         }

//     }
//     public static void main(String args[]){
//         PalindromeOrNot(121);
//     }
// }





