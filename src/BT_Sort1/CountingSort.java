package BT_Sort1;

import java.util.LinkedList;
import java.util.List;

class Result {
    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        List<Integer> list = new LinkedList<>();
        int[] a = new int [100];
        for (int i = 0; i < arr.size(); i++){
            a[arr.get(i)]++;
        }

        for (int i = 0; i < 100; i++){
            list.add(a[i]);
        }
        return list;
    }
}

