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

public class problem450 {
    
    public static TreeNode findMin(TreeNode root)
    {
        if(root==null || root.left==null)
        return root;

        return findMin(root.left);

    }

    public static TreeNode deleteNode(TreeNode root, int key) {

        if(root == null)
        return root;

        if(key<root.val)
        root.left =deleteNode(root.left, key);
        else if(key>root.val)
        root.right =deleteNode(root.right, key);
        if(root.val==key)
        {
            if(root.left==null && root.right==null)
            {
                root=null;
                return root;
            }

           else if(root.left==null)
            {
                root=root.right;
                return root;
            }

           else if(root.right==null)
            {
                root=root.left;
                return root;
            }
            else
            {
                TreeNode tem = findMin(root.right);
                root.val=tem.val;
                root.right=deleteNode(root.right, tem.val);
            }

        
        }

        return root;
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
        Integer[] treeArray = {1,2,3,4,null,null,null,5};
        
        // Construct the tree
        TreeNode root = buildTree(treeArray);

       

       System.out.println();
       
    }

}
