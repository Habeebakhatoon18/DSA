public class ArrayEasy {

    // LEFT ROTATE AND ARRAY BY D POSITIONS :
    // Link : https://leetcode.com/problems/rotate-array/description/
    // first reverse the first d elements then reverse the rest of the array and
    // finally reverse the whole array
    // TC : O(N) , SC : O(1)


    //-------------------------------------------------------------------------------------------------------
    
    // MAXIMUM CONSECUTIVE ONES :
    // link : https://leetcode.com/problems/max-consecutive-ones/
    // traversing the array and have a counter to count the number of consecutive
    // ones if 1 is found
    // increase the counter else reset it to 0 and check if the counter is greater
    // than the max count found so far
    // TC : O(N) , SC : O(1)

    //-------------------------------------------------------------------------------------------------------
    // Find Second Smallest and Second Largest Element in an array
    static int[] secondSmallLarge(int[] a) {
        int[] res = { -1, -1 };

        if (a.length <= 1)
            return res;

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            // finding second largest
            if (a[i] > max) {
                res[1] = max;
                max = a[i];
            } else if (a[i] > res[1] && a[i] != max)
                res[1] = a[i];

            // finding second smallest
            if (a[i] < min) {
                res[0] = min;
                min = a[i];
            } else if (a[i] < res[0] && a[i] != min)
                res[0] = a[i];
        }
        return res;
    }
    // ------------------------------------------------------------------------------------------------------
    // BUY AND SELL STOCKS :
    // link :https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

    // BETTER: taking 2 arrays of min and max one store the max price from the right
    // and one store the min price from the left
    // then traverse the array and find the max profit by subtracting the min price
    // from the
    // max price at each index
    // TC : O(3N) , SC : O(2N)

    // OPTIMAL : take a min variable to store the minimum price found so far and maxprofit 
    // if the current price is less than min then set min to current price
    // if the current price minus min is greater than maxprofit then set maxprofit to current price minus min
    // at the end return maxprofit
    //TC : O(N) , SC : O(1)
    public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 1, 5, 6 };
        System.out.println("2nd Min : " + secondSmallLarge(arr)[0] + " , 2nd Max :" + secondSmallLarge(arr)[1]);
    }
}