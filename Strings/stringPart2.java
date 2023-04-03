package Strings;

public class stringPart2 {

    //palindrome
    public static void palindromeOrNot(String word){

        int j = word.length()-1; int i;

        for(i=0; i<=(word.length())/2; i++){

            if(word.charAt(i)==word.charAt(j)){
                j--;
            }
            else{
                break;
            }
        }
        if(i==(word.length())/2+1){
            System.out.println("it is palindrome");
        }
        else{
            System.out.println("it is not a palindrome");
        }
    }



    //shortest path
    public static void shortestPath(String path){
        int x = 0;
        int y = 0;

        for(int i=0; i<path.length(); i++){
            if(path.charAt(i) == 'E'){
                x++;
            }
            else if(path.charAt(i) == 'W'){
                x--;
            }
            else if(path.charAt(i) == 'N'){
                y++;
            }
            else{
                y--;
            }
        }

        double shortPath = Math.sqrt((x*x + y*y));
        System.out.println(shortPath);

    }



    //printing substring
    public static String printSubstrings(String word, int si, int ei){
        String substring = " ";

        for(int i=si; i<ei; i++){
            substring += word.charAt(i);
        }
        return substring;
    }
    





    public static void main(String args[]){

        String word = "sakshi";
        String path = "WNEENESENNN";
        int si = 0;
        int ei = 5;

        //palindromeOrNot(word);

        //shortestPath(path);

        String substring = printSubstrings(word, si, ei);
        System.out.println(substring);
        System.out.println(word.substring(si,ei));    //inbuilt function to print substring


        //comparing strings are equal or 
        //whenever you want to compare any string with other string use below function
        String s1 = "tony";
        String s2 = "tony";
        String s3 = new String("tony");

        if(s1 == s2){
            System.out.println("strings are equal");
        }
        else{
            System.out.println("strings are not equal");
        }

        if(s1 == s3){
            System.out.println("strings are equal");
        }
        else{
            System.out.println("strings are not equal");
        }

        if(s1.equals(s3)){
            System.out.println("strings are equal");
        }
        else{
            System.out.println("strings are not equal");
        }
    }
    
}
