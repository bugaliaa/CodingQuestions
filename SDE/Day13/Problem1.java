package SDE.Day13;

// Implementation of Stack using Arrays

public class Problem1 {

    static int n = 5;
    static int top = -1;
    static int[] stack = new int[n];
    public static void main(String[] args) {
        push(1);
        push(100);
        System.out.println(peek());
        pop();
        pop();
        System.out.println(peek());
        pop();
    }
    public static void push(int data){
        if(top+1 < n) stack[++top] = data;
        else System.out.println("Stack overflow");
    }
    public static void pop(){
        if(top-1 >= -1) stack[top--] = 0;
        else System.out.println("Stack underflow");
    }
    public static int peek(){
        return (top == -1) ? -1 : stack[top];
    }
    public static void display(){
        for(int i = 0; i <= top; i++) System.out.print(stack[i] + " ");
        System.out.println();
    }
}
