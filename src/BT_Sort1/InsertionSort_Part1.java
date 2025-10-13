package BT_Sort1;

import java.util.List;

public class InsertionSort_Part1 {
    public static void insertionSort1(int n, List<Integer> arr) {
        for (int i = 1; i < n; i++){
            int current = arr.get(i);
            int j = i - 1;

            while (j >= 0 && arr.get(j) > current){
                arr.set(j + 1, arr.get(j));
                j--;
                for (int k = 0; k < n; k++){
                    System.out.print(arr.get(k) + " ");
                }
                System.out.println();
            }

            arr.set(j + 1, current);
        }
    }
}
