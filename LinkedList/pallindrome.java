package LinkedList;

public class pallindrome {
    public Node<Integer> reverseLinkedList(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node<Integer> newHead = reverseLinkedList(head.next);
        Node<Integer> front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }
    public boolean isPalindrome(Node<Integer> head) {
        if (head == null || head.next == null) {
            return true;
        }
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node<Integer> newHead = reverseLinkedList(slow.next);
        Node<Integer> first = head;
        Node<Integer> second = newHead;
        while (second != null) {
            if (first.data != second.data) {
                reverseLinkedList(newHead);
                return false;
            }
            first = first.next;
            second = second.next;
        }
        reverseLinkedList(newHead);
        return true;
    }
}
