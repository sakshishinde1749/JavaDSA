package Loop;
/*loop : (note: if we want to find last digit of any num then take modulo with 10 and for removing last digit of that num divide by 10)
 *       1) while(condition){        2)for(initiaisation; condition; updation){      3)do{
 *           do something                   do something                                 do something
 *           }                             }                                              }while(condition)
 */



// public class loop{
//     public static void main(String args[]){
//         int counter = 0;

//         while(counter<100){
//             System.out.println("Dont waste your time");
//             counter++;
//         }
//         System.out.println("printed 100x");
//     }
// }



//PRINTING NUMBERS FROM 1 TO 10
// public class loop{
//     public static void main(String args[]){

//         int n = 1;
//         while(n<=10){
//             System.out.println(n);
//             n++;
//         }

//     }
// }



//PRINTING NUMBERS FROM 1 TO n (TAKING n FROM USER)
// import java.util.Scanner;
// public class loop{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         int counter = 1;

//         System.out.println("enter a last number");
//         int range = sc.nextInt();

//         while(counter<=range){
//             System.out.println(counter);
//             counter++;
//         }
//         System.out.println("numbers are printed till "+ range);
//     }
// }



//PRINTING SUM OOF n NATURAL NUMBERS
// import java.util.Scanner;
// public class loop{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         int counter = 1;

//         System.out.println("enter a last number");
//         int range = sc.nextInt();

//         System.out.print("the sum of"+range+"natural numbers is ");
    
//         int sum = 0;
//         while(counter<=range){
                        
//             sum += counter;
//             counter++;
//         }
//         System.out.println(sum);

//     }
// }



//PRINTNING SOME STATEMENT 10 TIMES
// public class loop{
//     public static void main(String args[]){
//         for(int i=1; i<=10; i++){
//             System.out.println("I am not short");
//         }
//         System.out.println("we printed our statement 10 times");
//     }
// }



//PRINTING SQUARE PATTERN
// public class loop{
//     public static void main(String args[]){

//         for(int i=1; i<=4; i++){
//             System.out.println("* * * *");
//         }
//     }
// }



//PRINTING REVERSE OF NUMBER
// import java.util.Scanner;
// public class loop{
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter a number");
//         int n = sc.nextInt();

//         for(int i=1; n>0; i++){
//             int lastdigit = n%10;
//             System.out.print(lastdigit);

//             n = n/10;
            
//         }

        
//     }
// }



//REVERSE THE GIVEN NUMBER
// import java.util.Scanner;
// public class loop{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter a number");
//         int n = sc.nextInt();
//         int rev = 0;

//         for(int i=1; n>0; i++){

//             int lastdigit = n%10;

//             rev = (rev*10) + lastdigit;

//             n = n/10;

//         }
//         System.out.println(rev);

//     }
// }


//PRINTING SOMETHING BY DO WHILE LOOP
// public class loop{
//     public static void main(String args[]){
//         int counter = 0;
//         do{
//             System.out.println("life sucks:(");
//             counter++;
//         }while(counter<=10);
//     }
// }



//USING BREAK STATEMENT
// import java.util.Scanner;
// public class loop{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a number");


//         do{
//             int n = sc.nextInt();
//             if(n%10==0){
//                 break;
//             }

//             System.out.println("I cant give up now");
//         }while(true);

//     }
// }



//USING CONTINUE STATEMENT
// import java.util.Scanner;
// public class loop{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         do{
//             System.out.println("enter a number");
//             int n = sc.nextInt();
//             if(n%10==0){
//                 continue;
//             }
//             System.out.println("stop caring for stupid people");
//         }while(true);
//     }
// }



// NUM IS PRIMME OR NOT
// import java.util.Scanner;
// public class loop{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter a number");
//         int n = sc.nextInt();

//         int i = 2;

//         for( i=2; i<n; i++){
//             if(n%i==0){

//                 System.out.println("number is not prime");
//                 break;
//             }
//     }
//     if(i==n){
//         System.out.println("this is prime number");
//     }
// }