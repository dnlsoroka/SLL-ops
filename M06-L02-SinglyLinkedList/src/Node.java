public class Node<T extends Comparable<T>> {
    public T data;
    Node<T> next;

    public Node(T data){
        this.data =data;
        this.next = null;
    }

    @Override
    public String toString(){
        return data.toString();
    }
}
