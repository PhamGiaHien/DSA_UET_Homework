package BT_Sort2;

import java.util.Scanner;

public class Quick_Sort {
    public static void QuickSort(int[]a, int left, int right){
        if (left < right){
            int partrition = partition(a, left, right);
            QuickSort(a, left, partrition - 1);
            QuickSort(a, partrition + 1, right);
        }
    }

    private static int partition(int[] a, int low, int high){
        int pivot = a[high];
        int i = low - 1;

        for (int j = low; j < high; j++){
            if (a[j] <= pivot){
                i++;
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }
        i++;
        int tmp = a[i];
        a[i] = pivot;
        a[high] = tmp;

        return i;
    }

    public static void main(String[] args) {
        int[] a = {2, 5, 1, 3, 7, 9, 8, 4, 6};

        QuickSort(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
