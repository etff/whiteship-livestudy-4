package assign4;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ListNodeStackTest {

    @Test
    void push() {
        ListNodeStack listNodeStack = new ListNodeStack();
        listNodeStack.push(10);
        listNodeStack.push(20);

        assertThat(listNodeStack.getSize()).isEqualTo(2);
        assertThat(listNodeStack.toString()).isEqualTo("[10, 20]");
    }

    @Test
    void pop() {

        ListNodeStack listNodeStack = new ListNodeStack();
        listNodeStack.push(10);
        listNodeStack.push(20);
        listNodeStack.push(30);

        assertThat(listNodeStack.pop()).isEqualTo(30);
        assertThat(listNodeStack.getSize()).isEqualTo(2);
        assertThat(listNodeStack.toString()).isEqualTo("[10, 20]");
    }
}