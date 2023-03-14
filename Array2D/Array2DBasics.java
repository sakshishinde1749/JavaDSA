package Array2D;

import java.util.Scanner;


public class Array2DBasics{

    //finding key
    public static boolean search(int matrix[][],int key){

        for(int i=0; i<matrix.length; i++){

            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("key found at "+"("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("key did not found");
        return false;

    }



    // find largest
    public static void largestNum(int matrix[][]){
        int max = Integer.MIN_VALUE;

        for(int i=0; i<matrix.length; i++){

            for(int j=0; j<matrix[0].length; j++){

                max = Math.max(max, matrix[i][j]);
            }
        }
        System.out.println(max);
    }


    //In 1D array data gets stored in contiguous block of memory where each element in the array is stored one after the other.
    //In 2D array : row major, coloumn major



    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //creating 2D matrix
        int matrix[][] = new int [3][3];
        int key = 4;
        int n = matrix.length; int m = matrix[0].length;

        //input
        for(int i=0; i<n; i++){

            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }

        }
        System.out.println();

        //output
        for(int i=0; i<n; i++){

            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();

        }


        search(matrix, key);
    }
}