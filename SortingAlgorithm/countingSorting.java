package SortingAlgorithm;
public class countingSorting{

    //this method is used for array in which all numbers are positive and range of array is minimum

    public static void countingSort(int numbers[]){
        int max = Integer.MIN_VALUE;

        //finding max value to form new freq array
        for(int i=0; i<numbers.length; i++){
            max = Math.max(max, numbers[i]);
        }

        int freq[] = new int[max+1];

        //transfering numbers of numbers[] into freq[] in the freq form
       

        for(int i=0; i<numbers.length; i++){
            freq[numbers[i]]++;
        }

        //sorting
        int k=0;
        for(int i=0; i<freq.length; i++){
            
            while(freq[i]>0){
                numbers[k]=i;
                freq[i]--;
                k++;
            }

        }

    }

    public static void main(String args[]){

        int numbers[] = {4,9,1,3,1,4};
    }

}