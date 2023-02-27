package Operators;
/*operators : 1.arithematic(binary/unary)      parathesis means "()"
*             2.relational
*             3.logical
*             4.bitwise
*             5.assignment

    sum=a+b   here a and b are operands 
*             "+" is operator
 */

/*unary operator: it needs only single operator
 */



public class operators{
    public static void main(String args[]){
        int a=10;
        int b=a++;                 //firstly value of 'a' will get assigned to 'b' then incremented
        System.out.println(a);
        System.out.println(b);

        int c=10;
        int d=++c;                 //firstly value of 'c' will get incremented then it gets assigned to 'd'
        System.out.println(c);
        System.out.println(d);

        int y=7;
        int x=y++*8;
        System.out.println(x);


    }
}