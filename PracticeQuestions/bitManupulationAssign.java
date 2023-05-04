public class bitManupulationAssign {

    //Q2 swap two numbers without using third variable
    public static void swap(int a, int b){

        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(a+b);
        
    }

    public static void main(String args[]){
        int a = 10;
        int b = 23;

        swap(a, b);
    }
    
}
