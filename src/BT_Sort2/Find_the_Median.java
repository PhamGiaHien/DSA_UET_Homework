package BT_Sort2;

import java.util.*;

public class Find_the_Median{
    public static int findMedian(List<Integer> arr) {

        /*Collections.sort(arr);
        return arr.get(arr.size() / 2);*/

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        int size = arr.size();
        for (int i = 0; i < size; i++){
            minHeap.add(arr.get(i));
            maxHeap.add(minHeap.poll());

            if (maxHeap.size() > minHeap.size()){
                minHeap.add(maxHeap.poll());
            }
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        List<Integer> list = new LinkedList<>();

        for (int i = 0; i < num; i++){
            int x = input.nextInt();
            list.add(x);
        }

        System.out.println(findMedian(list));
    }
}
