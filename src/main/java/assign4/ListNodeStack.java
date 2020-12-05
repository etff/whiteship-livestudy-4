package assign4;

import assign2.ListNode;

public class ListNodeStack {
    private ListNode head;
    private ListNode tail;
    private int size = 0;

    public void addFirst(int input) {
        ListNode newListNode = new ListNode(input);
        newListNode.setNext(head);
        head = newListNode;
        size++;
        if (head.getNext() == null) {
            tail = head;
        }
    }

    public void push(int input) {
        ListNode newListNode = new ListNode(input);
        if (size == 0) {
            addFirst(input);
        } else {
            tail.setNext(newListNode);
            tail = newListNode;
            size++;
        }
    }

    public int pop() {
        // 삭제 앞 노드의 다음 노드로 삭제 뒤 노드를 지정합니다.
        ListNode prev = listNode(size - 2);
        ListNode todoDeleted = prev.getNext();
        // 삭제 앞 노드의 다음 노드로 삭제 뒤 노드를 지정합니다.
        int result = todoDeleted.getData();
        prev.setNext(null);

        if (todoDeleted == tail) {
            tail = prev;
        }
        size--;
        return result;
    }


    public ListNode listNode(int index) {
        ListNode x = head;
        for (int i = 0; i < index; i++) {
            x = x.getNext();
        }
        return x;
    }


    public String toString() {
        if (head == null) {
            return "[]";
        }
        ListNode temp = head;
        String str = "[";

        while (temp.getNext() != null) {
            str += temp.getData() + ", ";
            temp = temp.getNext();
        }
        str += temp.getData();
        return str + "]";
    }

    public int getSize() {
        return size;
    }
}
