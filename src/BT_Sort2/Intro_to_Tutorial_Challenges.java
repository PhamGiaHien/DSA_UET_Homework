package BT_Sort2;

import java.util.List;

public class Intro_to_Tutorial_Challenges {
    public static int introTutorial(int V, List<Integer> arr) {
        // Write your code here
        int left = 0;
        int right = arr.size() - 1;
        int res = 0;

        while (left <= right){
            int mid = (left + right) / 2;
            if (arr.get(mid) == V){
                res = mid;
                break;
            }
            else if (arr.get(mid) < V){
                left = mid + 1;
            }
            else if (arr.get(mid) > V){
                right = mid - 1;
            }
        }
        return res;
    }
}
