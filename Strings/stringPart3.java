package Strings;

public class stringPart3 {

    //largest in strings
    public static void largest(String fruits[]){

        String largest = fruits[0];

        for(int i=1; i<fruits.length; i++){

            if(largest.compareToIgnoreCase(fruits[i])<0){
                /*str1.compareToIgnorecase(str2)    str1.compareTo(str2)
                  if it is >0 then str1>str2        this function consider 'A' and 'a' different but other function not
                           <0 then str1<str2
                           =0 then str1=str2
                */
                
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }



    //word to uppercase
    public static void wordToUppercase(String str){

        StringBuilder sb = new StringBuilder(" ");

        sb.append(Character.toUpperCase(str.charAt(0)));

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' '){
               sb.append(str.charAt(i));
               i++;
               sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
        
    }



    public static void stringCompression(String newString){
        
    }



    public static void main(String args[]){
        String fruits[] = {"mango", "apple", "banana","watermelon"};
        String str = "hello there";
        String newStr = "aaabbbccdddd";

       // largest(fruits);
        wordToUppercase(str);


        //string builders
        StringBuilder sb = new StringBuilder(" ");
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);         //this function adds ch value accordingly without creating new string
        }                          //its time complexity is n ; it reduces from n^2 to n
        System.out.println(sb);
    



    }
}
