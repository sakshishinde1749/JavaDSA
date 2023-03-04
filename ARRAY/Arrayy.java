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
        System.out.println("_____********____");
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
        
        for(int i=0; i<=Numbers.length-1; i++){

            for(int j=i; j<=Numbers.length-1; j++){
                System.out.print("(");

                for(int k=i; k<=j; k++){
                    
                    if(k==j){
                        System.out.print(Numbers[k]);
                    }
                    else{
                        System.out.print(Numbers[k]+",");
                    }
                }
                System.out.print(")"+" ");
            }
            System.out.println();
        }
    }


    //addition of all subarrays
    public static void AddSubarrays_1(int Numbers[]){
        int sum = 0;

        for(int i=0; i<Numbers.length; i++){

            for(int j=i; j<Numbers.length; j++){

                for(int k=i; k<=j; k++){

                    sum += Numbers[k];

                }
            }
        }
        System.out.println(sum);
    }



    //addition of each subarray(easy method using 2 loops)
    public static void AddSubarrays_2(int Numbers[]){
        
        for(int i=0; i<=Numbers.length-1; i++){

            int sum = 0;

            for(int j=i; j<=Numbers.length-1; j++){

                sum += Numbers[j];
                System.out.print("("+sum+")"+","+" ");


            }
            System.out.println();
        }

    }

    

    //max subarray sum(brute force method)
    public static void MaxSubarraySum_bruteForce(int Numbers[]){
        int maxSum = Integer.MIN_VALUE;
        
        for(int i=0; i<=Numbers.length-1; i++){

            for(int j=i; j<=Numbers.length-1; j++){
                int sum = 0;

                for(int k=i; k<=j; k++){
                    sum += Numbers[k];
                }
                if(sum>maxSum){
                    maxSum=sum;
                }
            }

        }
        System.out.println(maxSum);
    }

    

    //max subarray sum (prefix sum method1)
    public static void MaxSubarraySum_prefixMethod1(int Numbers[]){
        int maxSum = Integer.MIN_VALUE;
        
        for(int i=0; i<=Numbers.length-1; i++){
            int sum = 0;

            for(int j=i; j<=Numbers.length-1; j++){

                sum += Numbers[j];
                if(sum>maxSum){
                    maxSum = sum;
                }
            }
        }
        System.out.println(maxSum);

        }
    


    //max subarray sum (prefix method2)
    public static void MaxSubarraySum_prefixMethod2(int Numbers[]){
        int maxSum = Integer.MIN_VALUE;
        
        int prefix[] = new int[Numbers.length];
        int temp = 0;
        int i; int sum=0;

        for(i=0; i<=Numbers.length-1; i++){
            temp += Numbers[i];
            prefix[i] = temp;
        }

        for(i=0; i<=Numbers.length-1; i++){
            int start = i;

            for(int j=i; j<=Numbers.length-1; j++){
                int end = j;

                if(start==0){
                    sum = prefix[end];
                }
                else{
                    sum = prefix[end] - prefix[start-1];
                }

            }
            maxSum = Math.max(maxSum, sum);
        }
            
    }


    //max subarray sum (kadane's rule)
    public static void MaxSubarraySum_kadanes(int Numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int sum = 0; int max = Integer.MIN_VALUE;
        
        for(int i=0; i<=Numbers.length-1; i++){
            max = Math.max(max,Numbers[i]);

            sum += Numbers[i];
            if(sum<0){
                sum = 0;
            }
            maxSum = Math.max(maxSum, sum);
        }
        if(max<0){
            System.out.println(max);
        }

        else{
            System.out.println(maxSum);
        }
        
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
        int maxSell = Integer.MIN_VALUE;
        int maxProfit = Integer.MIN_VALUE;
       
        for(int i=0; i<=prices.length-2; i++){

            for(int j=i+1; j<=prices.length-1; j++){
                maxSell = Math.max(maxSell, prices[j]);
            }

            int profit = maxSell - prices[i];

            maxProfit = Math.max(maxProfit,profit) ;


        }
        System.out.println(maxProfit);
        
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
    
            // Reverse(Numbers);
    
            // for(int i=0; i<=Numbers.length-1; i++){
            //     System.out.print(Numbers[i]+" ");
            // }
        


            // Pairs(Numbers);
            // Subarrays(Numbers);
            //AddSubarrays_1(Numbers);
            // AddSubarrays_2(Numbers);
            //MaxSubarraySum_bruteForce(Numbers);
            // MaxSubarraySum_prefixMethod1(Numbers);
             //MaxSubarraySum_prefixMethod2(Numbers);
            //  MaxSubarraySum_kadanes(Numbers);
            // TrapingWater(Numbers);
            // TrapingWater_volume(Numbers);
            stockMarket_1(prices);
            // stockMarket_2(prices);



        
    }
}

        
        
    