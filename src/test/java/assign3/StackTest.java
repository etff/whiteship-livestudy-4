package assign3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class StackTest {

    @Test
    void push() {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertThat(stack.peek()).isEqualTo(3);
        assertThat(stack.size()).isEqualTo(3);
    }

    @Test
    void pop() {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);

        assertThat(stack.pop()).isEqualTo(2);
        assertThat(stack.size()).isEqualTo(1);
    }
}