package assign5;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    void add() {
        Queue queue = new Queue(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);

        assertThat(queue.peek()).isEqualTo(1);
    }

    @Test
    void remove() {
        Queue queue = new Queue(5);
        queue.add(1);
        queue.add(2);
        queue.remove();
        assertThat(queue.peek()).isEqualTo(2);
    }

    @Test
    void nullRemove() {
        Queue queue = new Queue(5);
        assertThatExceptionOfType(IllegalStateException.class)
                .isThrownBy(() -> queue.remove());
    }

    @Test
    void overflow() {
        Queue queue = new Queue(3);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        assertThatExceptionOfType(IllegalStateException.class)
                .isThrownBy(() -> queue.add(4));
    }
}
