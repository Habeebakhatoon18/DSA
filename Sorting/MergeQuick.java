
import java.util.*;

public class MergeQuick {
    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // Quick Sort
    static void quick(int[] a, int l, int r) {
        if (l < r) {
            int p = sortQuick(a, l, r);
            quick(a, l, p - 1);
            quick(a, p + 1, r);
        }
    }

    static int sortQuick(int[] a, int l, int r) {
        int i = l, j = r;
        int pv = a[l];
        while (i < j) {
            //stop at elm > pivot
            while (pv >= a[i] && i < r) {
                i++;
            }
            //stop at elm < pivot
            while (pv < a[j] && j > l) {
                j--;
            }
            if (i < j)
                swap(a, i, j);
        }
        swap(a, l, j);
        return j;
    }

    // Merge Sort
    static void merge(int[] a, int l, int h) {
        if (l < h) {
            int mid = (l + h) / 2;
            merge(a, l, mid);
            merge(a, mid + 1, h);
            sortMerge(a, l, mid, h);
        }
    }

    static void sortMerge(int[] a, int low, int mid, int high) {
        int i = low, j = mid + 1, k = 0;
        int temp[] = new int[high - low + 1];

        //till one of the array is exhausted
        while (i <= mid && j <= high) {
            if (a[i] < a[j]) {
                temp[k] = a[i];
                i++;
            } else {
                temp[k] = a[j];
                j++;
            }
            k++;
        }

        //copy remaining elm if any
        while (i <= mid) {
            temp[k++] = a[i++];
        }
        while (j <= high) {
            temp[k++] = a[j++];
        }

        //copy to original array
        for (int x = 0; x < temp.length; x++) {
            a[low++] = temp[x];
        }
    }

    public static void main(String[] args) {
        int a[] = { 8, 5, 1, 2, 7 };
        int n = a.length;

        merge(a, 0, 4);
        // quick(a,0,4);
        System.out.println("Array after swap: " + Arrays.toString(a));

    }
}
