public class Array{
    public static void distinctOrNot(int numbers[]){
        int i = 1;

        for( i=0; i<numbers.length; i++){

            for(int j=i+1; j<numbers.length; j++){

                if(i == numbers[j]){
                    System.out.print("True");
                    break;
                }
            }
        }if(i==numbers.length){
            System.out.print("False");
        }
    }
    public static void main(String args[]){

        int numbers[] = {1,3,5,2,4,1};

        distinctOrNot(numbers[]);
    }
}