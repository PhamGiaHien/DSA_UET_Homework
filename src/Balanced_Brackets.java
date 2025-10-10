import java.util.Scanner;
import java.util.Stack;

public class Balanced_Brackets {
    public static String isBalanced(String s) {
        Stack<Character> st = new Stack<>();
        int size = s.length();

        for (int i = 0; i < size; i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.add(s.charAt(i));
            } else if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
                if (st.isEmpty()) {
                    return "NO";
                }

                char top = st.pop();
                if (top != '(' && s.charAt(i) == ')') return "NO";
                else if (top != '{' && s.charAt(i) == '}') return "NO";
                else if (top != '[' && s.charAt(i) == ']') return "NO";
            }
        }
        if (!st.isEmpty()) {
            return "NO";
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for (int i = 0; i < num; i++) {
            String S = input.next();
            System.out.println(isBalanced(S));
        }
    }
}
