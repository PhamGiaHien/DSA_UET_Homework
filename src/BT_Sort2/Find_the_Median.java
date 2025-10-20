package BT_Sort2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Find_the_Median {
    public static int findMedian(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        int size = arr.size();

        return arr.get(size/2);
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
