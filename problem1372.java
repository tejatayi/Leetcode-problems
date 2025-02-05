//1372. Longest ZigZag Path in a Binary Tree

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode() {}
    
    TreeNode(int val) { 
        this.val = val; 
    }
    
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class problem1372 {
    

    
        public static int traverse(TreeNode t,int count, boolean isLeft)
        {
            if(t==null)
            return count-1;
    
    

        if(isLeft)
        {
           return Math.max(traverse(t.right, count+1, false), traverse(t.left, 1, true)) ;
            
        }
        else
        {
            return Math.max(traverse(t.left, count+1, true), traverse(t.right, 1, false));
        }

    }



    public static int longestZigZag(TreeNode root) {
        

        return Math.max(traverse(root.left,1,true), traverse(root.right, 1, false)) ;
    }





    public static TreeNode buildTree(Integer[] arr) {
        if (arr.length == 0 || arr[0] == null) return null;

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (!queue.isEmpty() && i < arr.length) {
            TreeNode current = queue.poll();

            // Left child
            if (i < arr.length && arr[i] != null) {
                current.left = new TreeNode(arr[i]);
                queue.add(current.left);
            }
            i++;

            // Right child
            if (i < arr.length && arr[i] != null) {
                current.right = new TreeNode(arr[i]);
                queue.add(current.right);
            }
            i++;
        }

        return root;
    }


    public static void main(String[] args) {
        Integer[] treeArray = {1,1,1,null,1,null,null,1,1,null,1};
        
        // Construct the tree
        TreeNode root = buildTree(treeArray);

       

       System.out.println(longestZigZag(root));
       
    }



}
