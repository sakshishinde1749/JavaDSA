package Patterns;

//PYRAMID PATTERN
import java.util.Scanner;
public class patterns1 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            for(int i=1; i<=4; i++){
                for(int j=1; j<=i; j++ ){
                    System.out.print("*");
                }
                System.out.println();
            }
            


//PYRAMID PATTERN (TAKING INPUT FROM USER)
            System.out.println("enter a number");
            int n = sc.nextInt();


            for(int i=1; i<=n; i++){
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }



//INVERTED PYRAMID PATTERN
            System.out.println("Enter a number");
            int num = sc.nextInt();

            for(int i=1; i<=num; i++){
                for(int j=1; j<=num-i+1; j++ ){
                    System.out.print("*");
                }
                System.out.println();
            }



//PRINT HALF PYRAMID PATTERN
            System.out.println("Enter how many lines pattern u wanna create");
            int number = sc.nextInt();

            for(int i=1; i<=number; i++){
                for(int j=1; j<=i; j++){
                    System.out.print(j);
                }
                System.out.println();
            }
            


//print char pattern
                System.out.println("Enter how many lines pattern you wanna create");
                int inputnum = sc.nextInt();

                char cha = 'A';

                for(int i=1; i<=inputnum; i++){
                    for(int j=1; j<=i; j++){
                        System.out.print(cha);
                        cha++;
                    }
                    System.out.println();
                }
        }
        }
    }
