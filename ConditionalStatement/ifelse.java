package ConditionalStatement;



public class ifelse {
    public static void main(String args[]) {
        //age
        int age = 19;

        if(age>=18){
            System.out.println("adult:drive,vote");
        }
        else if(age>13 && age<18){
            System.out.println("teenager");
        }
        else{
            System.out.println("not adult");
                
        }
        

        //largest of 2 numbers
        int n1 = 10;

        int n2 = 11;

        System.out.print("The largest of these numbers is ");
        if(n1>n2){
            System.out.println(n1);
        }
        else{
            System.out.println(n2);
        }



        //print if num is odd or even
        System.out.println("Enter a number to check whether number is odd or even");

        int num = 7;
        if((num % 2) == 0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }



        //income tax calculator
        System.out.println("entre annual amount");
        int amount = 700000;

        int tax1 = 0;
        float tax2 = 0.2f*amount;
        float tax3 = 0.3f*amount;

        System.out.print("Tax amount is ");

        if(amount<500000){
            System.out.println(tax1);
        }
        else if(amount>500000 && amount<1000000){
            System.out.println(tax2);
        }
        else{
            System.out.println(tax3);
        }



        //largest of 3 numbers
        int a = 100;
        int b =  20;
        int c = 25;

        if(a > b){
            if(a > c){
                System.out.println("Largest number is " + a);
            }
        }
        else if(b > c){
            System.out.println("Largest number is " + b);
        }
        else{
            System.out.println("Largest number is " + c);
        }

    }
}   
