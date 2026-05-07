/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    int maxDiemeter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        
        calculateDepth(root);
            return maxDiemeter;
        }
        private int calculateDepth(TreeNode root){
            if(root == null){
                return 0;
            }
            int leftDepth = calculateDepth(root.left);
            int rightDepth = calculateDepth(root.right);

            maxDiemeter = Math.max(maxDiemeter, leftDepth + rightDepth); 

            return Math.max(leftDepth, rightDepth) + 1;

        }
    }

