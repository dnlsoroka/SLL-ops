import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {

    @Test
    public void testConstructor(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        assertNull(sll.head);
    }

    @Test
    public void testAppend(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        assertNull(sll.head);
        sll.append(1);
        assertEquals(1, sll.head.data);
        sll.append(2);
        sll.append(3);
        assertEquals(2, sll.head.next.data);
        assertEquals(3, sll.head.next.next.data);
    }
    @Test
    public void testToString(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        assertNull(sll.head);
        assertEquals("NULL", sll.toString());
        sll.append(1);
        assertEquals("1 -> NULL", sll.toString());
        assertEquals(1, sll.head.data);
        sll.append(2);
        assertEquals("1 -> 2 -> NULL", sll.toString());
        sll.append(3);
        assertEquals("1 -> 2 -> 3 -> NULL", sll.toString());
        assertEquals(2, sll.head.next.data);
        assertEquals(3, sll.head.next.next.data);
    }

    @Test
    public void testContains(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        sll.append(1);
        sll.append(2);
        sll.append(3);
        assertFalse(sll.contains(4));
        assertTrue(sll.contains(1));
        assertTrue(sll.contains(2));
        assertTrue(sll.contains(3));
    }
    @Test
    public void testDelete(){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        sll.append(1);
        sll.append(2);
        sll.append(3);
        sll.append(5);
        assertNull(sll.delete(4));
        assertEquals(1,sll.delete(1).data);

    }
    // ASSIGNMENT TESTS
    @Test
    public void testEnqueue() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        sll.enqueue(5);
        sll.enqueue(10);
        sll.enqueue(15);

        // Assert that the elements are enqueued correctly
        Assertions.assertEquals("5 -> 10 -> 15 -> NULL", sll.toString());
    }

    @Test
    public void testDequeue() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        sll.enqueue(6);
        sll.enqueue(7);
        sll.enqueue(8);

        int removedElement = sll.dequeue();

        // Assert that the element is dequeued correctly
        assertEquals(6, removedElement);
        // Assert that the list is updated after dequeuing
        Assertions.assertEquals("7 -> 8 -> NULL", sll.toString());
    }


}