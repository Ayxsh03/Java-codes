package LinkedList;
public class lengthLL {
    public static int length(Node<Integer> head){
        if(head==null){
            return 0;
        }
        Node<Integer> temp=head;
        int count=1;
        while (temp.next!=null) {
            temp=temp.next;
            count++;
        }
        return count;
    }
}
