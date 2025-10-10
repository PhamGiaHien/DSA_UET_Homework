import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

public class Equal_Stacks {
    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        // Write your code here
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

        int size1 = h1.size();
        int size2 = h2.size();
        int size3 = h3.size();

        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;

        for (int i = 0; i < size1; i++){
            sum1 += h1.get(i);
        }
        for (int i = 0; i < size2; i++){
            sum2 += h2.get(i);
        }
        for (int i = 0; i < size3; i++){
            sum3 += h3.get(i);
        }
        while (true){
            if (sum1 == sum2 && sum2 == sum3){
                return sum1;
            }
            else if (cnt1 == h1.size() || cnt2 == h2.size() || cnt3 == h3.size()){
                return 0;
            }

            if (sum1 >= sum2 && sum1 >= sum3){
                sum1 -= h1.get(cnt1++);
            }
            else if (sum2 >= sum1 && sum2 >= sum3){
                sum2 -= h2.get(cnt2++);
            }
            else {
                sum3 -= h3.get(cnt3++);
            }
        }
    }
}
