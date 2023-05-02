package bitManupulation;
//decimal to binary
//0 = 000   1 = 001   2 = 010   3 = 011    4 = 100   
//5 = 101   6 = 110   7 = 111   8 = 1000   9 = 1001

//if first num of binary digit is zero it represents a positive num and viceversa
//rightmost digit of binary is least significant digit(LSB) and leftmost digit of binary is most significant digit(MSB)

//property: In binary number if number is power of 2 then n&(n-1)=0
public class basic {
    
    public static void main(String args[]){

        //binary AND
        System.out.println(5 & 6);     //gives 1 output when we have both input as 1

        //binary OR
        System.out.println(4 | 6);     //gives 0 output when we have both input as 0

        //binary XOR
        System.out.println(5^6);       //different input = 1    same input = 0

        //binary 1's complement
        System.out.println(~5);        //not operator

        //after negation to converting binary to decimal first take 1's complement then add 1 in it(2's complement method)
        //not of 0 is -1


        //binary left shift
        System.out.println(5<<2);       //we remove first two numbers (because we are shifting it by two) and then shift each num to left and put zeros in last places 
        // 5<<2 = a * 2^b


        //binary right shift
        System.out.println(6>>1);       //same like left shift but in this we shift numbers to right
        //6>>1 = a/2^b


    }
    
}
