//437. Path Sum III

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}

public class problem437 {

    public static int traverse(TreeNode r , int targetSum, HashMap<Long,Integer> hm , long runsum)
    {
        if(r==null)
        return 0;

        runsum+=r.val;
        
        int count = hm.getOrDefault(runsum-targetSum, 0);

        hm.put(runsum, hm.getOrDefault(runsum, 0)+1);

        count+= traverse(r.left, targetSum, hm, runsum)+traverse(r.right, targetSum, hm, runsum);

        hm.put(runsum, hm.get(runsum) - 1);

        return count ;
    }

    public static int pathSum(TreeNode root, int targetSum) {
       
        HashMap<Long,Integer> hm = new HashMap<>();
        hm.put((long)0, 1); 
        

        return traverse(root, targetSum,hm,0);
    }

    // Function to build a binary tree from an array (Level-Order Representation)
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
        Integer[] treeArray = {10, 5, -3, 3, 2, null, 11, 3, -2, null, 1};
        
        // Construct the tree
        TreeNode root = buildTree(treeArray);

        System.out.println(root.val);

       System.out.println(pathSum(root, 8));
       
    }
}