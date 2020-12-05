package assign5;

public class LinkedListQueue {
    private LinkedNode front, rear;
    private int size;

    class LinkedNode {
        int data;
        LinkedNode next;
    }

    public LinkedListQueue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(int data) {
        LinkedNode oldRear = rear;
        rear = new LinkedNode();
        rear.data = data;
        rear.next = null;

        if (isEmpty()) {
            front = rear;
        } else {
            oldRear.next = rear;
        }
        size++;
    }

    public void remove() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        front = front.next;
        size--;
    }

    public int peek() {
        return front.data;
    }
}
