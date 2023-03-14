//sorting an array in descending order


public class Sorting {

    //Q.1 bubble sort
    public static void bubbleSort(int numbers[]){

        for(int i=0; i<=numbers.length-2; i++){

            for(int j=0; j<=numbers.length-i-2; j++){

                if(numbers[j]<numbers[j+1]){
                    int temp = numbers[j+1];
                    numbers[j+1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }



    //selection sort
    public static void selectionSort(int numbers[]){
        int max = Integer.MIN_VALUE;
        int index = 0;

        for(int i=0; i<numbers.length-1; i++){
            //finding max num index
            for(int j=i; j<numbers.length; j++){

                if(numbers[j]>max){
                    index = j;
                }
            }

            //swap 
            int temp = numbers[index];
            numbers[index] = numbers[i];
            numbers[i] = temp;

            max = Integer.MIN_VALUE;

        }
    }



    //insertoin sort
    public static void insertoinSort(int numbers[]){
        int max = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            
        }
    }







    public static void main(String args[]){
        int numbers[] = {3,6,2,1,8,7,4,5,3,1};

        //bubbleSort(numbers);
        selectionSort(numbers);

        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
    
}
