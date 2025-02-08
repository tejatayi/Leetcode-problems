//700. Search in a Binary Search Tree

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

public class problem700 {
    
    
    public static TreeNode searchBST(TreeNode root, int val) {
        if(root==null)
        {
            return null;
        }
        if(root.val==val)
        return root;
        
        if(val>root.val && root.right!=null)
        return searchBST(root.right, val);
        
        return searchBST(root.left, val);
        
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

    public static void printTree(TreeNode root) {
        if (root == null) {
            System.out.println("The tree is empty.");
            return;
        }
        
        // Initialize the queue and add the root node.
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        // Continue until there are no more nodes to process.
        while (!queue.isEmpty()) {
            // Number of nodes at the current level.
            int levelSize = queue.size();
            
            // Process all nodes on the current level.
            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();
                System.out.print(current.val + " ");
                
                // Enqueue left child if it exists.
                if (current.left != null) {
                    queue.offer(current.left);
                }
                // Enqueue right child if it exists.
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
            // After processing the current level, move to a new line.
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Integer[] treeArray = {4,2,7,1,3};
        
        // Construct the tree
        TreeNode root = buildTree(treeArray);
        
        printTree(searchBST(root, 2));
       
    }
}
