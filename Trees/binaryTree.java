package Trees;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class binaryTree {
    private TreeNode root;

    public void insertElements(Scanner sc) {
        System.out.print("Enter Root Node Value: ");
        int value = sc.nextInt();
        root = new TreeNode(value);

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            // Insert Left Child
            System.out.print("Insert Left of " + current.val + "? (true/false): ");
            if (sc.nextBoolean()) {
                System.out.print("Enter value to the left of " + current.val + ": ");
                int leftValue = sc.nextInt();
                current.left = new TreeNode(leftValue);
                queue.add(current.left); // Add the left child to the queue
            }

            // Insert Right Child
            System.out.print("Insert Right of " + current.val + "? (true/false): ");
            if (sc.nextBoolean()) {
                System.out.print("Enter value to the right of " + current.val + ": ");
                int rightValue = sc.nextInt();
                current.right = new TreeNode(rightValue);
                queue.add(current.right); // Add the right child to the queue
            }
        }
    }

    public void preOrder(TreeNode node) {
        if (node == null) return;
        System.out.println(node.val); // Pre-order traversal
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder(TreeNode node) {
        if (node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.val); // Pre-order traversal
    }

    public void inOrder(TreeNode node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.println(node.val); // Pre-order traversal
        inOrder(node.right);
    }

    public TreeNode getRoot() {
        return root;
    }
}