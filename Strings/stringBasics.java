package Strings;

import java.util.Scanner;
public class stringBasics {

    //printing all letters of string
    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
    }


    public static void main(String args[]){
        String str = "sakshi";
        String strr = new String("abc");    //second String syntax

        //Strings are immuatable that means value of string never changes

        //input output 
        Scanner sc = new Scanner(System.in);
        String name = sc.next();     //takes single word as input
        System.out.print(name+" ");

        sc.nextLine();
        String sentance = sc.nextLine();
        System.out.println(sentance);   //takes multiple word as input

        //string length 
        System.out.println(strr.length());

        //concatenate 
        String firstName = "sakshi";
        String lastName = "shinde";
        String fullname = firstName+" "+lastName;    //adds two strings
        System.out.println(fullname);

        printLetters(str);


    }
}
