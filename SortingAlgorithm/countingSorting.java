public class countingSorting{

    public static void countingSort(int numbers[]){
        int max = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            max = Math.max(max, numbers[i]);
        }

        int freq[] = new int[max+1];

        for(int i=0; i<freq.length; i++){
            int count = 0;

            for(int j=0; j<numbers.length; j++){
                if(numbers[j]==i){
                    freq[i]= count++;
                }
            }

        }
        for(int i=0; i<freq.length; i++){

            for(int j=0; j<numbers.length; j++){
                if(freq[i]>0){
                    numbers[j] = i;
                    freq[i]--;
                }
            }
        }

    }

    public static void main(String args[]){

        int numbers[] = {4,9,1,3,1,4};
    }

}