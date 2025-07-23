import java.util.*;
public class ArrayMedium {

    //Longest Subarray with sum K | [Postives and Negatives]:
    //link : https://takeuforward.org/arrays/longest-subarray-with-sum-k-postives-and-negatives/
    //Using a hashmap to store the cumulative sum and its index at every index, we can find the longest subarray with sum k
    //by checking if the cumulative sum minus k exists in the hashmap.
    //TC : O(N) , SC : O(N)
    static int longestSubarrayWithSumK(int[] arr, int k) {  
        int maxLength = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == k) {
                maxLength = i + 1; // subarray from index 0 to i
            }
            if (map.containsKey(sum - k)) {
                maxLength = Math.max(maxLength, i - map.get(sum - k));
            }

            // Store the first occurrence of the cumulative sum
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return maxLength;
    }
//------------------------------------------------------------------------------------------------------

    //MAJORITY ELEMENT IN AN ARRAY(N/2):
    // link : https://leetcode.com/problems/majority-element/description/

    //BETTER : using hashmap to count the frequency of each element and then check if any element has frequency greater than n/2
    //TC : O(N LOG N) , SC : O(N)

    //OPTIMAL : using Boyer-Moore Voting Algorithm
    //taking 2 var elm and count , if count is 0 then set elm to current element and increment count
    //if current element is equal to elm then increment count else decrement count
    //at the end elm will be the majority element (since each time we are incrementing and decrementing count we are cancelling out the non-majority elements ,the majority element will always remain)
    //TC : O(N) , SC : O(1)
    
    //------------------------------------------------------------------------------------------------------
    
    public static void main(String[] args) {  
        
        //longest subarray with sum k example 
        int[] arr = {2, -1, 3, 4, -2, 1, 5};
        int k = 5;
        System.out.println(longestSubarrayWithSumK(arr, k));
}
}
