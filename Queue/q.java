package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class q {
    public static void main(String[] args) {
        //Queue is an interface and needs a class to be implemented
        Queue<String> q = new LinkedList<>();
        q.add("apple");
        q.add("banana");
        q.add("cherry");
        System.out.println("Queue: " + q);
        q.remove();
        System.out.println("Queue after removal: " + q);
        q.remove();
        System.out.println("Peeked element: " + q.peek());
        q.add("watermelon");
        System.out.println("Queue after peek: " + q);
        System.out.println(q.size());
    }
}
