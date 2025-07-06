public class Recursion {
  public static void printName(int n) {
    if (n == 0) {
      return;
    }
    System.out.println("name");
    printName(n - 1);
  }

  public static void print1ToN(int i, int n) {
    if (i > n) {
      return;
    }
    System.out.println(i);
    print1ToN(i + 1, n);

  }

  public static void printNTo1(int n) {
    if (n == 0) {
      return;
    }
    System.out.print(n);
    printNTo1(n - 1);
  }

  static int printSum(int n) {
    if (n == 1)
      return 1;
    return n + printSum(n - 1);
  }

  static int fact(int n) {
    if (n == 1 || n == 0)
      return 1;
    return n * fact(n - 1);
  }

  static void revArr(int[] a, int l, int r) {
    if (l >= r)                       // to perform with just 1 parameter
      return;                         // like f(i) where i is the index and n is the length of the array
    int t = a[l];                     // BC : if(i >= n/2) return;
    a[l] = a[r];                      // to swap the elements like swap(a[i],a[n-1-i])
    a[r] = t;                         // f(i + 1);
    revArr(a, l + 1, r - 1);
  }

  static boolean checkPal(String s, int l, int r) { // to perform with just 1 parameter
    if (l >= r)                           // like checkPal(s ,i) where i is the 1st index and s is string
      return true;                        // BC : if(i >= s.length()/2) return true;
    if (s.charAt(l) != s.charAt(r))       // if(s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
      return false;                       // return checkPal(s, i+1);
    return checkPal(s, l + 1, r - 1);
  }

  public static int fib(int n) {
    if (n == 1 || n == 0)
      return n;
    return (fib(n - 1) + fib(n - 2));
  }

  public static void main(String[] args) {
    // print1ToN(1, 5);
    // printNTo1(5);
    // printName(5);
    // System.out.println(printSum(5));
    // System.out.println(fact(5));
    // int[] a = {1, 2, 3, 4, 5};
    // revArr(a, 0, a.length - 1);
    // System.out.print("Reversed Array: " + java.util.Arrays.toString(a));
    // System.out.println(checkPal("habeeba",0,3));
    System.out.print(fib(6));
  }
}

