public class merge {
    //COUNT INVERSIONS:
    //link : https://leetcode.com/problems/count-inversions/

    //using merge sort to count inversions
    //TC : O(N log N) , SC : O(N)
    //while merging the two sorted arrays if the left element is greater than the right element
    //then all the remaining elements in the left array will be greater than the right element
    //so we can count the number of inversions by adding the number of elements remaining in the left array
    //to the count of inversions
    //------------------------------------------------------------------------------------------------------------

    //Reverse pairs:
    //link : https://leetcode.com/problems/reverse-pairs/
    //Optimal : using merge sort to count the number of reverse pairs
    //TC : O(N log N) , SC : O(N)
    //while merging the two sorted arrays if the left element is greater than twice the right element
    //then all the remaining elements in the left array will be greater than twice the right element
    //so we can count the number of reverse pairs by adding the number of elements remaining in the left array
    //to the count of reverse pairs
    // see the code 
    //------------------------------------------------------------------------------------------------------------
    
    public static void main(String[] args) {
        // Example usage of the methods
       
    }
}
