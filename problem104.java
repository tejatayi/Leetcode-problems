//Maximum Depth of Binary Tree

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    // Constructors
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class problem104 {
    public static int maxDepth(TreeNode node) {
        if (node == null) return 0;
        int l = maxDepth(node.right); // Right subtree depth
        int r = maxDepth(node.left);  // Left subtree depth
        return Math.max(l, r) + 1;
    }


    public static void main(String[] args) {
        // Creating a sample binary tree
        /*
                1
               / \
              2   3
             / \    \
            4   5    6
        */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        int depth = maxDepth(root);

        // Print the result
        System.out.println("Maximum depth of the tree: " + depth);
}
}
