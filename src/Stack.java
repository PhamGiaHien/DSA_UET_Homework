import edu.princeton.cs.algs4.*;

public class Stack {
    private int top;
    private int capacity;
    private int[] stack;

    public Stack (int size){
        stack = new int [size];
        capacity = size;
        top = 0;
    }

    public void push (int x){
        if (top == capacity){
            System.out.println("Stack Full");
            return;
        }
        stack[top++] = x;
    }

    public void pop (){
        if (top == 0){
            System.out.println("Stack Empty");
            return;
        }
        stack[--top] = 0;
    }

    public int peak (){
        return stack[top - 1];
    }

    public boolean isEmpty(){
        return top == 0;
    }

    public int size (){
        return capacity;
    }

    public void printStack(){
        if (top == 0){
            System.out.println("Empty Stack");
            return;
        }
        for (int i = 0; i < capacity - 1; i++){
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack obj = new Stack(10);
        obj.printStack();

        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);

        obj.printStack();

        obj.pop();

        obj.printStack();

        System.out.println(obj.peak());
        System.out.println(obj.isEmpty());
        System.out.println(obj.size());
    }
}