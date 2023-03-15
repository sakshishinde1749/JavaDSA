public class Array2DAssign {

    //Q.1 printing number of 7's in array
    public static void countNum(int array[][],int key){
        int count = 0;

        for(int i=0; i<array.length; i++){

            for(int j=0; j<array[0].length; j++){

                if(array[i][j] == key)
                count++;
            }
        }
        System.out.println(count);
    }



    //Q.2 print 2nd row sum
    public static void secondRowSum(int nums[][]){

        int rowIndx = 1;
        int sum = 0;

        for(int j=0; j<nums[0].length; j++){
            sum += nums[rowIndx][j];
        }
        System.out.println(sum);
    }



    //Q.3 transpose
    public static void transpose(int nums[][]){

        int i = 0;
        int j = 1;

        while(i<j && i<=nums.length-1 && j<=nums[0].length-1){

            //swap
            int temp = nums[i][j];
            nums[i][j] = nums[j][i];
            nums[j][i] = temp;

            if(j==nums[0].length-1){
                i++;
                j = i + 1;
            }
            else{
                j++;
            }

        }
    }


















    public static void main(String args[]){

        int array[][] = {{4,7,8,7},{8,8,7,7}};
        int key = 7;
        int nums[][] = {{1,4,9},{11,4,3},{2,2,3}};

       // countNum(array,key);
        //secondRowSum(nums);
        transpose(nums);
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[0].length; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
