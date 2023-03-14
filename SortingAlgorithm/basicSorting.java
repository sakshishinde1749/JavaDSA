package SortingAlgorithm;

// What is sorting?
//sorting is arranging data into meaningful order/sequence
// for example arranging array into ascending or descending order

import java.util.Arrays;
import java.util.Collections;
public class basicSorting{

    //bubble Sorting
    public static void bubbleSort(int numbers[]){

        for(int i=0; i<=numbers.length-2; i++){

            for(int j=0; j<=numbers.length-i-2; j++){

                //swap
                if(numbers[j]>numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }   

            }
        }
    }



    //selection sorting
    public static void selectionSort(int numbers[]){
        int minimum = Integer.MAX_VALUE;
        int index = 0;

        for(int i=0; i<=numbers.length-2; i++){

            for(int j=i; j<=numbers.length-1; j++){
                if(numbers[j]<minimum){
                    index = j;
                }
            }

            //swap
            int temp = numbers[index];
            numbers[index] = numbers[i];
            numbers[i] = temp;

            minimum = Integer.MAX_VALUE;

        }
    }



    //insertion sorting (pick an element from unsorted part and place it in right postion of sorted array)
    //my method:)
    public static void insertionSort_1(int numbers[]){

        for(int i=1; i<numbers.length; i++){

            for(int j=i-1; j>=0; j--){

                if(numbers[i]<numbers[j]){

                    //swap
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                    i--;
                    // nice babe
                }
            }
        }

    }



    //mam's method (perfect insertion method)
    public static void insertionSort_2(int numbers[]){

        for(int i=1; i<numbers.length; i++){
            int curr = numbers[i];
            int previous = i-1;

            while(previous>=0 && numbers[previous]>curr){
                numbers[previous+1] = numbers[previous];
                previous--;
            }
            numbers[previous+1] = curr;

        }
    }



    //inbuilt Sorting

    

    public static void main(String args[]){

        int numbers[] = {5,8,1,3,2};
        Integer Numbers[] = {3,8,9,4,1};

        //bubbleSort(numbers);
        //selectionSort(numbers);
        //insertionSort_1(numbers);
        //Arrays.sort(numbers);
        //Arrays.sort(numbers,0,3);  //ending index is non inclusive
                                     //it will sort numbers till index 2
        //Arrays.sort(Numbers,Collections.reverseOrder());
        Arrays.sort(Numbers,0,3,Collections.reverseOrder());

        for(int i=0; i<Numbers.length; i++){
            System.out.print(Numbers[i] +" ");
        }
        System.out.println();





    }
}
