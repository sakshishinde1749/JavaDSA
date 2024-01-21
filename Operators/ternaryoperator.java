package Operators;

/*ternary operator: varibale = condition? statement1: statement2 */

public class ternaryoperator{
    public static void main(String args[]){
        int a = 4;

        String result = (a%2==0)? "even": "odd";
        System.out.println(result);

        int b = 23;
        int c = 12;

        int largeNum = (b>c)? b:c;
        System.out.println(largeNum);



        //student will pass or fail
        int marks = 98;

        String finalresult = (marks > 33)? "Pass" : "fail" ;
        System.out.println(finalresult);
        
    }
}
