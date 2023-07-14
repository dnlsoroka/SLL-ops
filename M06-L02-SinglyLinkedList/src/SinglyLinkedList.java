public class SinglyLinkedList<T extends Comparable<T>> {
    Node<T> head;

    public  SinglyLinkedList(){
        this.head = null;
    }

    //Write the enqueue method (which puts something at the back of the queue
    public void enqueue(T data){
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            // if list is empty new node becomes head
            head = newNode;
        } else {
            // ... otherwise last node is head
            Node<T> lastNode = head;
            while (lastNode.next != null) {
                // move to the last node
                lastNode = lastNode.next;
            }
            // append new node to lasts node's next ref
            lastNode.next = newNode;
        }
    }
    //Write the dequeue method (which takes something out from the front of the queue).
    public T dequeue() {
        if (head == null) {
            // if list is empty returns null
            return null;
        }

        Node<T> removedNode = head;
        // update head to the next node, remove first node
        head = head.next;
        // set next ref of removed node to null
        removedNode.next = null;
        //return data from removed node
        return removedNode.data;

    }
    public Node<T> delete(T data){
        Node<T> toDelete = null;

        if(this.head.data.compareTo(data) == 0){
            toDelete = this.head;
            this.head = this.head.next;
            return toDelete;
        }

        Node<T> current = this.head;
        while(current.next != null) {
            if(current.next.data.compareTo(data) == 0){
                toDelete = current.next;

                current.next = toDelete.next;
                toDelete.next = null;
                return toDelete;
            }
            current = current.next;
        }
        return toDelete;
    }

    public Node append(T data){
        Node<T> toAppend = new Node<>(data);

        if (this.head == null){
            this.head = toAppend;

            return this.head;
        }
        Node<T> lastNode = this.head;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = toAppend;
        return toAppend;
    }


    public boolean contains(T data){
    Node<T> toTest = this.head;

    while (toTest != null) {
        if (toTest.data.compareTo(data) == 0 ) {
            return true;
        }
        toTest = toTest.next;
    }
    return false;
    }


    @Override
    public String toString() {
        Node<T> toPrint = this.head;

        StringBuilder stringBuilder = new StringBuilder();

        while (toPrint != null) {

            stringBuilder.append(toPrint.data);
            stringBuilder.append(" -> ");

            toPrint = toPrint.next;
        }

        stringBuilder.append("NULL");

        return stringBuilder.toString();
    }

}
