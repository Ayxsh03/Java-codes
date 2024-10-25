package DoublyLinkedList;

public class arrayDLL {
    public static NodeD<Integer> convertDLL(int[]arr){
        NodeD<Integer> head=new NodeD<Integer>(arr[0]);
        NodeD<Integer> previous=head;
        for(int i=1; i<arr.length; i++){
            NodeD<Integer> temp=new NodeD<Integer>(arr[i]);
            previous.next=temp;
            temp.prev=previous;
            previous=previous.next;
        }
        return head;

    }
}
