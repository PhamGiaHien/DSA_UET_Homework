package BT_Sort1;

import edu.princeton.cs.algs4.Stopwatch;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class InsertionSort_Part2 {
    public static void insertionSort2(int n, List<Integer> arr) {
        for (int i = 1; i < n; i++){
            int current = arr.get(i);
            int j = i - 1;
            while (j >= 0 && arr.get(j) > current) {
                arr.set(j + 1, arr.get(j));
                j--;
                arr.set(j + 1, current);
            }
            for (int k = 0; k < n; k ++){
                System.out.print(arr.get(k) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //In in = new In("E:\\Algorithm\\algs4-data\\1Kints.txt");
        //int[] a = in.readAllInts();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Integer> a = new LinkedList<>();
        for (int i = 0; i < n; i++){
            int x = input.nextInt();
            a.add(x);
        }
        //int[] a = {2, 4, 6, 8, 3};

        for (int k : a) {
            System.out.print(k + " ");
        }
        System.out.println();
        System.out.println("after Insertion");

        Stopwatch timer = new Stopwatch();
        insertionSort2(n, a);

        for (int j : a) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("elapsed time = " + timer.elapsedTime());
    }
}
