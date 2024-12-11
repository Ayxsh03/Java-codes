package Trees;

import java.util.*;

public class boundaryTraversal {
    private boolean isLeaf(TreeNode node) {
        return (node.left == null && node.right == null);
    }

    private void addLeftBoundary(TreeNode node, List<Integer> boundary) {
        while (node != null) {
            if (!isLeaf(node)) boundary.add(node.val);
            node = (node.left != null) ? node.left : node.right;
        }
    }

    private void addRightBoundary(TreeNode node, List<Integer> boundary) {
        while (node != null) {
            if (!isLeaf(node)) boundary.add(node.val);
            node = (node.right != null) ? node.right : node.left;
        }
    }

    // Add all leaf nodes in left-to-right order
    private void addLeavesLR(TreeNode node, List<Integer> boundary) {
        if (node == null) return;
        if (isLeaf(node)) {
            boundary.add(node.val);
        } else {
            addLeavesLR(node.left, boundary);
            addLeavesLR(node.right, boundary);
        }
    }

    // Add all leaf nodes in right-to-left order
    private void addLeavesRL(TreeNode node, List<Integer> boundary) {
        if (node == null) return;
        if (isLeaf(node)) {
            boundary.add(node.val);
        } else {
            addLeavesRL(node.right, boundary);
            addLeavesRL(node.left, boundary);
        }
    }

    public List<Integer> AntiClockwise(TreeNode root) {
        List<Integer> boundary = new ArrayList<>();
        if (root == null) return boundary;

        boundary.add(root.val);
        addLeftBoundary(root.left, boundary);
        addLeavesLR(root, boundary);

        List<Integer> rightBoundary = new ArrayList<>();
        addRightBoundary(root.right,rightBoundary);
        Collections.reverse(rightBoundary);
        boundary.addAll(rightBoundary);

        return boundary;
    }

    public List<Integer> Clockwise(TreeNode root) {
        List<Integer> boundary = new ArrayList<>();
        if (root == null) return boundary;

        boundary.add(root.val);
        addRightBoundary(root.right, boundary);
        addLeavesRL(root, boundary);

        List<Integer> leftBoundary = new ArrayList<>();
        addLeftBoundary(root.left, leftBoundary);
        Collections.reverse(leftBoundary);
        boundary.addAll(leftBoundary);

        return boundary;
    }
}
