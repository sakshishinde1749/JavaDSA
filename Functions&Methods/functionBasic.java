/*functions: returnType name(parameter1, parameter2){            *function related information like variables all gets save to memory called "call stack"
*                body
*                return statement;
*            }
}*/


import java.util.Scanner;
public class functionBasic {
            public static String PrimeOrNot(int n){
                try (Scanner sc = new Scanner(System.in)) {
                }

                int i;
                String ans = "";
        
                for(i=2; i<=n-1; i++){
                    if(n%i==0){
                        ans = "Not Prime";
                        break;
                    }
                }
                if(i==n){
                    ans = "Prime";
                }
                return ans;
        
            }
            public static void main(String args[]){
                try (Scanner sc = new Scanner(System.in)) {
                    System.out.println("enter a number");
                    int n = sc.nextInt();
      
                    String IsPrimeNotprime = PrimeOrNot(n);
                    System.out.println(IsPrimeNotprime);
                }
        
        
        
            }
        }

