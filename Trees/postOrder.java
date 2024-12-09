package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class postOrder {
    //Recursive
    List<Integer> postorderTraverse(TreeNode root,List<Integer> list) {
        if(root==null) return list;
        postorderTraverse(root.left,list);
        postorderTraverse(root.right,list);
        list.add(root.val);
        return list;
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        list = postorderTraverse(root,list);
        return list;
    }

    //Iterative Using 2 stacks
    public List<Integer> postorderTrav(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null) return ans;

        Stack<TreeNode> st1=new Stack<>();
        Stack<TreeNode> st2=new Stack<>();
        st1.push(root);
        while(!st1.isEmpty()){
            root=st1.pop();
            st2.push(root);
            if(root.left!=null) st1.push(root.left);
            if(root.right!=null) st1.push(root.right);
        }
        while(!st2.isEmpty()){
            ans.add(st2.pop().val);
        }
        return ans;
    }
}
