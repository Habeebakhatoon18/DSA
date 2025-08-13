public class Hard{
    //-----------------------------------------------------------------------------
    //PASCALS TRIANGLE :
    //Link : https://leetcode.com/problems/pascals-triangle/description/
    //property : Each number is the sum of the two numbers directly above it. 
    //we can calculate the value at specific row and column using nCr formula . where 
    // n is the row number and r is the column no . starting from 0.
    // nCr = n! / (r! * (n - r)!) = n * (n-1) * ...*(n -r)!/ r ! * (n-r)! = n * (n-1) * ...*(n -r+1)/r!
    
    // for calculating value at each row and column 
    static void pascalsTriangle(int n) {
    for(int row = 0; row < n; row++) {
          int res = 1;
        for(int col = 0; col <= row; col++) {
            //nCr
            res = res * (row -col);
            res = res / (col +1); //col if col starts from 1
            System.out.print(res + " ");
        }
        System.out.println();
    }
}
//------------------------------------------------------------------------------------------------------
    //3SUM PROBLEM:
    //Link : https://leetcode.com/problems/3sum/description/
    //Better : use a hashset to check if 3rd elm exists or not use third = -(nums[i] + nums[j]) 
    //TC : O(N^2) , SC : O(N)

    //Optimal : sort the array and then use 2 pointer approach to find the triplet
    //TC : O(N^2) , SC : O(1)
    public static void main(String[] args) {
        
    }
}