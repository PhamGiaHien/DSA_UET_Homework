package Hang_Doi_Uu_Tien;

import java.util.ArrayList;
import java.util.*;

public class Find_the_Running_Median {
    public static List<Double> runningMedian(List<Integer> a) {
        // Write your code here
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        List<Double> list = new ArrayList<>();

        for (int i = 0; i < a.size(); i++){
            maxHeap.add(a.get(i));
            minHeap.add(maxHeap.poll());

            if (maxHeap.size() < minHeap.size()){
                maxHeap.add(minHeap.poll());
            }
            if (maxHeap.size() == minHeap.size()) {
                list.add(((double) maxHeap.peek() + (double) minHeap.peek()) / 2.0);
            } else {
                list.add((double) maxHeap.peek());
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = input.nextInt();
        for (int i = 0; i < n; i++){
            int x = input.nextInt();
            list.add(x);
            List<Double> medians = runningMedian(list);
            System.out.println(medians.get(i));
        }
    }
}
