class Solution 
{
    public int waysToSplitArray(int[] nums) 
    {
        int n=nums.length;
        long[] prefix=new long[n];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++)
        {
            prefix[i]=prefix[i-1]+nums[i];
        }   
        long lsum=0;
        int count=0;
        for(int i=0;i<n-1;i++)
        {
            lsum+=nums[i];
            Long rsum=prefix[n-1]-prefix[i];
            if(lsum>=rsum)
                count++;
        }
        return count;
    }
}