package Array2D;

public class Array2D_advanced {

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

        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
        int primarySum = 0;
        int secondarySum = 0;
        
        for(int i=startCol; i<=endCol; i++){
            primarySum += matrix[startRow][startCol];
            startRow++; startCol++;
        }
        System.out.println(primarySum);

        if((endCol+1)%2==0){
            for(int j=startCol; j<=endCol; j++){
                secondarySum += matrix[startRow][endCol];
                startRow++; endCol--;
            }
        }
        else{
            for(int j=startCol; j<=endCol; j++){
                secondarySum += matrix[startRow][endCol];
                startRow++; endCol--;
            }
            secondarySum = secondarySum - matrix[endRow/2][endCol/2];
        }
        System.out.println(secondarySum);

        int diagonalsum = primarySum + secondarySum;
        System.out.println(diagonalsum);

    }




    public static void main(String args[]){

        int matrix[][] =  {{1,2,3,4,5},
                           {16,17,18,19,6},
                           {15,24,25,20,7},
                           {14,23,22,21,8},
                           {13,12,11,10,9}};

        //spiralMatrix_1(matrix);
        //spiralMatrix_2(matrix);
        diagonalSum(matrix);
    }
}
