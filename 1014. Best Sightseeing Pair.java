class Solution 
{
    public int maxScoreSightseeingPair(int[] values) 
    {
        int n=values.length;
        int dp[]=new int[n-1];
        dp[0]=values[0]+0;
        int res=Integer.MIN_VALUE;
        for(int i=1;i<n-1;i++)
        {
            int res1=values[i]+i;
            dp[i]=Math.max(dp[i-1],res1);
        }
        for(int j=1;j<n;j++)
        {
            int k=values[j]-j;
            res=Math.max(res,k+dp[j-1]);
        }
        return res;
    }
}