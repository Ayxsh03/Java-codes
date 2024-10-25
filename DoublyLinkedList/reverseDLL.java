package DoublyLinkedList;

public class reverseDLL {
    public static NodeD<Integer> reverse(NodeD<Integer> head){
        if(head==null || head.next==null){
            return head;
        }
        NodeD<Integer> current=head;
        NodeD<Integer> back=null;
        while(current!=null){
            back=current.prev;
            //Swap
            current.prev=current.next;
            current.next=back;
            //Traversal
            current=current.prev;
        }
        return back.prev;
    }

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

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        NodeD<Integer> head=convertDLL(arr);
        head=reverse(head);
        while(head != null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
}
