package Patterns;

// import java.util.Scanner;
// public class advpattern{
//     public static void Hollow_Rectangle(int row, int col){
//         for(int i=1; i<=row; i++){
//             for(int j=1; j<=col; j++){

//                 if(i==1 || i==row || j==1 || j==col){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }

//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter number of rows");
//         int totalRows = sc.nextInt();

//         System.out.println("Enter number of columns");
//         int totalCol = sc.nextInt();

//         Hollow_Rectangle(totalRows, totalCol);

//     }
// }



//INVERTED AND ROTATED HALF PYRAMID
//My method (just for 4 by 4 pyramid)
// public class advpattern{
//     public static void HalfPyramid(int row, int col) {

//         for(int i=1; i<=row; i++){
//             for(int j=1; j<=col; j++){

//                 if(i==row || i+j==5 || i+j==6 || j==col){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }

//     }
//     public static void main(String args[]){

//         HalfPyramid(4,4);
//     }
// }

//vdo method (general)
// import java.util.Scanner;
// public class advpattern{
//     public static void HalfPyramid(int n){

//         for(int i=1; i<=n; i++){

//             for(int j=1; j<=n-i; j++){      //for space
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");   //for stars
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter number of rows");
//         int n = sc.nextInt();

//         HalfPyramid(n);


//     } 
// }



//inverted half pyramid with numbers
// import java.util.Scanner;
// public class advpattern{
//     public static void inverted_halfpyramid_withNumbers(int n){

//         for(int i=1; i<=n; i++){

//             for(int j=1; j<=n-i+1; j++){
//                 System.out.print(j+" ");      //for numbers

//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter number of rows");
//         int n = sc.nextInt();

//         inverted_halfpyramid_withNumbers(n);
//     }
// }



//FLOYD'S TRIANGLE
// import java.util.Scanner;
// public class advpattern{
//     public static void floydsTriangle(int n){
//         int num = 1;

//         for(int i=1; i<=n; i++){

//             for(int j=1; j<=i; j++){
//                 System.out.print(num+" ");
//                 num++;
//             }
            
//             System.out.println();
//         }

//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter a number of rows");
//         int n = sc.nextInt();

//         floydsTriangle(n);
//     }

// }



//0-1 triangle
// public class advpattern{
//     public static void Triangle_0_1(int n){

//         for(int i=1; i<=n; i++){
            
//             for(int j=1; j<=i; j++){
//                 if((i+j)%2==0){
//                     System.out.print("1");
//                 }
//                 else{
//                     System.out.print("0");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         Triangle_0_1(5);
//     }
// }



//butterfly structure
// public class advpattern{
//     public static void butterflyPattern(int n){


//         for(int i=1; i<=n; i++){

//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             for(int j=1; j<=2*(n-i); j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         for(int i=n; i>=1; i--){

//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             for(int j=1; j<=2*(n-i); j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         butterflyPattern(4);
//     }
// }


// public class advpattern{
//     public static void butterflyPattern(int n){

//         for(int i=1; i<=n; i++){

//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             for(int j=1; j<=2*(n-i); j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         for(int i=n; i>=1; i--){

//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             for(int j=1; j<=2*(n-i); j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         butterflyPattern(4);
//     }
// }


//SOLID RHOMBUS
// public class advpattern{
//     public static void SolidRhombus(int n){

//         for(int i=1; i<=n; i++){

//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=n; j++){
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         SolidRhombus(5);
//     }
// }



//tilted hollow rhombus
// public class advpattern{
//     public static void Hollow_TiltedRhombus(int n){

//         for(int i=1; i<=n; i++){

//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }

//             for(int j=1; j<=n; j++){
//                 if(i==1 || i==n || j==1 || j==n){
//                     System.out.print("*"+" ");
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         Hollow_TiltedRhombus(5);
//     }
// }



//diamond pattern
// public class advpattern{
//     public static void DiamondPattern(int n){

//         for(int i=1; i<=n; i++){

//             for(int j=1; j<=n-i; j++){
//                 System.out.print("  ");
//             }
//             for(int j=1; j<=2*i-1; j++){
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//         }
//         for(int i=n; i>=1; i--){

//             for(int j=1; j<=n-i; j++){
//                 System.out.print("  ");
//             }
//             for(int j=1; j<=2*i-1; j++){
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         DiamondPattern(4);
//     }
// }



//half diamond pattern with numbers
// public class advpattern{
//     public static void HalfDiamond_Num(int n){

//         for(int i=1; i<=n; i++){

//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print(i+" ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         HalfDiamond_Num(5);
//     }
// }



//palindromic pattern
public class advpattern{
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
        PalindromicPattern(5);
    }
}