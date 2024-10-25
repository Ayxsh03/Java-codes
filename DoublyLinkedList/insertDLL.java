package DoublyLinkedList;

public class insertDLL {
    public static NodeD<Integer> insertHead(NodeD<Integer> head, int data){
        NodeD<Integer> newNode=new NodeD<Integer>(data);
        newNode.next=head;
        head.prev=newNode;
        return newNode;
    }
    
    public static NodeD<Integer> insertTail(NodeD<Integer> head, int data){
        NodeD<Integer> newNode=new NodeD<Integer>(data);
        NodeD<Integer> temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
        return head;
    }

    public static NodeD<Integer> insertK(NodeD<Integer> head, int data, int k){
        if(head==null){
            return null;
        }
        NodeD<Integer> newNode=new NodeD<Integer>(data);
        if(k<0){
            return head;
        }
        if(k==0){
            newNode.next=head;
            head.prev=newNode;
            return newNode;
        }
        int count=0;
        NodeD<Integer> temp=head;
        while (temp!=null) {
            count++;
            if(k==count) break;
            temp=temp.next;
        }
        
        if(temp.next==null){
            temp.next=newNode;
            newNode.prev=temp;
            return head;
        }
        NodeD<Integer> kNode=temp.next;
        newNode.next=kNode;
        temp.next=newNode;
        kNode.prev=newNode;
        newNode.prev=temp;

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
        head=insertK(head, 10, 10);
        while(head != null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }

}
