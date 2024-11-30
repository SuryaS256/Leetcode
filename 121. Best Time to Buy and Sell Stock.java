class Solution 
{
    public int maxProfit(int[] a) 
    {
        int n=a.length;
        if(n==1)
            return 0;
        int min1=a[0];
        int profit=a[1]-a[0];
        for(int j=1;j<n;j++)
        {
            profit=Math.max(profit,a[j]-min1);
            min1=Math.min(min1,a[j]);
        }
        if(profit<0)
            return 0;
        return profit;
    }
}