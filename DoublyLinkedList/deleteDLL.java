package DoublyLinkedList;

public class deleteDLL {
    public static NodeD<Integer> deleteHead(NodeD<Integer> head){
        if(head==null || head.next==null){
            return null;
        }
        NodeD<Integer> temp=head;
        head=head.next;
        head.prev=null;
        temp.next=null;
        return head;
    }

    public static NodeD<Integer> deleteTail(NodeD<Integer> head){
        if(head==null || head.next==null){
            return null;
        }
        NodeD<Integer> tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }
        NodeD<Integer> temp=tail.prev;
        temp.next=null;
        tail.prev=null;
        return head;
    }

    public static NodeD<Integer> deleteK(NodeD<Integer> head, int k){ //1Based Indexing sol
        if (head == null || k <= 0) return head;
        int count=0; 
        NodeD<Integer> temp=head;
        while(temp!=null){
            count++;
            if(count==k) break;
            temp=temp.next;
        }
        if (temp == null) return head;
        NodeD<Integer> back=temp.prev;
        NodeD<Integer> front= temp.next;
        if(back==null && front==null){
            return null;
        }
        else if(back==null){
            head=head.next;
            head.prev=null;
            return head;
        }
        else if(front==null){
            back.next=null;
            temp.prev=null;
            return head;
            
        }
        back.next=front;
        front.prev=back;
        temp.next=null;
        temp.prev=null;
        return head;
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
        head=deleteK(head, 7);
        while(head != null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
}
