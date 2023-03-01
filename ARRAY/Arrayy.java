package ARRAY;
//reverse a number in array
public class Arrayy {
    public static void Reverse(int Numbers[]){

        int start = 0;
        int end = Numbers.length - 1;

        while(start<end){
            int temp = Numbers[start];     //this will swap numbers
            Numbers[start] = Numbers[end];
            Numbers[end] = temp;

            start++;
            end--;
        }
    }

        

    //Pairs in an array
    public static void Pairs(int Numbers[]){
        int totalPairs = 0;

        for(int i=0; i<Numbers.length; i++){

            for(int j=i+1; j<Numbers.length; j++){
                System.out.print("("+ Numbers[i] +","+ Numbers[j] +")");

                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("The total pairs are "+totalPairs);

    }
   


    //print Subarrays 
    public static void Subarrays(int Numbers[]){
        int count = 0;

        for(int i=0; i<Numbers.length; i++){

            for(int j=i; j<Numbers.length; j++){

                for(int k=i; k<=j; k++){
                    System.out.print(Numbers[k]+" ");
                }
                count++;

                System.out.println();
            }
            System.out.println();
        }
        System.out.println("The number of subarrays are "+count);
    }



    //addition of subarrays
    public static int AddSubarrays(int Numbers[]){
        int sum = 0;

        for(int i=0; i<Numbers.length; i++){

            for(int j=i; j<Numbers.length; j++){

                for(int k=i; k<=j; k++){

                    sum += Numbers[k];

                }
            }
        }
        return sum;
    }



    //max num of subarrays
    public static int MaxSubarrays(int Numbers[]){
        int MaxNum = Integer.MIN_VALUE;

        for(int i=0; i<Numbers.length; i++){

            for(int j=i; j<Numbers.length; j++){

                for(int k=i; k<=j; k++){

                    if(MaxNum < Numbers[k]){
                        MaxNum = Numbers[k];
                    }

                }
            }
        }
        return MaxNum;
    }



    //Min num of aubarryas
    public static int MinSubarrays(int Numbers[]){
        int MinNum = Integer.MAX_VALUE;

        for(int i=0; i<Numbers.length; i++){

            for(int j=i; j<Numbers.length; j++){

                for(int k=i; k<=j; k++){

                    if(MinNum>Numbers[k]){
                        MinNum = Numbers[k];
                    }
                }
            }
        }
        return MinNum;
    }

    

    //max subarray sum(brute force method)
    public static int MaxSubarraySum_bruteForce(int Numbers[]){
        int sum = 0;
        int MaxVal = Integer.MIN_VALUE;

        for(int i=0; i<Numbers.length; i++){

            for(int j=i; j<Numbers.length; j++){
                 sum = 0;
                for(int k=i; k<=j; k++){

                    sum += Numbers[k];

                }
                if(sum > MaxVal){
                    MaxVal = sum;
                }
            }
        }
        return MaxVal;
    }

    

    //max subarray sum (prefix sum method)
    public static void MaxSubarraySum_prefixMethod(int Numbers[]){
            int sum = 0;
            int MaxVal = Integer.MIN_VALUE;

            for(int i=0; i<Numbers.length; i++){
                sum = 0;

                for(int j=i; j<Numbers.length; j++){
                    sum+= Numbers[j];

                    if(sum>MaxVal){
                        MaxVal = sum;
                    }
                }
            }
            System.out.println(MaxVal);
        }
    


    //max subarray sum (kadane's algorithm)
    public static void MaxSubarraySum_kadaneAlgorithm(int Numbers[]){
        int prefix[] = new int[Numbers.length];
        int temp = 0;
        for(int i=0; i<Numbers.length; i++){
            temp+= Numbers[i];
            prefix[i] = temp;
        }


        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<Numbers.length; i++){
            int start = i;
            for(int j=i; j<Numbers.length; j++){
                int end = j;
                int sum;
                if(start == 0){
                    sum = prefix[end];
                }else{
                    sum = prefix[end] - prefix[start -1];
                }
                
                maxSum = Math.max(maxSum, sum);

            }
        }
        System.out.println(maxSum);
    }



    //TRAPING RAIN WATER
    //1. on first and last rod - no water will be stored
    //2. if rods are in asending or desending order - no water will be stored


    //volume of trapped water
    public static void TrapingWater(int Numbers[]){
        int volume = 0;
        
        int rightMax[] = new int[Numbers.length];
        rightMax[Numbers.length-1] = Numbers[Numbers.length -1];

        for(int i=0; i<Numbers.length-1; i++){
            int maxx = Numbers[i];

            for(int j=i+1; j<Numbers.length; j++){
                maxx = Math.max(maxx, Numbers[j]);
            }

            rightMax[i] = maxx;

        }

        int leftMax[] = new int[Numbers.length];
        leftMax[0] = Numbers[0];

        for(int i=1; i<Numbers.length; i++){
            int maxx = Numbers[i];
            for(int j=i-1; j>=0; j--){
                maxx = Math.max(maxx, Numbers[j]);
            }
            leftMax[i] = maxx;
        }

        for(int i=1; i<Numbers.length-1; i++){
            volume += (Math.min(rightMax[i], leftMax[i])) - (Numbers[i]);
        }
        System.out.println("The volume of trapped water is "+volume);

    }



    //TrapingWater
    public static void TrapingWater_volume(int height[]){
        int volume = 0;

        int rightMax[] = new int[height.length];

        for(int i=0; i<height.length; i++){
            int max = height[i];

            for(int j=i+1; j<height.length; j++){
                max = Math.max(max, height[j]);
            }
            rightMax[i] = max;
        }

        int leftMax[] = new int[height.length];

        for(int i=0; i<height.length; i++){
            int max = height[i];

            for(int j=i-1; j>=0; j--){
                max = Math.max(max, height[j]);
            }
            leftMax[i] = max;
        }

        for(int i=1; i<height.length-1; i++){

            volume += (Math.min(rightMax[i],leftMax[i])) - height[i];

        }
        System.out.println("the volume of trapped water is "+volume);


    }
    


    //sells and stock market
    //1st method
    public static void stockMarket_1(int prices[]){

        int minBuyPrice = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;

        for(int i=1; i<prices.length; i++){

            for(int j=0; j<=i-1; j++){

                if(minBuyPrice>prices[i]){
                    minBuyPrice = prices[i];
                }
            }
            prices[i] = prices[i] - minBuyPrice;

                if(maxProfit<prices[i]){
                    maxProfit = prices[i];
                }
        }
        System.out.println("The maximum profit will be "+ maxProfit);
    }



    //2nd method
    public static void stockMarket_2(int prices[]){

        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++){

            if(buyPrice<prices[i]){
                int profit = prices[i] - buyPrice;

                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                buyPrice = prices[i];
            }
        }
        System.out.println("The maximum profit will be "+maxProfit);

    }
    


    public static void main(String args[]){

            int Numbers[] = {1,2,3,4,5};
            int prices[] = {23,43,43,98,67};
    
            Reverse(Numbers);
    
            for(int i=0; i<=Numbers.length-1; i++){
                System.out.print(Numbers[i]+" ");
            }
        


            Pairs(Numbers);
            Subarrays(Numbers);
            AddSubarrays(Numbers);
            MaxSubarrays(Numbers);
            MinSubarrays(Numbers);
            MaxSubarraySum_bruteForce(Numbers);
            MaxSubarraySum_prefixMethod(Numbers);
            MaxSubarraySum_kadaneAlgorithm(Numbers);
            TrapingWater(Numbers);
            TrapingWater_volume(Numbers);
            stockMarket_1(prices);
            stockMarket_2(prices);



        
    }
}

        
        
    