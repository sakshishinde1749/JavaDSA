package Array2D;

import javax.lang.model.util.ElementScanner14;

public class Array2DAdvanced {

    //spiral matrix
    //my method
    public static void spiralMatrix_1(int matrix[][]){

        int rowFirst = 0;
        int colLast = matrix[0].length-1;
        int rowLast = matrix.length-1;
        int colFirst = 0;

        for(int i=0; i<(matrix.length-1)/2; i++) {

            //top
            for(int k=i; k<matrix.length-1-i; k++){
                System.out.print(matrix[rowFirst][k]+" ");
            }
            //right
            for(int k=i; k<matrix.length-1-i; k++){
                System.out.print(matrix[k][colLast]+" ");
            }
            //bottom
            for(int k=matrix.length-1-i; k>i; k--){
                System.out.print(matrix[rowLast][k]+" ");
            }
            //left
            for(int k=matrix.length-1-i; k>i; k--){
                System.out.print(matrix[k][colFirst]+" ");
            }

            rowFirst++;
            colLast--;
            rowLast--;
            colFirst++;
        }

        if((matrix.length%2) != 0){
            System.out.println(matrix[(matrix.length-1)/2][(matrix.length-1)/2]);
        }

    }



    //mam's method
    public static void spiralMatrix_2(int matrix[][]){

        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startRow<=endRow && startCol<=endCol){

            //top
            for(int j=startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j]+" ");
            }

            //right
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endCol]+" ");
            }

            //bottom
            for(int j=endCol-1; j>=startCol; j--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }

            //left
            for(int i=endRow-1; i>=startRow+1; i++){
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }



    //primary and secondary sum of diagonal
    public static void diagonalSum(int matrix[][]){

        int primarySum = 0;
        int secondarySum = 0;
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        for(int i=startRow; i<=endRow; i++){
            primarySum += matrix[i][startCol];
            startCol++;
        }
        System.out.println(primarySum);

        for(int i=startRow; i<=endRow; i++){
            secondarySum += matrix[i][endCol];
            endCol--;
        }
        endCol = matrix[0].length-1;

        if(matrix.length%2 != 0){
            secondarySum = secondarySum - matrix[(endRow)/2][(endCol)/2];
        }
        System.out.println(secondarySum);

        int totalDiagonalSum = primarySum + secondarySum;
        System.out.println(totalDiagonalSum);

    }



    //key search 
    //brute force method
    public static int[] keySearch_bruteForce(int matrix[][],int key){
        
        int ans[] = new int[2];
        ans[0] = -1; ans[1]=-1;

        for(int i=0; i<=matrix.length-1; i++){
            for(int j=0; j<=matrix[0].length-1; j++){
                if(key == matrix[i][j]){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }



    //row wise binary method
    public static void keySearch_binary(int matrix[][], int key){

        boolean test = false;

        for(int i=0; i<matrix.length; i++){
            int start = 0;
            int end = matrix[i].length - 1;


            while(start<=end){
                int mid = (start + end)/2;

                if(key > matrix[i][mid]){
                    start = mid + 1;
                }
                else if(key < matrix[i][mid]){
                    end = mid - 1;
                }
                else{
                    System.out.println(i + "," + mid);
                    test = true;
                    break;
                }
            }

            if(test){
                break;
            }
        }

        if(!test){
            System.out.println("key not found");
        }
    }




    public static void main(String args[]){

        int matrix[][] =  {{1,2,3,4,5},
                           {16,17,18,19,20},
                           {21,24,25,26,27},
                           {28,29,30,31,32},
                           {33,33,34,36,38}};
        int key = 38;

        //spiralMatrix_1(matrix);
        //spiralMatrix_2(matrix);
        //diagonalSum(matrix);
        //int sol[] = keySearch_bruteForce(matrix, key);
        //if(sol[0] != -1){
        //     System.out.println(sol[0] + "," + sol[1]);
        // }else{
        //     System.out.println("key not found");
        // }

        keySearch_binary(matrix, key);
    }
}
