public class matrix {
    //Print matrix in spiral order 
    //TC : O(N*M) , SC : O(1)
    //link : https://leetcode.com/problems/spiral-matrix/description/
    //taking 4 var top , bottom ,left and right to keep track of the boundaries of the matrix and printing values in spiral order by checking certain conditions 


    //--------------------------------------------------------------------------------------------------------
    //SET MATRIX ZEROES
    //linkk : https://leetcode.com/problems/set-matrix-zeroes/description/

    //better take 2 arrays to keep track of the rows and columns that need to be set to zero
    //TC : O(N*M) , SC : O(N+M)

    //optimal : use 1st col as refernce to store zeroes where that rows should be 0 and 1st row as ref for cols that should be made 0 then 1 separate var row1 to avoid overlapping to track if 1st col needed to be made as 0s;
    //TC :O(N*M),SC :O(1);


    //---------------------------------------------------------------------------------------------

    //ROTATE MATRIX BY 90 DEG
    //link :https://leetcode.com/problems/rotate-image/
    //transpose the matrix then swap the cols we get matrix rotated by 90 degree
    //TC:(N*N) , SC :O(1)

    
     public static void main(String[] args) {
        
    }
}
