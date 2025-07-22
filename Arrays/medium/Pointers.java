

public class Pointers {
    
    //SORT AN ARRAY OF 0s, 1s, and 2s:
    // LINK : https://leetcode.com/problems/sort-colors/description/

    //BETTER : using 3 vars to count 0s , 1s and 2s and then fill the array with those counts as 0 till
    // count0 , then 1 till count1 and then 2 till end of the array
    //TC : O(2N) = O(N) , SC : O(1)

    //OPTIMAL : using 3 pointers approach (Dutch National Flag Problem)
    // low , mid and high ptrs to indicate postions of 0s , 1s and 2s respectively
    // if mid is 0 then swap it with low and increment both pointers
    // if mid is 1 then just increment mid pointer
    // if mid is 2 then swap it with high and decrement high pointer
    //TC : O(N) , SC : O(1)


 //------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
     
    }
    
}
