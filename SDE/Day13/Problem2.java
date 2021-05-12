package SDE.Day13;

public class Problem2 {
    static int n = 5;
    static int[] queue = new int[n];
    static int front = -1;
    static int rear = -1;
    public static void main(String[] args) {
        
    }
    public static void enqueue(int data){
        rear++;
        if(rear < n) queue[rear] = data;
        else System.out.println("Overflow");
    }
    public static void dequeue(){
        front++;
    }
    public static boolean isEmpty(){
        if(rear == front) return true;
        else return false;
    }
    public static boolean isFull(){
        if(rear == n) return true;
        else return false;
    }
}
