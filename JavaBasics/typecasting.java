/*typecasting (narrowing or explicit):if we want to store any big data into small data forcefully then we use this method
 * int marks=(int)99.99f
 * by using this method our data get lost
 * 
 * type promotion in expression:1)while calculating expresion java converts all byte, short,char operands into int 
 *                              2)if one operand is long,float or double then the final expression value will get convert to that data type which have large value
 * 
 * java is a portable language but c++ not
 */


 import java.util.*;
public class typecasting{
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            //float to int
            float a=56.98f;
            int   b=(int)a;
            System.out.println(b);


            //char to int
            char ch='a';
            int  n1=(int)ch;
            System.out.println(n1);


            // float to int
            int c= (int)sc.nextFloat();
            System.out.println(c);


            //char to int
            int d=(int)sc.next().charAt(2);
            System.out.println(d);
        }

        //typecasting concept

        //type promotion concept
        /* 1.java automatically promotes each byte, short, or char operands to int when evaluating expression
           2.If one operand is long, float or double the whole expression is promoted to long, float or double resp.
        */
        int num=2;
        char cha='a';

        System.out.println(cha-num);
        System.out.println(cha+num);

        int product=cha*num;
        System.out.println(product);


        double p=2.4;
        long   q=20943;
        float  r=23.4f;
        double s=p+q+r;     //here value of a,b and c get converted to double value

        System.out.println(s);

    }
}

