package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class inOrder {
    //Recursive
    List<Integer> inorderTraverse(TreeNode root,List<Integer> list) {
        if(root==null) return list;
        inorderTraverse(root.left,list);
        list.add(root.val);
        inorderTraverse(root.right,list);
        return list;
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        list = inorderTraverse(root,list);
        return list;
    }

    //Iterative using 1 stack
    public List<Integer> inorderTrav(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            // Reach the leftmost node of the current subtree
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            // Process the top node in the stack
            current = stack.pop();
            result.add(current.val);

            // Explore the right subtree
            current = current.right;
        }
        return result;
    }
}
