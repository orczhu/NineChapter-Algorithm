public class Solution {
    
    private class ResultType{
        boolean isBST;
        long minValue, maxValue;
        
        private ResultType(long maxValue, long minValue, boolean isBST) {
            this.minValue = minValue;
            this.maxValue = maxValue;
            this.isBST = isBST;
        }
    }
    
    private ResultType helper(TreeNode root) {
        if(root == null) {
            return new ResultType(Long.MIN_VALUE, Long.MAX_VALUE, true);
        }
        
        ResultType left = helper(root.left);
        ResultType right = helper(root.right);
        
        if(!left.isBST || !right.isBST || (root.left != null && left.maxValue >= root.val) || (root.right != null && right.minValue <= root.val)) {
            return new ResultType(Long.MIN_VALUE, Long.MAX_VALUE, false);
        }
        
        return new ResultType(Math.max(right.maxValue, root.val),Math.min(left.minValue, root.val) , true);
    }
    public boolean isValidBST(TreeNode root) {
        return helper(root).isBST;
    }
}

# it has corner case like single root node with max or min value
# make sure when comparing (root.left != null && left.maxValue >= root.val) || (root.right != null && right.minValue <= root.val)
