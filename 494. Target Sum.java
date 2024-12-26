//Recursion
class Solution 
{
    public int findTargetSumWays(int[] nums, int target) 
    {
        int currSum=0;
        int start=0;
        int solve=check(nums,start,currSum,target);
        return solve;        
    }
    public static int check(int[] nums,int start,int currSum,int target)
    {
        if(start==nums.length)
        {
            if(currSum==target)
                return 1;
            else
                return 0;
        }
        int plus=check(nums, start+1, currSum+nums[start], target);
        int minus=check(nums, start+1, currSum-nums[start], target);
        return plus+minus;
    }  
}