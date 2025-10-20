package BT_Sort2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class QuickSort1_Partition {
    public static List<Integer> quickSort(List<Integer> arr) {
        // Write your code here
        List<Integer> list = new LinkedList<>();
        int pivot = arr.get(0);

        for (int i = 0; i < arr.size(); i++){
            if (arr.get(i) < pivot){
                list.add(arr.get(i));
            }
        }
        list.add(pivot);
        for (int j = 0; j < arr.size(); j++){
            if (arr.get(j) > pivot){
                list.add(arr.get(j));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        List<Integer> list = new LinkedList<>();

        for (int i = 0; i < num; i++){
            int x = input.nextInt();
            list.add(x);
        }

        quickSort(list);

        for (int i = 0; i < num; i++){
            System.out.print(list.get(i) + " ");
        }

    }
}
