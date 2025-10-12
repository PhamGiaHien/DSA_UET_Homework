package BT_Sort1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Stopwatch;

/**
 1)
 * 1Kints: 0.023
 * 2Kints: 0.027
 * 4Kints: 0.041
 * 8Kints: 0.118
 * 16Kints: 0.224
 * 32Kints: 0.741
 */

public class Insertion_Sort {
    public static void Insertion (int[] a){
        int size = a.length;
        for (int i = 1; i < size; i++){
            int current = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > current){
                a[j + 1] = a[j];
                j--;
            }

            a[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        //In in = new In("E:\\Algorithm\\algs4-data\\1Kints.txt");
        //int[] a = in.readAllInts();
        int[] a = {4, 2, 9, 8, 6, 7, 1, 3, 5};
        for (int k : a) {
            System.out.print(k + " ");
        }

        System.out.println();
        System.out.println("after Insertion");

        Stopwatch timer = new Stopwatch();
        Insertion(a);

        for (int j : a) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("elapsed time = " + timer.elapsedTime());
    }
}