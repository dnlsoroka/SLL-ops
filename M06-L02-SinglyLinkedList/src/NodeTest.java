import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Test.*;

class NodeTest {
@Test
    public void testConstructor() {
    Node<String> stringNode = new Node<>("data");
    assertEquals("data", stringNode.data);

    Node<Integer> intNode = new Node<>(1);
    assertEquals(1, intNode.data);
    }
}