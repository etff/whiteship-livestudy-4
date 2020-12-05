package assign5;

public class Queue {
    private int front;
    private int rear;
    private int size;
    private int queue[];

    public Queue(int size) {
        this.front = 0;
        this.rear = 0;
        this.size = size;
        this.queue = new int[size];
    }

    public void add(int data) {
        if (size == rear) {
            throw new IllegalStateException();
        }
        queue[rear++] = data;
    }

    public void remove() {
        if (front == rear) {
            throw new IllegalStateException();
        }
        for (int i = 0; i < rear - 1; i++) {
            queue[i] = queue[i + 1];
        }
        if (rear < size) {
            queue[rear] = 0;
        }
        rear--;
    }

    public int peek() {
        return queue[front];
    }
}
