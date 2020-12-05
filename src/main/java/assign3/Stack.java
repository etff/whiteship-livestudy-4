package assign3;

public class Stack {
    private int stack[];
    private int top;
    private int size;

    public Stack(int size) {
        this.stack = new int[size];
        this.top = -1;
        this.size = size;
    }

    public void push(int data) {
        if (isFull()) {
            throw new IllegalArgumentException();
        }
        stack[++top] = data;
    }

    public int peek() {
        if (!isEmpty()) {
            return stack[top];
        }
        return -1;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        return stack[top--];
    }

    public int size() {
        return top + 1;
    }

    private boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }
}
