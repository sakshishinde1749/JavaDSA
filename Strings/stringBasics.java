package Strings;

import java.util.Scanner;
public class stringBasics {
    public static void main(String args[]){
        String str = "sakshi";
        String strr = new String("abc");    //second String syntax

        //Strings are immuatable that means value of string never changes

        //input output 
        Scanner sc = new Scanner(System.in);
        String name = sc.next();     //takes single word as input
        System.out.println(name);

        String sentance = sc.nextLine();
        System.out.println(sentance);   //takes multiple word as input

    }
}
