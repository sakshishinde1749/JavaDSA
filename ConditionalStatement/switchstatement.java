package ConditionalStatement;
/*switch statement: switch (variable){
 *                  case 1:
 *                         break;
 *                  case 2:
 *                         break;
 *                  case 3:
 *                         break;
 *                  default:
*/

// import java.util.Scanner;
// public class switchstatement{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter number");
//         int num = sc.nextInt();

//         switch (num){
//             case 1:System.out.println("sakshishinde");
//                     break;
            
//             case 2:System.out.println("sakshipatil");
//                     break;

//             case 3:System.out.println("vaishnavi");
//                     break;

//             default:System.out.println("BFF:)");
//         }

//     }
// }



//calculator using switch 
import java.util.Scanner;
public class switchstatement{
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter num1");
            int num1 = sc.nextInt();

            System.out.println("enter num2");
            int num2 = sc.nextInt();

            System.out.println("enter operator");
            char operator = sc.next().charAt(0);

            switch(operator){
                case '+':  System.out.println("the addition of 2 numbers is " + (num1+num2));
                            break;

                case '-' : System.out.println("the subtraction of 2 numbers is " +(num1-num2));
                            break;

                case '*' : System.out.println("the multiplication of 2 numbers is " + (num1*num2));
                            break;

                case '/' : System.out.println("the division of 2 numbers is " + (num1/num2));   
                            break;

                case '%' : System.out.println("the modulo of 2 numbers is " + (num1%num2));
                            break;

                default : System.out.println("wrong operator");
            
            }
        }


    }
}