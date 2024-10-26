/*Given the head of a singly linked list, group all the nodes with odd indices together followed 
by the nodes with even indices, and return the reordered list.
The first node is considered odd, and the second node is even, and so on.
Note that the relative order inside both the even and odd groups should remain as it was in the input.
You must solve the problem in O(1) extra space complexity and O(n) time complexity.

Input: head = [1,2,3,4,5]
Output: [1,3,5,2,4]

Input: head = [2,1,3,5,6,4,7]
Output: [2,3,6,7,1,5,4] */
package LinkedList;

public class odd_even {
    public Node<Integer> oddEvenList(Node<Integer> head) {
        if (head == null || head.next == null) return head;
        Node<Integer> dummy=new Node<Integer>(-1);
        Node<Integer> current=dummy;
        Node<Integer> odd=head;
        Node<Integer> even=head.next;
        while(odd!=null && odd.next!=null){
            Node<Integer> newNode=new Node<Integer>(odd.data);
            current.next=newNode;
            current=current.next;
            odd=odd.next.next;
        }
        if(odd!=null){
            Node<Integer> newNode=new Node<Integer>(odd.data);
            current.next=newNode;
            current=current.next;
        }
        while(even!=null && even.next!=null){
            Node<Integer> newNode=new Node<Integer>(even.data);
            current.next=newNode;
            current=current.next;
            even=even.next.next;
        }
        if(even!=null){
            Node<Integer> newNode=new Node<Integer>(even.data);
            current.next=newNode;
            current=current.next;
        }
        return dummy.next;
    }
    //optimal
    public Node<Integer> oddEven(Node<Integer> head) {
        if (head == null || head.next == null) return head;
        Node<Integer> odd = head;
        Node<Integer> even = head.next;
        Node<Integer> evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next; 
            odd = odd.next; 
            even.next = odd.next; 
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
