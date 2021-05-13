package SDE.Day13;

// Implementation of Queue using Arrays

public class Problem2 {
    static int n = 5;
    static int[] queue = new int[n];
    static int front = -1;
    static int rear = -1;
    public static void main(String[] args) {
        
    }
    public static void enqueue(int data){
        if(isFull()) System.out.println("OVERFLOW");
        else if(isEmpty()){
            front = rear = 0;
            queue[rear] = data;
        }else{
            rear++;
            queue[rear] = data;
        }
    }
    public static void dequeue(){
        if(isEmpty()) System.out.println("UNDERFLOW");
        else if(front == rear){
            front = rear = -1;
        }else{
            System.out.println(queue[front]);
            front++;
        }
    }
    public static boolean isEmpty(){
        if(front == -1 && rear == -1) return true;
        else return false;
    }
    public static boolean isFull(){
        if(rear == n-1) return true;
        return false;
    }
    public static int peek(){
        if(isEmpty()) return -1;
        return queue[front];
    }
    public static void display(){
        if(isEmpty()) System.out.println("QUEUE EMPTY");
        else{
            for(int i = front; i <= rear; i++) System.out.print(queue[i] + " ");
        }
    }
}
