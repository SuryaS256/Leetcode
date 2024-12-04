class Solution 
{
    public boolean isMajorityElement(int[] nums, int target) 
    {
        int firstIndex = firstOccurrence(nums, target);
        int lastIndex = lastOccurrence(nums, target);
        if(lastIndex-firstIndex>=nums.length / 2)
            return true;
        return false;
    }
    public int firstOccurrence(int[] nums,int target)
    {
        int index=-1;
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]>target)
            {
                high=mid-1;
            }
            else if(nums[mid]<target)
            {
                low=mid+1;
            }
            else
            {
                index=mid;
                high=mid-1;
            }
        }
        return index;
    }
    public int lastOccurrence(int[] nums,int target)
    {
        int index=-1;
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]>target)
            {
                high=mid-1;
            }
            else if(nums[mid]<target)
            {
                low=mid+1;
            }
            else
            {
                index=mid;
                low=mid+1;
            }
        }
        return index;
    }
}