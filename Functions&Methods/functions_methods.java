
import java.util.Scanner;
public class functions_methods {

    //functions with parameters
    public static void calculatesum(){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;

        System.out.println("the sum of these numbers is "+ sum);
        return;
    }

    //sum of two num
    public static void calculatesum(int num1,int num2){

        int sum = num1+num2;
        System.out.println("the sum is "+sum);
        return;

    }
   

    //sum of two num
    public static int calculatesumm(int num1, int num2){   //parameters or formal parameters
        int sum = num1+num2;
        return(sum);
    }
   

    //call by value: copy of value get pass to function
    //call by reference:original value get pass to function


    //swaping of two values
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    


//product of a and b
    public static int product_ab(int a, int b){
        int product = a*b;
        return(product);

    }
    

//factorial of a and b
    public static int factorial_a(int a){

        int fact = a;

        for(int i=1; i<=a-1; i++){
            
            fact *= (a-i);
        }
        return fact;
    }



//binomial coefficient
    public static int binomialCoe_n_r(int n, int r){
        int fact_rn = n-r;
        int factn = n;
        int factr =r;

        for(int i=1; i<=n-1; i++){
            factn *=(n-i);
        }
        for(int i=1; i<=r-1; i++){
            factr *=(r-i);
        }
        for(int i=1; i<=n-r-1; i++){
            fact_rn *=(n-r-i);
        }

        int binomialCoe = factn/(factr*fact_rn);

        return binomialCoe;

    }
    


// functions which already exists in java are called inbuilt method or functions that we derive on our own are called user defined method

//function overloading:multiple functions with same name but different parameters
//function overloading depends on number of paramters not on return type


//prime or not prime 
public static String prime_notprime(int n){
    int i;
    String ans = " ";
    for( i=2; i<=n-1; i++){
        if(n%i==0){
            ans = "notPrime";
            break;
        }
    }
    if(i==n){
        ans = "prime";
    }
    return ans;
}


//prime or not with boolean
    public static boolean PrimeOrNot(int n){
        int i;
        boolean ans = true;

        for(i=2; i<=n-1; i++){
            if(n%i==0){
                ans = false;
                break;
            }
        }
        if(i==n){
            ans = true;
        }
        return ans;
    }
    


//PRIME IN RANGE
    public static void PrimeNum(int a, int b){
        int j;

        for( int i=a; i<=b; i++){
            for( j=2; j<=i-1; j++){
                if(i%j==0){
                    break;
                }
            }
            if(j==i){
                System.out.print(i+" ");
            }
        }
        return;
    }
    


//BINARY TO DECIMAL
    public static void BinToDec(int n){
        int pow = 0;
        int Decimal = 0;
        int LastDigit = n%10;

        for(int i=1; n>0; i++){
            
            Decimal += (LastDigit * (int)Math.pow(2,pow));

            n = n/10;
            pow++;
        }
        System.out.println(Decimal);

    }


//method scope : if we defined any variable into our function then we can use that variable after defining that variable
// block scope : if we defined any varibale into any block or into any curly braces then we can use that varible into that region only


//DECIMAL TO BINARY
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

        calculatesum();
        calculatesum(4, 5);      //arguments or actual parameters 
        swap(9,7);
        product_ab(3,4);
        factorial_a(6);
        binomialCoe_n_r(4, 6);
        prime_notprime(6);
        PrimeOrNot(7);
        PrimeNum(4, 32);
        BinToDec(6);
        DecToBin(23);



    }
}
    