/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    
    public List<Integer> preorderTraversal(TreeNode root) {
       Stack<TreeNode> stack = new Stack<>();
       List<Integer> res = new ArrayList<Integer>();
        if(root == null) {
            return res;
        }
        stack.push(root);
        while(!stack.empty()){
            TreeNode node = stack.pop();
            res.add(node.val);
            if(node.right != null) {
                stack.push(node.right);
            }
            if(node.left != null) {
                stack.push(node.left);
            }
        }
        return res;
    }
}

public class Solution {
    
    public List<Integer> preorderTraversal(TreeNode root) {
       Stack<TreeNode> stack = new Stack<>();
       List<Integer> res = new ArrayList<Integer>();
        if(root == null) {
            return res;
        }
        stack.push(root);
        while(!stack.empty()){
            TreeNode node = stack.pop();
            res.add(node.val);
            if(node.right != null) {
                stack.push(node.right);
            }
            if(node.left != null) {
                stack.push(node.left);
            }
        }
        return res;
    }
}
