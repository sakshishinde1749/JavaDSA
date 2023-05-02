public class moderate {
    
    //odd or even
    public static void oddEven(int n){
        int bitMask = 1;
        if((n & 1) == 0){
            
            System.out.println("numbers is even");     //if LSB of number is one then num is odd otherwise it is even
        }
        else{
            System.out.println("number is odd");
        }
    }



    //get ith bit
    public static void get_ithBit(int n, int i){
        int bitMask = 1<<i;

        if((n & bitMask) == 0){
            System.out.println("our number is 0");
        }
        else{
            System.out.println("our number is 1");
        }
    }



    //set ith bit to one
    public static int set_ithBit(int n,int i){
        int bitMask = 1<<i;

        return (n | bitMask);
    }



    //clear ith bit
    //my method
    public static int clear_ithBit1(int n, int i){

        int bitMask = (1<<i);

        int result = (n | bitMask);
        return (result^bitMask);
    }

    //ma'am method
    public static int clear_ithBit2(int n, int i){
        int bitMask = ~(1<<i);

        return (n & bitMask);
    }



    //update ith bit
    public static int update_ithBit(int n, int i, int updateBit){
        int bitMask_0 = ~(1<<i);
        int bitMask_1 = (1<<i);

        // if(updateBit == 1){
        //     return (n | bitMask_1);
        // }
        // else{
        //     return (n & bitMask_0);
        // }

        //2nd method
        n = clear_ithBit2(n, bitMask_1);
        return ((n | (updateBit<<i)));
        
    }


    public static void main(String args[]){

        int n = 10;
        int i = 2;
        int updateBit = 1;

        // oddEven(n);
        // get_ithBit(n, i);
        // System.out.println(set_ithBit(n, i));
        // System.out.println(clear_ithBit1(n, i));
        // System.out.println(clear_ithBit2(n, i));
        System.out.println(update_ithBit(n, i, updateBit));

        

    }
}
