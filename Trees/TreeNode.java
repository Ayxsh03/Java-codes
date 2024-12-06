package Trees;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {} //Creates an empty node.
    TreeNode(int val) {  //Creates a node with a specified value.
        this.val = val;
    } 
    TreeNode(int val, TreeNode left, TreeNode right) { //Creates a node with a value and links to its children.
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
