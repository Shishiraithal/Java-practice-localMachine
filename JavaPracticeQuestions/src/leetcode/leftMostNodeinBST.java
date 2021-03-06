package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class leftMostNodeinBST {
 
  
    public static void main(String[] args) {
        
         TreeNode treeRoot = new TreeNode(2);
        treeRoot.left.val = new Integer(3);
        treeRoot.right.val = new Integer(3);

        leftMostNodeinBST leftMostNode = new leftMostNodeinBST();

        int result = leftMostNode.findLeftMostValue(treeRoot);
    }

    public int findLeftMostValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        while (!queue.isEmpty()) {
            root = queue.poll();
            if (root != null) {
                queue.offer(root.right);
            }
            if (root != null) {
                queue.offer(root.left);
            }
        }
        return root.val;
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

