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
     public void  helper(TreeNode node, List<Integer> arr){
        if(node == null) return ;
        helper(node.left,arr);
        arr.add(node.val);
        helper(node.right,arr);
        
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List <Integer> arr = new ArrayList<>();
         helper(root,arr);
        return arr;
    }
   
}