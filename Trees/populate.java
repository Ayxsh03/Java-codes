package Trees;
import java.util.Scanner;
public class populate{

    private TreeNode root;

    public void insertElements(Scanner sc){
        System.out.println("Enter Root Node: ");
        int value= sc.nextInt();
        root=new TreeNode(value);
        insertElements(sc,root);
    }

    private void insertElements(Scanner sc, TreeNode node){
        System.out.println("Insert Left of "+ node.val);
        boolean left = sc.nextBoolean();
        if(left){
            System.out.println("Enter value to the left of"+ node.val);
            int value = sc.nextInt();
            node.left = new TreeNode(value);
        }
        System.out.println("Insert Right of "+ node.val);
        boolean right = sc.nextBoolean();
        if(right){
            System.out.println("Enter value to the right of"+ node.val);
            int value = sc.nextInt();
            node.right = new TreeNode(value);
        }

    }

}
