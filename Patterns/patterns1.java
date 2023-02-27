package Patterns;
//star pattern

// public class patterns1 {
//     public static void main(String args[]) {

//         for(int i=1; i<=4; i++){
//             for(int j=1; j<=i; j++ ){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
        
//     }
    
// }


//star pattern (taking input from user)
// import java.util.Scanner;
// public class patterns1{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter a number");
//         int n = sc.nextInt();

//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



//INVERTED STAR PATTERN
// import java.util.Scanner;
// public class patterns1{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a number");
//         int n = sc.nextInt();

//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n-i+1; j++ ){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



//PRINT HALF PYRAMID PATTERN
// import java.util.Scanner;
// public class patterns1{
//     public  static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter how many lines pattern u wanna create");
//         int n = sc.nextInt();

//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
        
//     }
// }



//PRINT CHAR PATTERN
import java.util.Scanner;
public class patterns1{
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter how many lines pattern you wanna create");
            int n = sc.nextInt();

            char ch = 'A';

            for(int i=1; i<=n; i++){
                for(int j=1; j<=i; j++){
                    System.out.print(ch);
                    ch++;
                }
                System.out.println();
            }
        }
    }
}