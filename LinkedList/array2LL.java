package LinkedList;

public class array2LL {
    public static Node<Integer> array2ll(int arr[]){
        Node<Integer> head=new Node<Integer>(arr[0]);
        Node<Integer> mover=head;
        for(int i=1;i<arr.length;i++){
            Node<Integer> temp=new Node<Integer>(arr[i]);
            mover.next=temp;
            mover=mover.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        Node<Integer> head=array2ll(arr);
        while(head != null){
            System.out.print(head.data+"->");
            head=head.next;
        }
    }
}
