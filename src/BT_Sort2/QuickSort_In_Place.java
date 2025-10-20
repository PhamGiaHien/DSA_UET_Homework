package BT_Sort2;

import java.util.*;

/**
 * In toan bo arr sau moi lan partition.
 */
public class QuickSort_In_Place {
    private static int partition(int[] a, int left, int right){
        int pivot = a[right];
        int i = left - 1;

        for (int j = left; j < right; j++){
            if (a[j] < pivot){
                i++;
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }
        i++;
        int tmp = a[i];
        a[i] = pivot;
        a[right] = tmp;

        return i;
    }
    public static void QuickSort(int[] a, int left, int right){
        int size = a.length;
        if (left < right){
            int patri = partition(a, left, right);

            for (int i = 0; i < size; i++){
                System.out.print(a[i] + " ");
            }
            System.out.println();

            QuickSort(a, left, patri - 1);
            QuickSort(a, patri + 1, right);
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int [n];

        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        QuickSort(arr, 0, arr.length - 1);
    }
}