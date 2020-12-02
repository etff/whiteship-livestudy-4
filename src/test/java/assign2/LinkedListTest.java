package assign2;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LinkedListTest {

    @Test
    public void addFirst() {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(3);
        linkedList.addFirst(4);

        assertThat(linkedList.getSize()).isEqualTo(2);
        assertThat(linkedList.listNode(0).toString()).isEqualTo("3");
    }

    @Test
    public void addLast() {
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.addLast(40);

        assertThat(linkedList.toString()).isEqualTo("[10, 20, 30, 40]");
    }

    @Test
    public void getNode() {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(3);
        linkedList.addLast(5);

        assertThat(linkedList.listNode(0).toString()).isEqualTo("3");
    }

    @Test
    public void add() {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(3);
        linkedList.addLast(5);

        assertThat(linkedList.getSize()).isEqualTo(2);
    }
}
