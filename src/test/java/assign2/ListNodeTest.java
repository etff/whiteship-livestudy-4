package assign2;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ListNodeTest {

    @Test
    void addFirst() {
        ListNode listNode = new ListNode();
        listNode.addFirst(20);
        listNode.addFirst(30);
        listNode.addFirst(40);

        assertThat(listNode.toString()).isEqualTo("[40, 30, 20]");
    }

    @Test
    void add() {
        ListNode listNode = new ListNode();

        listNode.addFirst(20);
        listNode.addFirst(30);
        listNode.addFirst(40);

        listNode.add(listNode, new ListNode(50), 2);

        assertThat(listNode.toString()).isEqualTo("[40, 30, 50, 20]");
        assertThat(listNode.getSize()).isEqualTo(4);
    }

    @Test
    void addLast() {
        ListNode listNode = new ListNode();
        listNode.addLast(20);
        listNode.addLast(30);
        listNode.addLast(40);

        assertThat(listNode.toString()).isEqualTo("[20, 30, 40]");
    }

    @Test
    void removeFirst() {
        ListNode listNode = new ListNode();
        listNode.addFirst(10);
        listNode.addFirst(20);
        listNode.addFirst(30);

        listNode.removeFirst();

        assertThat(listNode.toString()).isEqualTo("[20, 10]");
    }

    @Test
    void remove() {
        ListNode listNode = new ListNode();
        listNode.addFirst(10);
        listNode.addFirst(20);
        listNode.addFirst(30);

        listNode.remove(listNode, 1);

        assertThat(listNode.toString()).isEqualTo("[30, 10]");
    }


}
