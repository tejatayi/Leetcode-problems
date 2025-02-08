//1161. Maximum Level Sum of a Binary Tree

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

public class problem1161 {

    public static int maxLevelSum(TreeNode root) {
        
        if(root==null)
        return 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int ans=Integer.MIN_VALUE;
        int cou=0;
        int ans1=0;
        while(!q.isEmpty())
        {
            cou++;
            int sz= q.size();
            int sum =0;
            for(int i=1; i<=sz; i++)
            {
                TreeNode curr = q.poll();

                sum+=curr.val;

                if(curr.right!=null)
                q.add(curr.right);
                if(curr.left!=null)
                q.add(curr.left);
            }

            if(ans<sum)
            {
                ans=sum;
                ans1=cou;
            }

        }

        return ans1;

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
        Integer[] treeArray = {1,7,0,7,-8,null,null};
        
        // Construct the tree
        TreeNode root = buildTree(treeArray);

       

       System.out.println(maxLevelSum(root));
       
    }
}
