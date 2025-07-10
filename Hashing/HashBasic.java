import java.util.*;
public class HashBasic {
    public static void main(String[] args) {
        // BRUTE (USING LOOP)
        int a[] = { 1, 2, 3, 3, 3, 2, 4, 2 };
        int n = 8;
        int key = 2;
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == key)
                c++;
        }
        System.out.println(c);

        // BETTER USING HASH ARRAY IF NUMBERS ARE SMALL
        int hash[] = new int[100];
        for (int i = 0; i < n; i++) { // 1 time N computation
            hash[a[i]]++;
        }
        System.out.println(hash[key]); // O(1) time complexity



        //Optimal using HashMap
        Map<Integer ,Integer> m = new HashMap<>();
        for(int i = 0; i < n;i++){
            if(m.containsKey(a[i])){
                m.put(a[i], m.get(a[i]) + 1);    //m.put(a[i] ,m.getOrDefault(a[i],0) +1);
            } else {
                m.put(a[i], 1);
            }
        }
        System.out.println(m.get(key)); // O(1) time complexity



        //Finding frequency of highest and lowest frequency elements
        int maxF = 0;
        int minF = n;
        int maxEl = 0, minEl = 0;
        for(Map.Entry<Integer,Integer> entry : m.entrySet()){
            int f = entry.getValue();
            int el = entry.getKey();
            if(f > maxF){
                maxF = f;
                maxEl = el;
            }
            if(f < minF){
                minEl = el;
                minF = f;
            }
        }
        System.out.println("Max Element " + maxEl + ":" + maxF);
        System.out.println("Min Element " + minEl + ":" + minF);

       
    }
}
