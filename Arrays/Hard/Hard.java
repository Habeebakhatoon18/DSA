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

    //Look for 4 sum quite same 
    // Link : https://leetcode.com/problems/4sum/description/

    //------------------------------------------------------------------------------------------------------
    //MERGED INTERVALS 
    //LINK : https://leetcode.com/problems/merge-intervals/
    //optimal : first sort the given intervals then check for condition if last elem of prev interval is less than
    // or greater than 1st elm of next interval then place it accordingly
    //TC : N LOG N + n = n log n, SC : O(N)

    //------------------------------------------------------------------------------------------------------------
    //FIND REPEATING AND MISSING number
    //link : https://takeuforward.org/data-structure/find-the-repeating-and-missing-numbers/

    //methods : *hashing   *sorting *maths *XOR;
    //optimal : making 2 equations of number by taking sum of given number and sum of their squares
    //int[] arr = {3,1,2,5,3};
    public static void findRepeatingAndMissing(int[] arr){
         int n = arr.length;
         long sn = (n*(n+1))/2;
         long s2n = (n*(n+1)*(2*n+1))/6;
         long s = 0,s2 = 0;
         for(int i : arr){
             s += i;
             s2 += i *i;
         }
         int val1 =(int) (sn-s);    //X-Y
         int val2 = (int)(s2n-s2);  //X^2 -y^2 = (X+Y)(X-Y)
         System.out.println(val1);
         System.out.println(val2);
         val2 = val2/val1;          //val2(X+y) = val2/(x-y) 
         val1 = (val1+val2)/2;      //adding both equations : 2x = val1+ val2; since((X-Y)+(X+Y)= VAL1 +VAL2) = 2x = val1 +val2;
         val2 = val2-val1;
         System.out.println("Repeating: "+val2);
         System.out.println("missing: "+ val1);
         
        }
        //TC : O(N) ; SC:O(1);
        //zabardast level ki thinking 


        public void findRepeatingAndMissingUsingXor(int[] arr){
             int n = arr.length;
             int xor = 0;
             for(int i = 0;i < n;i++){
                xor ^= i+1;
                xor ^= arr[i];
             }
             int one = 0, zero = 0;
             //finding differentitating factor in bits right most bit who is 1 
            int num = (xor & ~(xor - 1));

            //2 groups will be there 1 whose xth bit will be 0 and other whose xth bit will be 1
            //if (from given arr)3 is member of any group then other 3(from 1-N) will be member of same group
            //so they will cancel out each other
            //in both groups 1 member will be trice (repeating ) and in another group 1 member will be once
            //(missing one);
            for(int i = 0;i <n;i++){
                //1s group 
                if((arr[i] & num) != 0)
                one = one ^ arr[i];
                else 
                //zeros group
                zero = zero ^ arr[i];
            }
            for(int i = 1;i <= n;i++){
                if((i & num) != 0)
                one ^= i;
                else
                zero ^= i;
            }
            //additional check
            int c = 0;
            for(int i : arr){
            if(zero == i)
            c++;
            }
            if(c == 2){
            //zero is repeating
            System.out.println("Repeating: "+ zero);
            System.out.println("Missing: " + one);}
            else {
            //one is repeating 
            System.out.println("Repeating: "+ one);
            System.out.println("Missing: " + zero);
            }
        }
    public static void main(String[] args) {
        
    }
}