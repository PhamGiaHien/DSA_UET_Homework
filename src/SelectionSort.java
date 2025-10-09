import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * 1Kints: 0.013.
 * 32Kints: 0.987
 * Thời gian chạy không chênh nhau quá nhiều với các dữ liệu khác nhau
 */
public class SelectionSort {
    public static void Selection(int[] a) {
        int size = a.length;

        for (int i = 0; i < size - 1; i++) {
            int minID = i;
            for (int j = i + 1; j < size; j++) {
                if (a[minID] < a[j]) {
                    minID = j;
                }
            }
            if (minID != i) {
                int tmp = a[i];
                a[i] = a[minID];
                a[minID] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        //int[] arr = {2, 1, 7, 5, 6, 3, 8, 9, 4};

        In in = new In("E:\\Algorithm\\algs4-data\\32Kints.txt");
        int[] arr = in.readAllInts();

        for (int k : arr) {
            System.out.print(k + " ");
        }
        System.out.println();
        System.out.println("after selection");
        Stopwatch timer = new Stopwatch();
        Selection(arr);

        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("elapsed time = " + timer.elapsedTime());
    }
}
