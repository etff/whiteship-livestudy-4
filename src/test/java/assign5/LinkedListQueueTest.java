package assign5;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.*;

class LinkedListQueueTest {

    @Test
    void add() {
        LinkedListQueue queue = new LinkedListQueue();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        assertThat(queue.peek()).isEqualTo(1);
    }

    @Test
    void remove() {
        LinkedListQueue queue = new LinkedListQueue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.remove();

        assertThat(queue.peek()).isEqualTo(2);
    }

    @Test
    void nullRemove() {
        LinkedListQueue queue = new LinkedListQueue();
        assertThatExceptionOfType(IllegalStateException.class)
                .isThrownBy(() -> queue.remove());
    }

}
