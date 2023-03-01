public class Array{
    public static void distinctOrNot(int numbers[]){
        int i = 1;

        for( i=0; i<numbers.length; i++){

            for(int j=i+1; j<numbers.length; j++){

                if(numbers[i] == numbers[j]){
                    System.out.print("True");
                    break;
                }
            }
        }if(i==numbers.length+1){
            System.out.print("False");
        }
    }
    public static void main(String args[]){

        int numbers[] = {1,2,3,4};

        distinctOrNot(numbers);


    }
}