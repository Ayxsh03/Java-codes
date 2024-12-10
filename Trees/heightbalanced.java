package Trees;

public class heightbalanced {
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        if(Math.abs(leftHeight-rightHeight)>1) return false;
        return isBalanced(root.left) && isBalanced(root.right);

    }
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }

    //Optimal
}
