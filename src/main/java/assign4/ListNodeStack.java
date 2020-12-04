package assign4;

public class ListNodeStack {

    private ListNodeStack head;
    private ListNodeStack tail;

    private Integer data;
    private ListNodeStack next;  // 누가 다음 데이터인가
    private int size = 0;

    public ListNodeStack() {
        this(null);
    }

    public ListNodeStack(Integer input) {
        this.data = input;
        this.next = null;
    }

    public void addFirst(int input) {
        ListNodeStack newListNode = new ListNodeStack(input);
        newListNode.next = head;
        head = newListNode;
        size++;
        if (head.next == null) {
            tail = head;
        }
    }

    public void push(int input) {
        ListNodeStack newListNode = new ListNodeStack(input);
        if (size == 0) {
            addFirst(input);
        } else {
            tail.next = newListNode;
            tail = newListNode;
            size++;
        }
    }

    public int pop() {
        // 삭제 앞 노드의 다음 노드로 삭제 뒤 노드를 지정합니다.
        ListNodeStack prev = listNode(size - 2);
        ListNodeStack todoDeleted = prev.next;
        // 삭제 앞 노드의 다음 노드로 삭제 뒤 노드를 지정합니다.
        int result = todoDeleted.data;
        prev.next = null;

        if (todoDeleted == tail) {
            tail = prev;
        }
        size--;
        return result;
    }


    public ListNodeStack listNode(int index) {
        ListNodeStack x = head;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }


    public String toString() {
        if (head == null) {
            return "[]";
        }
        ListNodeStack temp = head;
        String str = "[";

        while (temp.next != null) {
            str += temp.data + ", ";
            temp = temp.next;
        }
        str += temp.data;
        return str + "]";
    }

    public int getSize() {
        return size;
    }
}
