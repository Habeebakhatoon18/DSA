package Sorting;
import java.util.*;

public class Sorting1 {
    public static void swap(int[] a ,int i ,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    //Insertion Sort
    static void insertion(int[] a , int n){
         for(int i = 1;i < n;i++){
           int j = i;
                while(j > 0 && a[j] < a[j-1]){
                    swap(a , j ,j-1);
                    j--;
                }
            
        }
    }

    //Selection Sort
    static void selection(int[] a , int n){
        for(int i = 0; i < n-1; i ++){
            int min = i;
            for(int j = i; j < n ; j++){
                if(a[min] > a[j])
                    min = j;       
            }
            swap(a, i, min);
        }
    }

    //Bubble Sort
    static void bubble(int[] a ,int n){
        for(int i = n-1; i >= 1; i--){
            for(int j = 0; j < i;j++){
                if(a[j] > a[j+1])
                swap(a ,j ,j+1);
            }
        }
    }
    public static void main(String[] args){
        int a[] = {8,5 ,1, 2,7};
        int n = a.length;

      //  insertion(a, n);
      //  selection(a, n);
            bubble(a, n);
        System.out.println(Arrays.toString(a));
         
       
    }
}
