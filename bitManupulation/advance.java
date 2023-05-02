public class advance {
    
    //clear lasts i bits
    public static int clearLast_ithBit(int n, int i){
        int bitMask_0 = ~1;
        n = (n & bitMask_0);
        
       // my method
        for(int j=1; j<=i; j++){

            int bitMask = ~(1<<j);
            n = (n & bitMask);
        }
        return n;

        //mam method
        // int bitMask = ((~0)<<i);
        // return (n & bitMask);
        
    }



    //clear range of bits
    public static int clearInRange(int n, int i, int j){
        
        //my method
        // for(int k=i; k<=j; k++){

        //     int bitMask = ~(1<<k);
        //     n = (n & bitMask);
        // }
        // return n;

        //mam method
        int a = ((~0)<<(j+1));
        int b = ((1<<i)-1);

        int bitMask = (a | b);
        
        return (n & bitMask);

    }



    //checking number is a power of 2 or not
    public static boolean isPowerOfTwo(int n){
        // boolean result = true;

        // if((n & (n-1)) == 0){
        //     return result;
        // }
        // else{
        //     return (!result);
        // }

        //easy way to write
        return ((n & (n-1)) == 0);

    }

    public static void main(String args[]){
        int n = 8;
        int i = 2;
        int j = 4;

        //System.out.println(clearLast_ithBit(n, i));
        //System.out.println(clearInRange(n, i, j));
        System.out.println(isPowerOfTwo(n));


    }
}
