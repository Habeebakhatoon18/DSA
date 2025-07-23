public class kadaneAlgo {

    //Kadane's Algorithm to find the maximum subarray sum
    //link : https://leetcode.com/problems/maximum-subarray/description/

    //Using a variable to keep track of the current sum and another for the maximum sum found so far
    //If the current sum becomes negative, we reset it to 0(since carrying a -ve value will not help )
    //TC : O(N) , SC : O(1)

    //-------------------------------------------------------------------------------------------------------
    
    //Kadane's Algorithm with variation (print subarray):
    //whenever our sum = 0 we are starting a new subarray so that is our starting index 
    // whenever we found a max sum we store the end index of that subarray
    static int kadane(int[] nums) {
        int sum = 0;
        int start = -1, end = -1;
    int maxSum = Integer.MIN_VALUE;
    for(int i = 0;i <nums.length;i++){
        if(sum == 0) //starting a new subarray
        start  = i;

        sum += nums[i];

        if(sum > maxSum){
             maxSum = sum;
             end = i; // end of subarray 
        }
       
        if(sum < 0)
        sum = 0;
    }
    System.out.println("Start :" + start + ", End: " + end);
    return maxSum;
        // returns max sum and indices of the subarray
    }
    public static void main(String[] args) {

        // Example usage of the longestSubarrayWithSumK and printing the indices
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int k = kadane(arr);
        System.out.println("Maximum subarray sum: " + k);
    }
    
}
