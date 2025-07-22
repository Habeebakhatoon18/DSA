public class SlidingWindow {

    //LONGEST SUBARRAY WITH GIVEN SUM K (POSITIVE INTEGERS):
    //Problem Statement: Given an array and a sum k, we need to print the length of the longest subarray that sums to k.
    // link :https://takeuforward.org/data-structure/longest-subarray-with-given-sum-k/
    //taking a window with 2 pointer and moving the right pointer to expand the window and left pointer to shrink it..
    //if sum equal to k then check if the length of the current window is greater than the max length 
    //found so far then take it as max length then decrease the sum by the left pointer 
    //TC : O(2N) = O(N) , SC : O(1)
    static int longestSubarrayWithSumK(int[] arr, int k) {
        int left = 0, right = 0, sum = 0, maxLength = 0;

        while (right < arr.length) {
            sum += arr[right];

            while (sum > k && left <= right) {
                sum -= arr[left];
                left++;
            }

            if (sum == k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
            right++;
        }
        return maxLength;
    }



    
    public static void main (String[] args) {
        //longest subarray with sum k example 
        int[] arr  = {2,3,5,1,9};
        int k = 10;
        System.out.println( longestSubarrayWithSumK(arr, k));


      
    }
}
