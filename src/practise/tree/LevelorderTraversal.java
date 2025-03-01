package practise.tree;

import java.util.LinkedList;
import java.util.Queue;

// Level order traversal of binary tree is a level by level traversal.
public class LevelorderTraversal {
    // Traverse BTree level by level
    public static void levelOrderTraversal(TreeNode root) {
        if (root == null) {
            // if the tree is empty return;
            return;
        }
        // Create a queue to store nodes during traversal
        Queue<TreeNode> queue = new LinkedList<>();
        // Add the root node to the queue
        queue.add(root);

        while (!queue.isEmpty()) {
            // Get the number of nodes at the current level
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                // Remove a node from the queue and print it
                TreeNode node = queue.remove();
                System.out.print(node.data + " ");

                // Add the left and right child of the removed node to the queue
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println("Levelorder traversal of binary tree is ");
        levelOrderTraversal(root);
    }
}
