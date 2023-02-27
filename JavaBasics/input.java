import java.util.Scanner;

/*Inputs: next (for single word)
 *        nextLine(for sentence)
 *        nextInt
 *        nextFloat
 *        nextLong
 *        nextDouble
 *        nextBoolean
 *        nextByte
 *        nextShort
 *        for char=sc.next().charAt(0)
 */



// import java.util.Scanner;
// public class input{
//     public static void main(String args[]){
//        Scanner sc=new Scanner(System.in);
//        String name=sc.next();
//        System.out.println(name);  
//        String sen=sc.nextLine();
//        System.out.println(sen);
//        int a=sc.nextInt();
//        System.out.println(a);
//        boolean var=sc.hasNextInt();
//        System.out.println(var);
//          float b=sc.nextFloat();
//          System.out.println(b);
//     }
// }



//sum of int a and b (taking inputs from user)
// import java.util.Scanner;
// public class input{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter first number");
//         int n1=sc.nextInt();
//         System.out.println("enter second number");
//         int n2=sc.nextInt();
//         int sum=n1+n2;
//         System.out.print("The sum of these numbers is ");
//         System.out.println(sum);
//     }
// }

//sum of float a and b (taking inputs from user )
// import java.util.Scanner;
// public class input{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("entre 1st no.");
//         Float n1=sc.nextFloat();
//         System.out.println("entre 2nd no.");
//         Float n2=sc.nextFloat();
//         System.out.print("The sum of these no.is ");
//         Float sum=n1+n2;
//         System.out.println(sum);

//     }
// }

//Product of a and b(taking inputs from user)
// import java.util.Scanner;
// public class input{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("entre first number");
//         int n1=sc.nextInt();
//         System.out.println("enter second number");
//         int n2=sc.nextInt();
//         System.out.print("the product of these numbers is ");
//         int product=n1*n2;
//         System.out.println(product);
//     }
// }

public class input{
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("entre radius");
            int r=sc.nextInt();
            double area=3.14*r*r;
            System.out.print("the area of circle is ");
            System.out.println(area);
        }
        
    }
}