package assign2;

public class LinkedList {
    private ListNode head;
    private ListNode tail;
    private int size = 0;   // 엘리먼트의 갯수

    public void setHead(ListNode head) {
        this.head = head;
    }

    public void setTail(ListNode tail) {
        this.tail = tail;
    }

    class ListNode {
        private Object data;
        private ListNode next;  // 누가 다음 데이터인가

        public ListNode(Object input) {
            this.data = input;
            this.next = null;
        }

        @Override
        public String toString() {
            return String.valueOf(this.data);
        }
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

    ListNode add(ListNode head, ListNode nodeToAdd, int position) {
        ListNode newNode = null;
        if (position == 0) {
            ListNode newListNode = new ListNode(position);
            newListNode.next = head;
            head = newListNode;

            if (head.next == null) {

            }
        } else {
            ListNode temp1 = listNode(head, position);
            ListNode temp2 = temp1.next;
            ListNode newListNode = nodeToAdd;
            temp1.next = nodeToAdd;
            newListNode.next = temp2;
            size++;
            if (newListNode.next == null) {
                tail = newListNode;
            }
        }
        return newNode;
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

    public ListNode listNode(int index) {
        ListNode x = head;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public ListNode listNode(ListNode listHead, int index) {
        ListNode x = listHead;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }



    public void add(int k, Object input) {
        if (k == 0) {
            addFirst(input);
        } else {
            ListNode temp1 = listNode(k - 1);
            ListNode temp2 = temp1.next;
            ListNode newListNode = new ListNode(input);
            temp1.next = new ListNode(input);
            newListNode.next = temp2;
            size++;
            if (newListNode.next == null) {
                tail = newListNode;
            }
        }
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
}
