public class advanced2 {

    //count set bits in number
    //my method
    public static void countSetBit_1(int n){
         
        int count = 0;
        int i = 0;

        while(n>0){
            int bitMask = (1<<i);
            
            if((n & bitMask) == 1){
                count++;
                
                int newBitMask = (~0<<i);
                n = (n & newBitMask);

                i++;
            }
            else{
                i++;
            }
        }
        System.out.println(count);
    }



    //mam method
    public static int countSetBit_2(int n){

        int count = 0;

        while(n>0){
            if((n & 1) == 1){
                count++;
                n = n>>1;
            }
        }
        return count;
    }



    //fast exponential
    public static void fastExpo(int a, int m){
        while(n>0){
            if((n & 1) == 1)
        }

    }

    public static void main(String args[]){

        int n = 10;
        int a = 5;
        int m = 5;

        //countSetBit_1(n);
        System.out.println(countSetBit_2(n));

    }
    
}
