package Hang_Doi_Uu_Tien;

import java.util.List;
import java.util.PriorityQueue;

public class Jesse_and_Cookies {
    public static int cookies(int k, List<Integer> A) {
        // Write your code here
        PriorityQueue <Integer> heap = new PriorityQueue<>();
        int cnt = 0;

        for (int i = 0; i < A.size(); i++){
            heap.add(A.get(i));
        }

        while (heap.peek() < k && heap.size() >= 2){
            int sweetness = heap.poll() + heap.poll() * 2;
            heap.add(sweetness);
            cnt++;
        }
        if (heap.size() < 2 && heap.peek() < k){
            return -1;
        }
        return cnt;
    }
}
