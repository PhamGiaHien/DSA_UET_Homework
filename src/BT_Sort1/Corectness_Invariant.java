package BT_Sort1;

import java.util.Scanner;

public class Corectness_Invariant {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int [n];

        for (int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }

        for (int i = 1; i < n; i++){
            int current = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > current){
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = current;
        }

        for (int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }
}
