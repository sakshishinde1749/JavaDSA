package Patterns;

//HOLLOW RECTANGLE
public class advpattern{
    public static void Hollow_Rectangle(int row, int col){
        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){

                if(i==1 || i==row || j==1 || j==col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }



//INVERTED AND ROTATED HALF PYRAMID
//My method (just for 4 by 4 pyramid)
    public static void halfPyramid(int row, int col) {

        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){

                if(i==row || i+j==5 || i+j==6 || j==col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }


      
//vdo method (general)
    public static void HalfPyramid(int n){

        for(int i=1; i<=n; i++){

            for(int j=1; j<=n-i; j++){      //for space
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");   //for stars
            }
            System.out.println();
        }
    }
    

        
//inverted half pyramid with numbers
    public static void inverted_halfpyramid_withNumbers(int n){

        for(int i=1; i<=n; i++){

            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");      //for numbers

            }
            System.out.println();
        }
    }



//FLOYD'S TRIANGLE
    public static void floydsTriangle(int n){
        int num = 1;

        for(int i=1; i<=n; i++){

            for(int j=1; j<=i; j++){
                System.out.print(num+" ");
                num++;
            }
            
            System.out.println();
        }

    }
   


//0-1 triangle
    public static void Triangle_0_1(int n){

        for(int i=1; i<=n; i++){
            
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }



//butterfly structure
    public static void butterflyPattern(int n){


        for(int i=1; i<=n; i++){

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n; i>=1; i--){

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    


//SOLID TILTED RHOMBUS
    public static void SolidRhombus(int n){

        for(int i=1; i<=n; i++){

            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    


//tilted hollow rhombus
    public static void Hollow_TiltedRhombus(int n){

        for(int i=1; i<=n; i++){

            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }



//diamond pattern
    public static void DiamondPattern(int n){

        for(int i=1; i<=n; i++){

            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){

            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }



//half diamond pattern with numbers
    public static void HalfDiamond_Num(int n){

        for(int i=1; i<=n; i++){

            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }



//palindromic pattern
    public static void PalindromicPattern(int n){

        for(int i=1; i<=n; i++){

            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }


    
public static void main(String args[]){
    
    Hollow_Rectangle(4,5);  
    halfPyramid(4,4);
    HalfPyramid(5);
    inverted_halfpyramid_withNumbers(5);
    floydsTriangle(5);
    Triangle_0_1(5);
    butterflyPattern(4);
    SolidRhombus(5);
    Hollow_TiltedRhombus(5);
    DiamondPattern(4);
    HalfDiamond_Num(5);
    PalindromicPattern(5);
}
}




