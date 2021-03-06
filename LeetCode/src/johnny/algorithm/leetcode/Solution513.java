package johnny.algorithm.leetcode;

import johnny.algorithm.leetcode.common.TreeNode;

/**
 * Find Bottom Left Tree Value
 * 
 * Given a binary tree, find the leftmost value in the last row of the tree.
 * 
 * Example 1:
 * Input:
 * 
 *   2
 *  / \
 * 1   3
 * 
 * Output:
 * 1
 * 
 * Example 2: 
 * Input:
 * 
 *      1
 *     / \
 *    2   3
 *   /   / \
 *  4   5   6
 *     /
 *    7
 * 
 * Output:
 * 7
 * 
 * Note: You may assume the tree (i.e., the given root node) is not NULL.
 * 
 * @author Johnny
 */
public class Solution513 {
    public int findBottomLeftValue(TreeNode root) {
        return findBottomLeftValue(root, 1, new int[]{0,0});
    }
    private int findBottomLeftValue(TreeNode root, int depth, int[] res) {
        if (res[1] < depth) {
            res[0] = root.val;
            res[1] = depth;
        }
        if (root.left != null) {
            findBottomLeftValue(root.left, depth + 1, res);
        }
        // If found in the left child, then the right child will be ignored.
        if (root.right != null) {
            findBottomLeftValue(root.right, depth + 1, res);
        }
        return res[0];
    }
    
    public int findBottomRightValue(TreeNode root) {
        return findBottomRightValue(root, 1, new int[]{0,0});
    }
    private int findBottomRightValue(TreeNode root, int depth, int[] res) {
        if (res[1] < depth) {
            res[0] = root.val;
            res[1] = depth;
        }
        if (root.right != null) {
            findBottomRightValue(root.right, depth + 1, res);
        }
        // If found in the right child, then the left child will be ignored.
        if (root.left != null) {
            findBottomRightValue(root.left, depth + 1, res);
        }
        return res[0];
    }
}
