package DoublyLinkedList;

public class NodeD<T> {
    T data;
    NodeD<T> next;
    NodeD<T> prev;

    NodeD(T data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
