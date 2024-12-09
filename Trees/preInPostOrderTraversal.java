package Trees;
import java.util.*;
public class preInPostOrderTraversal {
    
    public static List<List<Integer>> preInPostTraversal(TreeNode root) {
        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();

        if (root == null) return new ArrayList<>();
        Stack<Pair<TreeNode, Integer>> st = new Stack<>();
        st.push(new Pair<>(root, 1));
        
        while(!st.empty()){
            Pair<TreeNode, Integer> it = st.pop();
            if (it.getValue() == 1) {
                // Store the node's data in the preorder traversal
                pre.add(it.getKey().val);
                // Move to state 2 (inorder) for this node
                it.setValue(2);
                // Push the updated state back onto the stack
                st.push(it);
                // Push left child onto the stack for processing
                if (it.getKey().left != null) {
                    st.push(new Pair<>(it.getKey().left, 1));
                }
            }

            // this is a part of in
            else if (it.getValue() == 2) {
                in.add(it.getKey().val);
                it.setValue(3);
                st.push(it);
                if (it.getKey().right != null) {
                    st.push(new Pair<>(it.getKey().right, 1));
                }
            }
            else {
                post.add(it.getKey().val);
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(pre);
        result.add(in);
        result.add(post);
        return result;
    }
}
