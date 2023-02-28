

/*data type conversion(widening or implicit) : we can convert one data to the other data type
 * 
 * condition: type compatible
 *            destination type>source type
 * 
 * byte->short->int->float->long->double
 */



import java.util.Scanner;
public class typeconversion{
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            float a=sc.nextInt();       //we are saving int data type into float data type
            System.out.println(a);

            float b=sc.nextLong();
            System.out.println(b);

            double c=sc.nextLong();
            System.out.println(c);

            float d=sc.nextShort();
            System.out.println(d);
        }
    }
}
    
