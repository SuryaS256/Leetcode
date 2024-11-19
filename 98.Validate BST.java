class Solution 
{
    public boolean isValidBST(TreeNode root)
    {
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
        return validate(root,min,max);
    }
    public boolean validate(TreeNode root,int min,int max)
    {
        if(root==null)
            return true;
        return ((root.val>min)&&(root.val<max)&&
            validate(root.left,min,root.val) &&
                    validate(root.right,root.val,max));
    }
}