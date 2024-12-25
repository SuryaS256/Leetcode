class Solution 
{
    public List<Integer> largestValues(TreeNode root) 
    {
        List<Integer> res=new ArrayList<>();
        if(root==null)
            return res;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty())
        {
            int n=q.size();
            int max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++)
            {
                TreeNode k=q.poll();
                max=Math.max(max,k.val);
                if(k.left!=null)
                {
                    q.add(k.left);
                }
                if(k.right!=null)
                {
                    q.add(k.right);
                }     
            }
            res.add(max);
        }
        return res;        
    }
}