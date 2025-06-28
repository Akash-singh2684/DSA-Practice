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
    public List<List<Integer>> levelOrder(TreeNode root) {
         Queue<TreeNode> q = new LinkedList <>();
              List <List<Integer>> ans = new ArrayList<>();
              if(root == null){
                return ans;

              }
             
              q.offer(root);
              while(!q.isEmpty()){
                List<Integer> res = new ArrayList<>();
                int len = q.size();
                for(int i = 0;i <len;i++){
                    TreeNode node = q.poll();
                  res.add(node.val);
                   if(node.left != null){
                    q.offer(node.left);
                }
                if(node.right != null){
                    q.offer(node.right);
                }
              
              }
               ans.add(res);
                }
               
              return ans;

    }
}