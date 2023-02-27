import java.util.Scanner;

/*functions: returnType name(parameter1, parameter2){            *function related information like variables all gets save to memory called "call stack"
*                body
*                return statement;
*            }
}*/



// public class functions_methods {
//     public static void printhelloworld(){
//         System.out.println("hello world");
//         return;
//     }

//     public static void main(String args[]){
//         printhelloworld();
//     }
    
// }



//functions with parameters
// import java.util.Scanner;
// public class functions_methods{
//     public static void calculatesum(){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter a number");
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = a+b;

//         System.out.println("the sum of these numbers is "+ sum);

//     }

// public static void main(String args[]){
//     calculatesum();
// }
// }



// import java.util.Scanner;
// public class functions_methods{
//     public static void calculatesum(int num1,int num2){
//         int sum = num1+num2;
//         System.out.println("the sum is "+sum);

//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter your numbers");
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         calculatesum (a,b);
//     }
// }


// import java.util.Scanner;
// public class functions_methods{
//     public static int calculatesum(int num1, int num2){   //parameters or formal parameters
//         int sum = num1+num2;
//         return(sum);
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int sum = calculatesum(a, b);      //arguments or actual parameters 
//         System.out.println("The sum is "+sum);
//     }
// }



//call by value: copy of value get pass to function
//call by reference:original value get pass to function

//swaping of two values
// public class functions_methods{
//     public static void swap(int a, int b){
//         int temp = a;
//         a = b;
//         b = temp;
//         System.out.println("a = "+a);
//         System.out.println("b = "+b);
//     }
//     public static void main(String args[]){
//         int a = 5;
//         int b = 10;
//         swap(a,b);
//     }
// }



// public class functions_methods{
//     public static void swap(int a,int b){
//         int temp = a;
//         a = b;
//         b = temp;
//     }
//     public static void main(String args[]){
//         int a1 = 10;
//         int b1 = 5;
//         swap(a1,b1);
//         System.out.println(a1);
//         System.out.println(b1);
//     }
// }



// //product of a and b
// import java.util.Scanner;
// public class functions_methods{
//     public static int product_ab(int a, int b){
//         int product = a*b;
//         return(product);

//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter first number");
//         int a1 = sc.nextInt();

//         System.out.println("enter second number");
//         int b1 = sc.nextInt();

//         int prod = product_ab(a1, b1);
//         System.out.println("The product of a and b is "+prod);
    
//     }
// }



//factorial of a and b
// import java.util.Scanner;
// public class functions_methods{
//     public static int factorial_a(int a){

//         int fact = a;

//         for(int i=1; i<=a-1; i++){
            
//             fact *= (a-i);
//         }
//         return fact;
//     }

//         public static void main(String args[]){
//             Scanner sc = new Scanner(System.in);

//             System.out.println("enter a number");
//             int a1 = sc.nextInt();
//             int factorial = factorial_a(a1);

//             System.out.println("The factorial is "+factorial);
//         }


// }



//binomial coefficient
// public class functions_methods{
//     public static int binomialCoe_n_r(int n, int r){
//         int fact_rn = n-r;
//         int factn = n;
//         int factr =r;

//         for(int i=1; i<=n-1; i++){
//             factn *=(n-i);
//         }
//         for(int i=1; i<=r-1; i++){
//             factr *=(r-i);
//         }
//         for(int i=1; i<=n-r-1; i++){
//             fact_rn *=(n-r-i);
//         }

//         int binomialCoe = factn/(factr*fact_rn);

//         return binomialCoe;

//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter n value");
//         int n1 = sc.nextInt();

//         System.out.println("enter r value");
//         int r1 = sc.nextInt();

//         System.out.print("bionomialcoefficient : "+binomialCoe_n_r(n1, r1));

//     }
// }


// functions which already exists in java are called inbuilt method or functions that we derive on our own are called user defined method

//function overloading:multiple functions with same name but different parameters
//function overloading depends on number of paramters not on return type


//prime or not prime 
// import java.util.Scanner;
// public class functions_methods{
// public static String prime_notprime(int n){
//     int i;
//     String ans = " ";
//     for( i=2; i<=n-1; i++){
//         if(n%i==0){
//             ans = "notPrime";
//             break;
//         }
        
//     }
//     if(i==n){
//         ans = "prime";
//     }
//     return ans;
// }
// public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);

//     System.out.println("enter a number");
//     int n1 = sc.nextInt();

//     String primeornot = prime_notprime(n1);
//     System.out.println(primeornot);

// }
// }



// public class functions_methods{
//     public static String PrimeOrNot(int n){

//         int i;
//         String ans = "";

//         for(i=2; i<=n-1; i++){
//             if(n%i==0){
//                 ans = "Not Prime";
//                 break;
//             }
//         }
//         if(i==n){
//             ans = "Prime";
//         }
//         return ans;

//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter a number");
//         int n = sc.nextInt();

//         String IsPrimeNotprime = PrimeOrNot(n);
//         System.out.println(IsPrimeNotprime);



//     }
// }


// import java.util.Scanner;
// public class functions_methods{
//     public static boolean PrimeOrNot(int n){
//         int i;
//         boolean ans = true;

//         for(i=2; i<=n-1; i++){
//             if(n%i==0){
//                 ans = false;
//                 break;
//             }
//         }
//         if(i==n){
//             ans = true;
//         }
//         return ans;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter a number");
//         int n = sc.nextInt();

//         boolean IsPrimeNotprime = PrimeOrNot(n);

//         if(IsPrimeNotprime==true){
//             System.out.println("Prime");
//         }
//         else{
//             System.out.println("Not Prime");
//         }

//     }
// }



//PRIME IN RANGE
// import java.util.Scanner;
// public class functions_methods{
//     public static void PrimeNum(int a, int b){
//         int i;
//         int j;

//         for( i=a; i<=b; i++){
//             for( j=2; j<=i-1; j++){
//                 if(i%j==0){
//                     break;
//                 }
//             }
//             if(j==i){
//                 System.out.print(i+" ");
//             }
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter first number of range");
//         int n1 = sc.nextInt();

//         System.out.println("Enter second number of range");
//         int n2 = sc.nextInt();

//         System.out.println("The prime numbers between "+ n1+ " and "+ n2+ " are ");
//         PrimeNum(n1, n2);
//     }
// }



//BINARY TO DECIMAL
// import java.util.Scanner;
// public class functions_methods{
//     public static void BinToDec(int n){
//         int pow = 0;
//         int Decimal = 0;
//         int LastDigit = n%10;

//         for(int i=1; n>0; i++){
            
//             Decimal += (LastDigit * (int)Math.pow(2,pow));

//             n = n/10;
//             pow++;
//         }
//         System.out.println(Decimal);

//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter your Binary number");
//         int n = sc.nextInt();

//         System.out.print("Decimal number will be ");
//         BinToDec(n);
//     }
// }



//method scope : if we definesd any variable into our function then we can use that variable after defining that variable
// block scope : if we defined any varibale into any block or into any curly braces then we can use that varible into that region only

public class functions_methods{
    public static void DecToBin(int n){
        int pow = 0;
        int Binary = 0;

        while(n>0){
            int rem = n%2;
            Binary += (rem * (int)Math.pow(2, pow));

            n = n/2;
            pow++;
        }
        System.out.println(Binary);

    }
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your decimal number");
            int n1 = sc.nextInt();

            System.out.println("binary number will be ");
            DecToBin(n1);
        }


    }
}