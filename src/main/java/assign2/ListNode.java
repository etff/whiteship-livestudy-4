package assign2;

public class ListNode {
    private ListNode head;
    private ListNode tail;

    private Object data;
    private ListNode next;  // 누가 다음 데이터인가
    private int size = 0;

    public ListNode() {
        this(null);
    }

    public ListNode(Object input) {
        this.data = input;
        this.next = null;
    }

    public void addFirst(Object input) {
        ListNode newListNode = new ListNode(input);
        newListNode.next = head;
        head = newListNode;
        size++;
        if (head.next == null) {
            tail = head;
        }
    }

    public void addLast(Object input) {
        ListNode newListNode = new ListNode(input);
        if (size == 0) {
            addFirst(input);
        } else {
            tail.next = newListNode;
            tail = newListNode;
            size++;
        }
    }

    public ListNode add(ListNode head, ListNode nodeToAdd, int position) {
        if (this.head == null) {
            this.head = head;
        }
        ListNode temp1 = listNode(position - 1);   // 해당 위치의 앞 위치에서 next설정
        ListNode temp2 = temp1.next;
        temp1.next = nodeToAdd;
        nodeToAdd.next = temp2;
        size++;
        if (nodeToAdd.next == null) {
            tail = nodeToAdd;
        }
        return this;
    }

    public ListNode removeFirst() {
        ListNode temp = head;  // head의 값을 두번쨰 노드로 변경
        head = temp.next;
        size--;
        return this;
    }

    public ListNode remove(ListNode head, int positionToRemove) {
        if (positionToRemove == 0) {
            return removeFirst();
        }
        ListNode temp = listNode(positionToRemove - 1);
        ListNode todoDeleted = temp.next;
        // 삭제 앞 노드의 다음 노드로 삭제 뒤 노드를 지정합니다.
        temp.next = temp.next.next;
        if (todoDeleted == tail) {
            tail = temp;
        }
        size--;
        return this;
    }

    public ListNode listNode(ListNode listHead, int index) {
        ListNode x = listHead;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public ListNode listNode(int index) {
        ListNode x = head;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public boolean contains(ListNode head, ListNode nodeTocheck) {
        boolean hasItem = false;
        if (this.head == null) {
            this.head = head;
        }
        ListNode temp = this.head;

        while (temp != null) {
            if (temp.data == nodeTocheck.data) {
                hasItem = true;
            }
            temp = temp.next;
        }
        return hasItem;
    }

    public String toString() {
        if (head == null) {
            return "[]";
        }
        ListNode temp = head;
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

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getNext() {
        return next;
    }

    public int getData() {
        return (int) data;
    }
}
