package Operators;
/*ternary operator: varibale = condition? statement1: statement2 */

// public class ternaryoperator{
//     public static void main(String args[]){
//         // int a = 4;

//         // String result = (a%2==0)? "even": "odd";
//         // System.out.println(result);

//         // int b = 23;
//         // int c = 12;

//         // int largenum = (b>c)? b:c;
//         // System.out.println(largenum);

//     }
// }



//student will pass or fail
import java.util.Scanner;
public class ternaryoperator{
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("entre your marks");
            int marks = sc.nextInt();

            String result = (marks>33)? "pass":"fail";
            System.out.println(result);
        }


        
    }
}