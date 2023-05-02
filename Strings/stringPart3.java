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

        StringBuilder sb = new StringBuilder(" ");      //stringbuilder is a type of datastructure like string but in this we can do changes unlike string we dont need to make a new string
                                                        //stringbuilder dont have string type but to convert it into string we use sb.toString()

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


    //string compression
    public static void stringCompression(String newString){
        StringBuilder sb = new StringBuilder("");
        
        int count = 1;

        for(int i=0; i<newString.length(); i++){

            if(i!=newString.length()-1){
                if(newString.charAt(i) == newString.charAt(i+1)){
                    count++;
                }
            }
            else{
                if(count>1){
                    sb.append(newString.charAt(i));
                    sb.append(count);
                }
                else{
                    sb.append(newString.charAt(i));
                }
                count = 1;
               
            }
        }
        System.out.println(sb);
    }



    public static void main(String args[]){
        String fruits[] = {"mango", "apple", "banana","watermelon"};
        String str = "hello there";
        String newStr = "aabb";

       // largest(fruits);
        //wordToUppercase(str);
        stringCompression(newStr);

        //string builders
        // StringBuilder sb = new StringBuilder(" ");
        // for(char ch='a'; ch<='z'; ch++){
        //     sb.append(ch);         //this function adds ch value accordingly without creating new string
        // }                          //its time complexity is n ; it reduces from n^2 to n
        // System.out.println(sb);
    



    }
}
