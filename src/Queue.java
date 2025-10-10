public class Queue {
    private int front, back, size, capacity;
    private int[] queue;

    public Queue (int capacity){
        this.capacity = capacity;
        queue = new int [capacity];
        front = 0;
        back = 0;
        size = 0;
    }

    boolean checkFull(){
        return size == capacity;
    }

    boolean checkEmpty(){
        return size == 0;
    }

    void Enqueue (int x){
        if (checkFull()){
            System.out.println("Queue Full");
            return;
        }
        queue[back++] = x;
        size++;
    }

    int Dequeue (){
        if (checkEmpty()){
            System.out.println("Queue Empty");
            return 0;
        }
        int value = queue[front++];
        size--;
        return value;
    }

    void printQueue(){
        for (int i = front; i < back; i++){
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    void peek(){
        if (checkEmpty()){
            System.out.println("Queue Empty");
            return;
        }
        System.out.println(queue[front]);
    }

    public static void main(String[] args) {
        Queue obj = new Queue(10);

        obj.Enqueue(10);
        obj.Enqueue(20);
        obj.Enqueue(30);
        obj.Enqueue(40);
        obj.Enqueue(50);

        obj.printQueue();
        System.out.println(obj.checkEmpty());
        System.out.println(obj.checkFull());

        System.out.println(obj.Dequeue());
        obj.printQueue();
        obj.peek();
        obj.printQueue();
    }
}