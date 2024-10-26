/*
You are given two non-empty linked lists representing two non-negative integers. The digits are 
stored in reverse order, and each of their nodes contains a single digit. 
Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.
Example 1:Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
 */
package LinkedList;

public class addTwoNumbers {
    public Node<Integer> add2Numbers(Node<Integer> l1, Node<Integer> l2) {
        Node<Integer> dummy = new Node<Integer>(-1);
        Node<Integer> current = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 != null) ? l1.data : 0;
            int val2 = (l2 != null) ? l2.data : 0;
            int total = val1 + val2 + carry;
            carry = total / 10;
            int data = total % 10;
            current.next = new Node<Integer>(data);
            current = current.next;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        return dummy.next;
    }
}
