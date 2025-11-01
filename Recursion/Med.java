import java.util.Stack;

public class Med {

    //---------------------------------------------------------------
    //SORT A STACK 
    //time complexity : O(n^2) , space complexity : O(n)
    //similar problem : https://www.geeksforgeeks.org/problems/reverse-a-stack/0
      void insertCorrect(Stack<Integer> st ,int x){
        if(st.isEmpty() || st.peek() < x)
            st.push(x);
        else{
            Stack<Integer> temp = new Stack<>();
            while(!st.isEmpty () && st.peek() > x){
                temp.push(st.pop());
            }
        
            st.push(x);
        
            while( !temp.isEmpty()){
                st.push(temp.pop());
            }
        }
    }
    public void sortStack(Stack<Integer> st) {
        if(st.isEmpty()) return ;
        
        int x = st.pop();
        sortStack(st);
        insertCorrect(st, x); 
    }

    //---------------------------------------------------------------
    //POW(x,n)
    //link : https://leetcode.com/problems/powx-n/
    //similar problem : https://leetcode.com/problems/count-good-numbers/description/
     double pow(double x ,long n){
        if(n == 0) return 1;
         double temp = pow(x , n/2);
        temp *= temp;
        if(n % 2 != 0) temp *= x;
        return temp;
    }
       public double myPow(double x, int n) {
        long num = n;
        if(n < 0) {
            x = 1.0 / x;
            num = -n;
        }
       
        return pow(x,n);
    }
    //time complexity : O(log n) , space complexity : O(log n)
  public static void main(String[] args) {
   
    
  }
}

