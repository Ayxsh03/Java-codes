package LinkedList;
public class insertLL {
    
    public static Node<Integer> insert(Node<Integer> head, int data, int k){
        Node<Integer> newNode=new Node<Integer>(data);
        if(head==null){
            if(k==1) return newNode;
            else return null;
        }
        if(k==1){
            newNode.next=head;
            return newNode; //new head of list
        }
        int count=0;
        Node<Integer> temp = head;
        while(temp!=null){
            count++;
            if(count==k-1){
                newNode.next=temp.next;
                temp.next=newNode;
                break;
            }
            temp=temp.next;
        }
        return head;
    }
    
}
