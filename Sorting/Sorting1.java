
import java.util.*;

public class Sorting1 {
    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // Insertion Sort: takes elm and place it at correct position in left sorted
    // part of array by shifting larger elm to right
    static void insertion(int[] a, int n) {
        for (int i = 1; i < n; i++) {
            int j = i;

            // until elm is at correct position(small elm < curr < larger elm) or a reached
            // start
            while (j > 0 && a[j] < a[j - 1]) {
                swap(a, j, j - 1);
                j--;
            }

        }
    }

    // Recursive Insertion Sort : takes elm and place it at correct position in left
    // sorted part of array by shifting larger elm to right
    static void recInsertion(int[] a, int start, int n) {
        if (start > n)
            return;
        int j = start - 1;
        while (j >= 0 && a[start] < a[j]) {
            swap(a, start, j);
            start = j;
            j--;
        }
        recInsertion(a, start + 1, n); // every time left part get sorted and we increase array by 1 index till we reach
                                       // n
    }

    // Selection Sort :selects the min elm and put it at start of array then shrink
    // the array size by ignoring the sorted part{left} and repeat
    static void selection(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i; j < n; j++) {
                if (a[min] > a[j])
                    min = j;
            }
            swap(a, i, min);
        }
    }

    // Bubble Sort : repeatedly swap adjacent elements if they are in wrong order
    // until largest elm is at end of the array then shrink the array size by ignoring 
    // the sorted part{right} and repeat
    static void bubble(int[] a, int n) {
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1])
                    swap(a, j, j + 1);
            }
        }
    }

    // Recursive Bubble Sort : repeatedly swap adjacent elements if they are in
    // wrong order
    static void recBubble(int[] a, int n) {
        if (n == 1)
            return;

        for (int j = 0; j < n - 1; j++) {
            if (a[j] > a[j + 1])
                swap(a, j, j + 1);
        }
        recBubble(a, n - 1);// since largest elm is at end of array ignoring it (sorted part)
    }

    public static void main(String[] args) {
        int a[] = { 8, 5, 1, 2, 7 };
        int n = a.length;

        // insertion(a, n);
        // selection(a, n);
        // bubble(a, n);
        // recBubble(a, n);
        recInsertion(a, 1, n - 1);
        System.out.println(Arrays.toString(a));

    }
}
