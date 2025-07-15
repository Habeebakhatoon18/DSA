public class ArrayBasics {

    // Find the largest element in an array
    static int findLargest(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    // Find Second Smallest and Second Largest Element in an array
    static int[] secondSmallLarge(int[] a) {
        int[] res = { -1, -1 };

        if (a.length <= 1)
            return res;

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            //finding second largest
            if (a[i] > max) {
                res[1] = max;
                max = a[i];
            } else if (a[i] > res[1] && a[i] != max)
                res[1] = a[i];


            //finding second smallest
            if (a[i] < min) {
                res[0] = min;
                min = a[i];
            } else if (a[i] < res[0] && a[i] != min)
                res[0] = a[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 1, 5, 6 };
        System.out.println(findLargest(arr));
        System.out.println("2nd Min : " + secondSmallLarge(arr)[0] + " , 2nd Max :" + secondSmallLarge(arr)[1]);
    }
}
