import java.io.*;
import java.util.*;
import java.util.Stack;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String S = "";
        Stack<String> stack = new Stack<>();
        stack.push(S);

        int Q = input.nextInt();

        for (int i = 0; i < Q; i++){
            int t = input.nextInt();
            if (t == 1){
                String adds = input.next();
                S = S + adds;
                stack.push(S);
            }
            else if (t == 2){
                int k = input.nextInt();
                int size = S.length();

                S = S.substring(0, size - k);
                stack.push(S);
            }
            else if (t == 3){
                int k = input.nextInt();
                System.out.println(S.charAt(k - 1));
            }
            else if (t == 4){
                stack.pop();
                S = stack.peek();
            }
        }
    }
}