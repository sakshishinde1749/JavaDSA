import java.util.Arrays;

public class strings {

    //Q1 lowercase vowel counting
    public static void lowercaseVowel(String userInput){
        int count = 0;

        for(int i=0; i<userInput.length(); i++){
             if(userInput.charAt(i)=='a' || userInput.charAt(i)=='e' || userInput.charAt(i)=='i' || userInput.charAt(i)=='o' || userInput.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println("number of vowels are"+" "+ count);
    }



    //Q4 to check anagramOrNot (two string having same letter ,they can be shuffled)
    public static void anagramOrNot(String str1, String str2){
    
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str2.length()){

            //converting string into array
            char[] str1CharArray = str1.toCharArray();
            char[] str2CharArray = str2.toCharArray();
        
            //sorting array
            Arrays.sort(str1CharArray);
            Arrays.sort(str2CharArray);

            boolean result = Arrays.equals(str1CharArray, str2CharArray);
            if(result){
                System.out.println("strings are anagram of each other");
            }
            else{
                System.out.println("strings are not anagram of each other");
            }
        }
        else{
            System.out.println("strings are not anagram of each other");
        }


    }

    

    public static void main(String args[]){
        String userInput = "apple";
        String str1 = "care";
        String str2 = "race";


        lowercaseVowel(userInput);
        anagramOrNot(str1, str2);

        //Q2 see the output of the following
        String str3 = "sakshi";
        String str4 = "shinde";
        String str5 = "sakshi";
        System.out.println(str1.equals(str2)+ " " + str1.equals(str3));

        //Q3 see the output of the following
        String str="ApnaCollege".replace("l","");
        System.out.println(str);


    }
}