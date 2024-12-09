package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class preOrder {
    //Recursive
    List<Integer> preorderTrav(TreeNode root,List<Integer> list) {
        if(root==null) return list;
        list.add(root.val);
        preorderTrav(root.left,list);
        preorderTrav(root.right,list);
        return list;
    }
    public List<Integer> preorderTrav(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        list = preorderTrav(root,list);
        return list;
    }

    //Iterative using 1 stack
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        Stack<TreeNode> st=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            root=st.pop();
            ans.add(root.val);
            if(root.right!=null) st.add(root.right);
            if(root.left!=null) st.add(root.left);
        }
        return ans;
    }
}
