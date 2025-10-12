package BT_Sort1;

import edu.princeton.cs.algs4.Stopwatch;

public class Slection_Sort {
    public static void Selection(int[] a){
        int size = a.length;
        for (int i = 0; i < size; i++){
            int minIndex = i;
            for (int j = i; j < size; j++){
                if (a[j] < a[minIndex]){
                    minIndex = j;
                }
            }

            if (minIndex != i){
                int tmp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = tmp;
            }
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
        System.out.println("after selection");

        Stopwatch timer = new Stopwatch();
        Selection(a);

        for (int j : a) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("elapsed time = " + timer.elapsedTime());
    }
}
