package ARRAY;

// arrays: list of elements of the same type placed in a contiguous manner

//arrays creation : datatype arrayname[] = new datatype [size];
//                  int marks[] = new int[40];
//                  int numbers[] = {1,2,3};
//length of an array = (nameofarray.length);
//we pass arrays into function as an original value ie call by reference*


// import java.util.Scanner;
// public class Array {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
        
//         int marks[] = new int[100];

//         marks[0] = sc.nextInt();   //taking input in arrays(in 0th index)
//         marks[1] = sc.nextInt();
//         marks[2] = sc.nextInt();
//         marks[3] = sc.nextInt();

//         System.out.println("phy : "+marks[0]);     //output in arrays
//         System.out.println("chem : "+marks[1]);
//         System.out.println("maths : "+marks[2]);
//         System.out.println("english : "+marks[3]);

//         marks[0] = 100;    //we can update the value which we stored before
//         System.out.println(marks[0]);

//         int percentage = (marks[0]+marks[1]+marks[2]+marks[4])/4;
//         System.out.println("percentage"+percentage+"%");

//     }
    
// }



//call by reference
// public class Array{
//     public static void update(int marks[]){

//         for(int i=0; i<=marks.length; i++){
//             marks[i] = marks[i] + 1;
//         }
//     }
//     public static void main(String args[]){
//         int marks[] = {97,98,99,98};

//         update(marks);

//         for(int i=0; i<=marks.length; i++){
//             System.out.println(marks[i]);
//         }
//     }
// }



//linear search
// public class Array{
//     public static int linearSearch(int num[], int key){
//         for(int i=1; i<=num.length; i++){
//             if(num[i]==key){
//                 return i;
//             }
//         }
//         return -1;

//     }
//     public static void main(String args[]){
//         int num[] = {12,10,16,23};

//         int key = 16;

//         int result = linearSearch(num, key);

//         if(result==-1){
//             System.out.print("NOT FOUND");
//         }
//         else{
//             System.out.print("the index number is "+result);
//         }
//     }
// }



// public class Array{
//     public static int linearSearch(String orderList[],  String key){

//         for(int i=1; i<=orderList.length; i++){
//             if(orderList[i]==key){
//                 return i;
//             }
//         }
//         return -1;

//     }
//     public static void main(String args[]){

//         String orderList[] = {"samosa","dosa","salad","maggie","vadapav"};
//         String key = "maggie";

//         int result = linearSearch(orderList, key);

//         if(result == -1){
//             System.out.println("NOT FOUND");
//         }
//         else{
//             System.out.println("Index number of "+key+" is "+result);
//         }

//     }
// }



//Largest in array
// import java.util.*;
// public class Array{
//     public static int Largest(int Numbers[]){
//         int MaxValue = Integer.MIN_VALUE;     //minus infinty  

//         for(int i=0; i<=Numbers.length; i++){
//             if(MaxValue>Numbers[i]){
//                 continue;
//             }
//             else{
//                 MaxValue = Numbers[i];
//             }
//         }
//         return MaxValue;

//     }
//     public static void main(String args[]){

//         int Numbers[] = {45,34,54,65,90};

//         int LargestNum = Largest(Numbers);
//         System.out.println("The largest number is "+LargestNum);

//     }
// }




//Smallest in array

// public class Array{
//     public static int Smallest(int Numbers[]){

//         int MinValue = Integer.MAX_VALUE;  //infinty number

//         for(int i=0; i<Numbers.length; i++){
//             if(MinValue>Numbers[i]){
//                 MinValue = Numbers[i];
//             }
//         }
//         return MinValue;
//     }
//     public static void main(String args[]){

//         int Numbers[] = {1,3,5,2,4};

//         System.out.print("The minimum value is "+Smallest(Numbers));

//     }
// }



//BINARY SEARCH IN ARRAY
public class Array{
    public static int BinarySearch(int Numbers[], int key){

        int start = 0; 
        int end = Numbers.length-1;

        while(start<=end){
            int mid = (start + end)/2;
            
            if(Numbers[mid] == key){
                return mid;
            }
            else if(Numbers[mid] < key){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;

    }
    public static void main(String args[]){

        int Numbers[] = {1,2,3,4,5};
        int key = 2;

        int result = BinarySearch(Numbers, key);

        if(result == -1){
            System.out.println("SORRY NOT FOUND");
        }
        else{
            System.out.println("The index number of key is "+result);
        }
    }
}



