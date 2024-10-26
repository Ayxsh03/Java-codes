package LinkedList;

public class sort012 {
    public static Node<Integer> seperate012(Node<Integer> head) {
        int zero=0,one=0,two=0;
        Node<Integer> current=head;
        while(current!=null){
            if(current.data==0)
            zero++;
            else if(current.data==1)
            one++;
            else
            two++;
            current=current.next;
        }
        current=head;
        while(current!=null){
            if(zero>0){
                current.data=0;
                zero--;
            }
            else if(one>0){
                current.data=1;
                one--;
            }
            else if(two>0){
                current.data=2;
                two--;
            }
            current=current.next;
        }
        return head;
    }

    public static Node<Integer> segregate(Node<Integer> head) {
        Node<Integer> zerohead=new Node<Integer>(-1);
        Node<Integer> onehead=new Node<Integer>(-1);
        Node<Integer> twohead=new Node<Integer>(-1);
        Node<Integer> zero=zerohead;
        Node<Integer> one=onehead;
        Node<Integer> two=twohead;
        Node<Integer> temp=head;
        while(temp!=null){
            if(temp.data==0){
                zero.next=temp;
                zero=zero.next;
            }
            
            else if(temp.data==1){
                one.next=temp;
                one=one.next;
            }
            else{
                two.next=temp;
                two=two.next;
            }
            temp=temp.next;
        }
        if(onehead.next!=null){
            zero.next=onehead.next;
        }
        else{
            zero.next=twohead.next;
        }
        one.next=twohead.next;
        two.next=null;
        return zerohead.next;
    }
}
