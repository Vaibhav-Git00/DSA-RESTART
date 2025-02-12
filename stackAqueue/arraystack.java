package stackAqueue;

// import java.util.Stack;

// public class arraystack {

//     public static void main(String[] args) {
//         Stack<Integer> st = new Stack<>();
//         st.push(1);
//         st.push(2);
//         st.push(3);
//         st.push(4);
//         st.push(5);
//         System.out.println("This is the top element of the stack "+st.peek());
//         System.out.println(st.pop());
//         System.out.println(st.pop());
//         System.out.println(st.pop());
//         System.out.println(st.pop());
//         System.out.println(st.pop());
//     }
// }

class ArrayStack {  // Renamed class to match file name
    private int arr[];
    private int top;
    private int capacity;

    // Constructor to initialize stack
    public ArrayStack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Push an element onto the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + value);
            return;
        }
        arr[++top] = value;
    }

    // Pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop");
            return -1;
        }
        return arr[top--];
    }

    // Peek at the top element of the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return arr[top];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Display stack elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);  // Updated class name here too

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println("Top element is: " + stack.peek());

        stack.pop();
        stack.display();
        
        System.out.println("Top element is: " + stack.peek());
    }
}
