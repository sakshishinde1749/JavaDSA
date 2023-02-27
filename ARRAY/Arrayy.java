package ARRAY;
//reverse a number in array
// public class Array_2 {
//     public static void Reverse(int Numbers[]){

//         int start = 0;
//         int end = Numbers.length - 1;

//         while(start<end){
//             int temp = Numbers[start];     //this will swap numbers
//             Numbers[start] = Numbers[end];
//             Numbers[end] = temp;

//             start++;
//             end--;

//         }

//     }
//     public static void main(String args[]){

//         int Numbers[] = {1,2,3,4,5};

//         Reverse(Numbers);

//         for(int i=0; i<=Numbers.length-1; i++){
//             System.out.print(Numbers[i]+" ");
//         }
//     }
    
// }






//Pairs in an array
// public class Array_2{
//     public static void Pairs(int Numbers[]){

//         int totalPairs = 0;

//         for(int i=0; i<Numbers.length; i++){

//             for(int j=i+1; j<Numbers.length; j++){
//                 System.out.print("("+ Numbers[i] +","+ Numbers[j] +")");

//                 totalPairs++;
//             }
//             System.out.println();
//         }
//         System.out.println("The total pairs are "+totalPairs);

//     }
//     public static void main(String args[]){

//         int Numbers[] = {1,2,3,4,5,6};

//         Pairs(Numbers);

//     }
// }








//print Subarrays 
// public class Array_2{
//     public static void Subarrays(int Numbers[]){
//         int count = 0;

//         for(int i=0; i<Numbers.length; i++){

//             for(int j=i; j<Numbers.length; j++){

//                 for(int k=i; k<=j; k++){
//                     System.out.print(Numbers[k]+" ");
//                 }
//                 count++;

//                 System.out.println();
//             }
//             System.out.println();
//         }
//         System.out.println("The number of subarrays are "+count);


//     }
//     public static void main(String args[]){

//         int Numbers[] = {1,2,3,4,5};

//         Subarrays(Numbers);
//     }
// }





//addition of subarrays
// public class Array_2{
//     public static int AddSubarrays(int Numbers[]){

//         int sum = 0;

//         for(int i=0; i<Numbers.length; i++){

//             for(int j=i; j<Numbers.length; j++){

//                 for(int k=i; k<=j; k++){

//                     sum += Numbers[k];

//                 }
//             }
//         }
//         return sum;



//     }
//     public static void main(String args[]){

//         int Numbers[] = {1,2,3,4};

//         System.out.println("The sum of subarrays is "+AddSubarrays(Numbers));
//     }
// }






//max num of subarrays
// public class Array_2{
//     public static int MaxSubarrays(int Numbers[]){

//         int MaxNum = Integer.MIN_VALUE;

//         for(int i=0; i<Numbers.length; i++){

//             for(int j=i; j<Numbers.length; j++){

//                 for(int k=i; k<=j; k++){

//                     if(MaxNum < Numbers[k]){
//                         MaxNum = Numbers[k];
//                     }

//                 }
//             }
//         }
//         return MaxNum;

//     }


//     public static void main(String args[]){

//         int Numbers[] = {1,2,3,4,5,23,31112};

//         System.out.println("The maximum value among all subarrays is "+MaxSubarrays(Numbers));
//     }
// }






//Min num of aubarryas
// public class Array_2{
//     public static int MinSubarrays(int Numbers[]){
//         int MinNum = Integer.MAX_VALUE;

//         for(int i=0; i<Numbers.length; i++){

//             for(int j=i; j<Numbers.length; j++){

//                 for(int k=i; k<=j; k++){

//                     if(MinNum>Numbers[k]){
//                         MinNum = Numbers[k];
//                     }
//                 }
//             }
//         }
//         return MinNum;

//     }
//     public static void main(String args[]){

//         int Numbers[] = {1,2,43,622,523,4,0};

//         System.out.println("The MIN NUMBER is "+MinSubarrays(Numbers));
//     }
// }







//max subarray sum
// public class Array_2{
//     public static int MaxSubarraySum(int Numbers[]){

//         int sum = 0;
//         int MaxVal = Integer.MIN_VALUE;

//         for(int i=0; i<Numbers.length; i++){

//             for(int j=i; j<Numbers.length; j++){
//                  sum = 0;
//                 for(int k=i; k<=j; k++){

//                     sum += Numbers[k];

//                 }
//                 if(sum > MaxVal){
//                     MaxVal = sum;
//                 }
//             }
//         }
//         return MaxVal;

//     }
//     public static void main(String args[]){

//         int Numbers[] = {1,2,3,4,5};

//         System.out.println("The max subarray num is "+MaxSubarraySum(Numbers));
//     }
// }





//prefix sum of subarray
// public class Array_2{


//         public static void MaxSubarraySum(int Numbers[]){

//             int sum = 0;
//             int MaxVal = Integer.MIN_VALUE;

//             for(int i=0; i<Numbers.length; i++){
//                 sum = 0;

//                 for(int j=i; j<Numbers.length; j++){
//                     sum+= Numbers[j];

//                     if(sum>MaxVal){
//                         MaxVal = sum;
//                     }
//                 }
//             }
//             System.out.println(MaxVal);
//         }

//     public static void main(String args[]){

//         int Numbers[] = {1,2,3,4};

//         MaxSubarraySum(Numbers);
//     }
// }



// public class Array_2{


//     public static void MaxSubarraySum(int Numbers[]){
//         int prefix[] = new int[Numbers.length];
//         int temp = 0;
//         for(int i=0; i<Numbers.length; i++){
//             temp+= Numbers[i];
//             prefix[i] = temp;
//         }


//         int maxSum = Integer.MIN_VALUE;
//         for(int i=0; i<Numbers.length; i++){
//             int start = i;
//             for(int j=i; j<Numbers.length; j++){
//                 int end = j;
//                 int sum;
//                 if(start == 0){
//                     sum = prefix[end];
//                 }else{
//                     sum = prefix[end] - prefix[start -1];
//                 }
                
//                 maxSum = Math.max(maxSum, sum);

//             }
//         }
//         System.out.println(maxSum);
//     }

// public static void main(String args[]){

//     int Numbers[] = {1,2,3,4};

//     MaxSubarraySum(Numbers);
// }
// }


//TRAPING RAIN WATER
//1. on first and last rod - no water will be stored
//2. if rods are in asending or desending order - no water will be stored


// public class Arrayy{
//     public static void TrapingWater(int numbers[]){

//         int volume = 0;
        
//         int rightMax[] = new int[numbers.length];
//         rightMax[numbers.length-1] = numbers[numbers.length -1];

//         for(int i=0; i<numbers.length-1; i++){
//             int maxx = numbers[i];

//             for(int j=i+1; j<numbers.length; j++){
//                 maxx = Math.max(maxx, numbers[j]);
//             }

//             rightMax[i] = maxx;

//         }

//         int leftMax[] = new int[numbers.length];
//         leftMax[0] = numbers[0];

//         for(int i=1; i<numbers.length; i++){
//             int maxx = numbers[i];
//             for(int j=i-1; j>=0; j--){
//                 maxx = Math.max(maxx, numbers[j]);
//             }
//             leftMax[i] = maxx;
//         }

//         for(int i=1; i<numbers.length-1; i++){
//             volume += (Math.min(rightMax[i], leftMax[i])) - (numbers[i]);
//         }
//         System.out.println("The volume of trapped water is "+volume);

//     }
//     public static void main(String args[]){

//         int numbers[] = {4,2,0,6,3,2,5};

//         TrapingWater(numbers);
//     }
// }







// public class Arrayy{
//     public static void TrapingWater(int height[]){
//         int volume = 0;

//         int rightMax[] = new int[height.length];

//         for(int i=0; i<height.length; i++){
//             int max = height[i];

//             for(int j=i+1; j<height.length; j++){
//                 max = Math.max(max, height[j]);
//             }
//             rightMax[i] = max;
//         }

//         int leftMax[] = new int[height.length];

//         for(int i=0; i<height.length; i++){
//             int max = height[i];

//             for(int j=i-1; j>=0; j--){
//                 max = Math.max(max, height[j]);
//             }
//             leftMax[i] = max;
//         }

//         for(int i=1; i<height.length-1; i++){

//             volume += (Math.min(rightMax[i],leftMax[i])) - height[i];

//         }
//         System.out.println("the volume of trapped water is "+volume);


//     }
//     public static void main(String args[]){

//         int height[] = {4,2,0,6,3,2,5};

//         TrapingWater(height);
//     }
// }





//sells and stock market
//first method
// public class Arrayy{
//     public static void stockMarket(int prices[]){

//         int minBuyPrice = Integer.MAX_VALUE;
//         int maxProfit = Integer.MIN_VALUE;

//         for(int i=1; i<prices.length; i++){

//             for(int j=0; j<=i-1; j++){

//                 if(minBuyPrice>prices[i]){
//                     minBuyPrice = prices[i];
//                 }
//             }
//             prices[i] = prices[i] - minBuyPrice;

//                 if(maxProfit<prices[i]){
//                     maxProfit = prices[i];
//                 }
//         }
//         System.out.println("The maximum profit will be "+ maxProfit);
//     }
//     public static void main(String args[]){

//         int prices[] = {7,1,5,3,6,4};

//         stockMarket(prices);
//     }
// }




//2nd method
public class Arrayy{
    public static void stockMarket(int prices[]){

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
        
        int prices[] = {7,1,5,3,6,4};

        stockMarket(prices);
    }
}