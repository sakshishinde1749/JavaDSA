import java.net.ProtocolFamily;

import javax.swing.text.Highlighter.Highlight;

public class ArrayAssign{

    //Q1.numbers in array are distinct or not
    public static boolean distinctOrNot(int numbers[]){
        int i = 1;


        for( i=0; i<numbers.length-1; i++){

            for(int j=i+1; j<numbers.length; j++){

                if(numbers[i] == numbers[j]){
                    return true;
                }
    
            }
        }
        return false;
    }



    //Q.2 finding key in unsorted array by binary search
    public static int unsorted_Binarysearch(int numbers[], int key){
        int ind = 0;
        int maxNum = Integer.MIN_VALUE;
        
       for(int i=0; i<numbers.length; i++){
            
            if(maxNum<numbers[i]){
                maxNum = numbers[i];
                ind = i;
            }

        }

        int start = 0;
        int end = ind;
        int ans = -1;

        for(int i=0; i<=ind; i++){

             int mid = (start+end)/2;

            if(numbers[mid]>key){
                end = mid -1;
            }
            else if(numbers[mid]<key){
                start  = mid+1;
            }
            else{
                return mid;
            }
           
        }
        start = ind+1;
        end = numbers.length-1;

        for(int i=ind+1; i<numbers.length; i++){

            int mid = (start+end)/2;

            if(numbers[mid]>key){
                end = mid -1;
            }
            else if(numbers[mid]<key){
                start  = mid+1;
            }
            else{
                return mid;
            }
        }

        return -1;

    }



    //Q.3 max profit of stock 
    public static void maxProfit_stock(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int profit = 0;
        int maxProfit = Integer.MIN_VALUE;

        for(int i=0; i<prices.length; i++){

            if(buyPrice<prices[i]){
                profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                buyPrice = prices[i];
            }
        }
        System.out.println(maxProfit);
    }



    //Q.4 volume of trapped water
    public static void trappedWater_volume(int height[]){
        int volume = 0; 
        int rightMax = Integer.MIN_VALUE;
        int leftMax = Integer.MIN_VALUE;


        for(int i=1; i<height.length-1; i++){

            for(int j=i+1; j<height.length; j++){
                if(rightMax < height[j]){
                    rightMax = height[j];
                }
            }
            
            for(int j=i-1; j>=0; j--){
                if(height[j] > leftMax){
                    leftMax = height[j];
                }
            }

            int waterLevel = Math.min(leftMax, rightMax);

            volume += (waterLevel - height[i]);

        }
        System.out.println(volume);
    }



    //returning all triplets whose sum is zero
    public static void zeroSum_triplet(int nums[]){

        for(int i=0; i<nums.length-1; i++){

            for(int j=i+1; j<nums.length; j++){

                for(int k=j+1; k<nums.length; k++){

                    if(nums[i]+nums[j]+nums[k]==0){
                        System.out.print("("+nums[i]+","+nums[j]+","+nums[k]+")"+" ");
                    }
                }


            }
        }
    }





    













    public static void main(String args[]){

        int numbers[] = {4,5,6,7,0,1,2};
        int key = 1;
        int prices[] = {7,2,5,9,1,9};
        int height[] = {4,2,0,3,2,5};
        int nums[] = {-1,0,1,2,-1,-4};

        //System.out.println(distinctOrNot(numbers));
        //System.out.println(unsorted_Binarysearch(numbers, key));
        //maxProfit_stock(prices);
        //trappedWater_volume(height);
        zeroSum_triplet(nums);


    }
}