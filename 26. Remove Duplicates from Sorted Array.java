class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
        int res=1;
        int n=nums.length;
        for(int i=1;i<n;i++)
        {
            if(nums[i]!=nums[res-1])
            {
                nums[res]=nums[i];
                res++;
            }
        }
        return res;
    }
}