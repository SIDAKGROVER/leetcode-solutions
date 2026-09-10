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
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root==null)return false;
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Boolean findX=false;
            Boolean findY=false;
            int size=q.size();
            for(int i=0;i<size;i++){
               TreeNode curr=q.poll();
               if(curr.left!=null && curr.right!=null){
                if((curr.left.val==x && curr.right.val==y) || (curr.left.val==y && curr.right.val==x)){
                    return false;
                }
               } 
               if(curr.left!=null){
                if(curr.left.val==x)findX=true;
                if(curr.left.val==y)findY=true;
                q.add(curr.left);
               }
               if(curr.right!=null){
                if(curr.right.val==x)findX=true;
                if(curr.right.val==y)findY=true;
                q.add(curr.right);
               }
            }
            if (findX && findY) return true;
            if (findX || findY) return false;
        }
        return false;
    }
}