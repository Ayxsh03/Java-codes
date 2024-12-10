package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class boundaryTraversal {
    private boolean isLeaf(TreeNode node) {
        return (node.left == null && node.right == null);
    }

    // Add left boundary excluding leaves
    private void addLeftBoundary(TreeNode node, List<Integer> boundary) {
        while (node != null) {
            if (!isLeaf(node)) boundary.add(node.val);
            node = (node.left != null) ? node.left : node.right;
        }
    }

    // Add right boundary excluding leaves (in reverse order)
    private void addRightBoundary(TreeNode node, List<Integer> boundary) {
        Stack<Integer> stack = new Stack<>();
        while (node != null) {
            if (!isLeaf(node)) stack.push(node.val);
            node = (node.right != null) ? node.right : node.left;
        }
        while (!stack.isEmpty()) {
            boundary.add(stack.pop());
        }
    }

    // Add all leaf nodes in left-to-right order
    private void addLeaves(TreeNode node, List<Integer> boundary) {
        if (node == null) return;
        if (isLeaf(node)) {
            boundary.add(node.val);
        } else {
            addLeaves(node.left, boundary);
            addLeaves(node.right, boundary);
        }
    }

    // Anticlockwise boundary traversal
    public List<Integer> printBoundaryAnticlockwise(TreeNode root) {
        List<Integer> boundary = new ArrayList<>();
        if (root == null) return boundary;

        // Add root (if not a leaf)
        if (!isLeaf(root)) boundary.add(root.val);

        // Add left boundary
        addLeftBoundary(root.left, boundary);

        // Add all leaf nodes
        addLeaves(root, boundary);

        // Add right boundary (in reverse)
        addRightBoundary(root.right, boundary);

        return boundary;
    }

    // Clockwise boundary traversal
    public List<Integer> printBoundaryClockwise(TreeNode root) {
        List<Integer> boundary = new ArrayList<>();
        if (root == null) return boundary;

        // Add root (if not a leaf)
        if (!isLeaf(root)) boundary.add(root.val);

        // Add right boundary
        addRightBoundary(root.right, boundary);

        // Add all leaf nodes
        addLeaves(root, boundary);

        // Add left boundary (in reverse)
        addLeftBoundary(root.left, boundary);

        return boundary;
    }
}
