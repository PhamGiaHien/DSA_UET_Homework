package Stack_Queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class QueueUsing_TwoStacks {
    public static void main(String[] args) {
        /*Queue <Integer> queue = new LinkedList<>();
        Scanner input = new Scanner(System.in);

        int queries = input.nextInt();

        for (int i = 0; i < queries; i++){
            int x = input.nextInt();
            if (x == 1){
                int numberAdd = input.nextInt();
                queue.add(numberAdd);
            }
            else if (x == 2){
                if (!queue.isEmpty()) {
                    queue.poll();
                }
            }
            else if (x == 3){
                System.out.println(queue.peek());
            }
        }*/
        Stack <Integer> stack1 = new Stack<>();
        Stack <Integer> stack2 = new Stack<>();

        Scanner input = new Scanner(System.in);

        int queries = input.nextInt();

        for (int i = 0; i < queries; i++){
            int x = input.nextInt();
            if (x == 1){
                int numberAdd = input.nextInt();
                stack1.push(numberAdd);
            }
            else if (x == 2){
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
                stack2.pop();
                while (!stack2.isEmpty()) {
                    stack1.push(stack2.pop());
                }
            }
            else if (x == 3){
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
                System.out.println(stack2.peek());
                while (!stack2.isEmpty()) {
                    stack1.push(stack2.pop());
                }
            }
        }
    }
}
